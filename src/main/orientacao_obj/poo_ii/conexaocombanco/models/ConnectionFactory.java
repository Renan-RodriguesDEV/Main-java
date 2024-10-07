package main.orientacao_obj.poo_ii.conexaocombanco.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Definindo as constantes para os parâmetros de conexão
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/loja";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método para obter a conexão com o banco de dados
    public static Connection getConexao() throws SQLException {
        // Não é mais necessário registrar o driver manualmente
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método principal para testar a conexão
    public static void main(String[] args) {
        try (Connection connection = getConexao()) {
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            // Tratamento de exceções com mensagem clara
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
