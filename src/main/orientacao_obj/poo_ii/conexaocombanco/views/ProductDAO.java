package main.orientacao_obj.poo_ii.conexaocombanco.views;

import java.sql.*;

import javax.swing.JOptionPane;

import main.orientacao_obj.poo_ii.conexaocombanco.models.ConnectionFactory;

public class ProductDAO {
    public static void main(String[] args) throws Exception  {
        Connection cnx = null;
        String sql = "select * from produtos";
        cnx = ConnectionFactory.getConexao();
        Statement st = cnx.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.println("Marcão seu gay");
            String nome = rs.getString("descricao");
            Double preco = rs.getDouble("preco");
            Date data = rs.getDate("validade");
            JOptionPane.showMessageDialog(null, "Produto: "+nome+" Preço: "+preco+" Validade: "+data, "Consulta ao Javoso", 0);
        }
        cnx.close();
    }
}
