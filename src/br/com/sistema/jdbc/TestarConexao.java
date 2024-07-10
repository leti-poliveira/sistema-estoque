package br.com.sistema.jdbc;

import javax.swing.JOptionPane;

public class TestarConexao {

    public static void main(String[] args) {
        try {
            new ConexaoBanco().pegarConexao();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso ao banco de dados");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: " + erro.getMessage());
        }
    }
}
