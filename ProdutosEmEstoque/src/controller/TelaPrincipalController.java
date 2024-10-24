package controller;

import dao.Conexao;
import dao.ProdutoDao;
import javax.swing.JLabel;
import view.TelaAdicionarProduto;
import view.TelaPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import model.Produto;
import view.TelaRemoverProduto;

public class TelaPrincipalController {
    private TelaPrincipal view;

    public TelaPrincipalController(TelaPrincipal view) {
        this.view = view;
    }

    public void revelarContainerCinza(JLabel containerBranco) {
        containerBranco.setVisible(false);
    }

    public void revelarContainerBranco(JLabel containerBranco) {
        containerBranco.setVisible(true);
    }

    public void irParaTelaAdicionarProduto() {
        TelaAdicionarProduto telaAdicionarProduto = new TelaAdicionarProduto(view, true, this);
        telaAdicionarProduto.setVisible(true);
    }
    
    public void atualizarLista() throws SQLException {
        Connection connection = new Conexao().getConnection();
        ProdutoDao produtoDao = new ProdutoDao(connection);
        ArrayList<Produto> listaProdutos = produtoDao.retornarProdutosDoBancoDeDados();
        DefaultListModel listModel = new DefaultListModel();
        this.view.getListListaDeProdutosEmEstoque().setModel(listModel);
        listModel.clear();
        for (Produto produto : listaProdutos) {
            listModel.addElement(produto.getDescricao());
        }
        this.view.getLabelQuantidadeDeProdutosRegistrados().setText("Quantidade de produtos registrados: " + listModel.size());
    }

    public void ocultarOuRevelarAOpcaoRemoverProduto() {
        if(this.view.getListListaDeProdutosEmEstoque().getSelectedIndices().length == 1) {
            this.view.getLabelMensagemContainerOcultador().setVisible(false);
            this.view.getLabelImagemContainerOcultador().setVisible(false);
            this.view.getLabelImagemContainerCinzaRemoverProduto().setVisible(true);
            this.view.getLabelProdutoSelecionado().setText("<html>Produto que está selecionado:<br/><strong>" + this.view.getListListaDeProdutosEmEstoque().getSelectedValue() + "</strong></html>");
        } else {
            this.view.getLabelMensagemContainerOcultador().setVisible(true);
            this.view.getLabelImagemContainerOcultador().setVisible(true);
            this.view.getLabelImagemContainerCinzaRemoverProduto().setVisible(false);
        }
    }

    public void irParaTelaRemoverProduto() {
        TelaRemoverProduto telaRemoverProduto = new TelaRemoverProduto(view, true, this);
        telaRemoverProduto.setVisible(true);
    }

    public TelaPrincipal getView() {
        return view;
    }

    public void setView(TelaPrincipal view) {
        this.view = view;
    }
    
}