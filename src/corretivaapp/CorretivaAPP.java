package corretivaapp;

import corretivaapp.Telas.Login;
import BancoDados.ConexaoBanco;

public class CorretivaAPP {

    public static void main(String[] args) {
        // Inicializando a interface gráfica de login
        java.awt.EventQueue.invokeLater(() -> {
            // Criando uma instância da interface de login
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);

            // Criando uma instância de ConexaoBanco para comunicação com o banco de dados
            ConexaoBanco conexaoBanco = new ConexaoBanco();

            // Testando a conexão (substitua "sua_senha" pela sua senha real)
            if (conexaoBanco.testarConexao("root", "")) {
                System.out.println("Conexão bem-sucedida com o banco de dados.");

                // Faça outras operações no banco de dados aqui, se necessário.
                // Por exemplo, você pode chamar métodos para consultar ou atualizar dados.

            } else {
                System.out.println("Falha na conexão com o banco de dados.");
                // Caso a conexão falhe, você pode exibir uma mensagem de erro ou tomar outras ações.
            }
        });
    }
}
