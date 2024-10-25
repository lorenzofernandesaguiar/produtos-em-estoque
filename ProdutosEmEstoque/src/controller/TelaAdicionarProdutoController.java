package controller;

import dao.ProdutoDao;
import javax.swing.JOptionPane;
import view.TelaAdicionarProduto;
import java.sql.Connection;
import dao.Conexao;
import java.sql.SQLException;
import model.Produto;

public class TelaAdicionarProdutoController {
    private TelaAdicionarProduto view;

    public TelaAdicionarProdutoController(TelaAdicionarProduto view) {
        this.view = view;
    }

    public void cancelar() {
        this.view.dispose();
    }

    public void adicionar() throws SQLException {
        String descricao = this.view.getTextFieldDescricaoProduto().getText().toUpperCase();
        if(descricao.isBlank()) {
            JOptionPane.showMessageDialog(view, "Você deve preencher o campo referente à descrição do produto!");
        } else {
            if(descricao.length() < 3 || descricao.length() > 24) {
                JOptionPane.showMessageDialog(view, "A descrição do produto deve conter, no mínimo, 3 caracteres e, no máximo, 24 caracteres!\nATENÇÃO: Cada espaço em branco é considerado um caractere!");
            } else {
                Connection connection = new Conexao().getConnection();
                ProdutoDao produtoDao = new ProdutoDao(connection);
                if(produtoDao.existeEstaDescricaoNoBancoDeDados(descricao)) {
                    JOptionPane.showMessageDialog(view, "Esta descrição não está disponível!");
                } else {
                    Produto produto = new Produto();
                    produto.setDescricao(descricao);
                    produtoDao.adicionarProdutoNoBancoDeDados(produto);
                    JOptionPane.showMessageDialog(view, "Produto adicionado com sucesso!");
                    this.view.getTelaPrincipalController().atualizarLista();
                    this.view.dispose();
                }
            }
        }
    }
    
}