package corretivaapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import BancoDados.ConexaoBanco;

public class OsService {

    // Método para buscar uma O.S. pelo número
    public OsInfo buscarOs(String osNumber) {
        // Inicialize uma variável para armazenar as informações da O.S.
        OsInfo osInfo = null;

        // Use um bloco try-with-resources para garantir que os recursos sejam fechados corretamente
        try (Connection connection = obterConexao()) {
            // Consulta SQL para buscar a O.S. pelo número
            String sql = "SELECT * FROM OrdemServico WHERE numero = ?";

            // Crie uma PreparedStatement para a consulta parametrizada
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Configure o parâmetro da consulta com o número da O.S.
                preparedStatement.setString(1, osNumber);

                // Execute a consulta
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Verifique se há um resultado
                    if (resultSet.next()) {
                        // Preencha os detalhes da O.S. a partir do resultado da consulta
                        osInfo = preencherOsInfo(resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            // Lide com qualquer exceção de banco de dados
            e.printStackTrace(); // Logue ou trate a exceção conforme necessário
        }

        // Retorne as informações da O.S. encontrada ou null se não encontrada
        return osInfo;
    }

    // Método para buscar uma O.S. pelo equipamento Tag
    public OsInfo buscarOsByEquipTag(String equipTag) {
        // Inicialize uma variável para armazenar as informações da O.S.
        OsInfo osInfo = null;

        // Use um bloco try-with-resources para garantir que os recursos sejam fechados corretamente
        try (Connection connection = obterConexao()) {
            // Consulta SQL para buscar a O.S. pelo equipamento Tag
            String sql = "SELECT * FROM OrdemServico WHERE equipamentoTag = ?";

            // Crie uma PreparedStatement para a consulta parametrizada
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Configure o parâmetro da consulta com a TAG do equipamento
                preparedStatement.setString(1, equipTag);

                // Execute a consulta
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Verifique se há um resultado
                    if (resultSet.next()) {
                        // Preencha os detalhes da O.S. a partir do resultado da consulta
                        osInfo = preencherOsInfo(resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            // Lide com qualquer exceção de banco de dados
            // Logue ou trate a exceção conforme necessário
            
        }

        // Retorne as informações da O.S. encontrada ou null se não encontrada
        return osInfo;
    }

    // Método auxiliar para preencher as informações da O.S. a partir do ResultSet
    private OsInfo preencherOsInfo(ResultSet resultSet) throws SQLException {
        OsInfo osInfo = new OsInfo();
        osInfo.setNumero(resultSet.getInt("numero"));
        osInfo.setDataAbertura(resultSet.getTimestamp("dataAbertura"));
        osInfo.setDataFechamento(resultSet.getTimestamp("dataFechamento"));
        osInfo.setEquipTag(resultSet.getString("equipamentoTag"));
        osInfo.setDescricaoProblema(resultSet.getString("descricaoProblema"));
        osInfo.setDescricaoServico(resultSet.getString("descricaoServico"));
        osInfo.setObservacoes(resultSet.getString("observacoes"));
        osInfo.setRegistroFuncionario(resultSet.getString("registroFuncionario"));
        osInfo.setConcluida(resultSet.getBoolean("concluida"));

        return osInfo;
    }

    // Método auxiliar para obter a conexão com o banco de dados
    private Connection obterConexao() throws SQLException {
        ConexaoBanco ConexaoBanco = new ConexaoBanco();
        return ConexaoBanco.obterConexao("root","");
    }
}
