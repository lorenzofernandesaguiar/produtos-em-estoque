package controller;

import dao.Conexao;
import dao.ProdutoDao;
import view.TelaRemoverProduto;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaRemoverProdutoController {
    private TelaRemoverProduto view;

    public TelaRemoverProdutoController(TelaRemoverProduto view) {
        this.view = view;
    }

    public void cancelar() {
        this.view.dispose();
    }
    
    public void inicializacao() {
        this.view.getLabelProdutoSelecionado().setText("<html>Produto que está selecionado:<br/><strong>" + this.view.getTelaPrincipalController().getView().getListListaDeProdutosEmEstoque().getSelectedValue() + "</strong></html>");
    }
    
    public void remover() throws SQLException {
        Connection connection = new Conexao().getConnection();
        ProdutoDao produtoDao = new ProdutoDao(connection);
        produtoDao.remover(this.view.getTelaPrincipalController().getView().getListListaDeProdutosEmEstoque().getSelectedValue());
        JOptionPane.showMessageDialog(view, "Produto removido com sucesso!");
        this.view.getTelaPrincipalController().atualizarLista();
        this.view.dispose();
    }
    
}
