package main.orientacao_obj.poo_ii.conexaocombanco;

import java.sql.*;

public class BancoTeste {
    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String senha = "";
    private static String user = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnx = null;
            cnx = DriverManager.getConnection(url, user, senha);
            if (cnx != null) {
                System.out.println("Conectado ao banco" + cnx.getSchema());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel carregar a API");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Nao foi possivel carregar DriverManager do banco de dados");
            e.printStackTrace();
        }

    }
}
