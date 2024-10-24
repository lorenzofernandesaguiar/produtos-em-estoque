package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/produtosemestoque", "postgres", "postgres");
        return connection; 
    }
}