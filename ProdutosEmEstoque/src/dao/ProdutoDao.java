package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

public class ProdutoDao {
    private Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;
    }
    
    public boolean existeEstaDescricaoNoBancoDeDados(String descricao) throws SQLException {
        String sql = "select * from produtos where descricao = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, descricao);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }

    public void adicionarProdutoNoBancoDeDados(Produto produto) throws SQLException {
        String sql = "insert into produtos (descricao) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, produto.getDescricao());
        statement.execute();
    }

    public ArrayList<Produto> retornarProdutosDoBancoDeDados() throws SQLException {
        String sql = "select * from produtos ORDER BY descricao";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        while(resultSet.next()) {
            String descricao = resultSet.getString("descricao");
            Produto produto = new Produto();
            produto.setDescricao(descricao);
            listaProdutos.add(produto);
        }
        return listaProdutos;
    }
    
    public void remover(String descricao) throws SQLException {
        String sql = "delete from produtos where descricao = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, descricao);
        statement.execute();
    }
    
}