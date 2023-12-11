package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/corretivaapp";

    // Método para obter uma conexão com o banco de dados
    public static Connection obterConexao(String usuario, String senha) throws SQLException {
        // Registra o driver JDBC (certifique-se de ter o driver JDBC correspondente ao seu banco de dados no classpath)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado");
        }

        // Retorna uma nova conexão
        return DriverManager.getConnection(JDBC_URL, usuario, senha);
    }

    public boolean testarConexao(String usuario, String senha) {
        try {
            // Tentar estabelecer uma conexão
            Connection connection = obterConexao(usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");
            
            // Fechar a conexão
            connection.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            return false;
        }
    }
}