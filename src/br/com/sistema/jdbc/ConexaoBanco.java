package br.com.sistema.jdbc;

import java.sql.Connection;  // Importação correta
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    final private String url = "jdbc:mysql://localhost/sistemaestoque";
    final private String usuario = "root";
    final private String senha = "93298480";

    public Connection pegarConexao() {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: " + e.getMessage());
        }
        return null;
    }
}
