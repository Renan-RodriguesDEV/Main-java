package main.orientacao_obj.poo_ii.conexaocombanco.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static Connection getConexao() throws Exception {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://127.0.0.1:8080/loja";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cnx = DriverManager.getConnection(url, user, password);
        return cnx;
    }
}
