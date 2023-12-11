package corretivaapp;

import java.sql.Timestamp;

/**
 * Classe que representa informações de uma Ordem de Serviço (Os).
 * Essa classe pode ser usada para encapsular os detalhes de uma Os.
 */
public class OsInfo {

    // Número da Ordem de Serviço
    private int numero;

    // Data de abertura da Ordem de Serviço
    private Timestamp dataAbertura;

    // Data de fechamento da Ordem de Serviço
    private Timestamp dataFechamento;

    // Tag do equipamento associado à Ordem de Serviço
    private String equipTag;

    // Descrição do problema relatado na Ordem de Serviço
    private String descricaoProblema;

    // Descrição do serviço realizado na Ordem de Serviço
    private String descricaoServico;

    // Observações adicionais relacionadas à Ordem de Serviço
    private String observacoes;

    // Registro do funcionário responsável pela Ordem de Serviço
    private String registroFuncionario;

    // Indica se a Ordem de Serviço está concluída
    private boolean concluida;

    // Construtor da classe OsInfo
    public OsInfo() {
        // Pode ser deixado vazio, dependendo da lógica que você deseja no construtor
    }

    // Métodos getters e setters para cada atributo

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Timestamp getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Timestamp dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Timestamp getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Timestamp dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getEquipTag() {
        return equipTag;
    }

    public void setEquipTag(String equipTag) {
        this.equipTag = equipTag;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getRegistroFuncionario() {
        return registroFuncionario;
    }

    public void setRegistroFuncionario(String registroFuncionario) {
        this.registroFuncionario = registroFuncionario;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
