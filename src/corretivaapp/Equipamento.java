package corretivaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Equipamento {

    private long tag;
    private String fabricante;
    private String modelo;
    private float horimetroMotor;
    private float horimetro1;
    private float horimetro2;
    private String motivoParada;
    private String pecaDanificada;
    private String servicoRealizado;
    private long ra;
    private Date dataFabricacao;

    // Construtor da classe Equipamento
    public Equipamento(long tag, String fabricante, String modelo, float horimetroMotor, float horimetro1, float horimetro2,
            String motivoParada, String pecaDanificada, String servicoRealizado, long ra, Date dataFabricacao) {
        this.tag = tag;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.horimetroMotor = horimetroMotor;
        this.horimetro1 = horimetro1;
        this.horimetro2 = horimetro2;
        this.motivoParada = motivoParada;
        this.pecaDanificada = pecaDanificada;
        this.servicoRealizado = servicoRealizado;
        this.ra = ra;
        this.dataFabricacao = dataFabricacao;
    }

    // Métodos getters e setters
    public long getTag() {
        return tag;
    }

    public void setTag(long tag) {
        this.tag = tag;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getHorimetroMotor() {
        return horimetroMotor;
    }

    public void setHorimetroMotor(float horimetroMotor) {
        this.horimetroMotor = horimetroMotor;
    }

    public float getHorimetro1() {
        return horimetro1;
    }

    public void setHorimetro1(float horimetro1) {
        this.horimetro1 = horimetro1;
    }

    public float getHorimetro2() {
        return horimetro2;
    }

    public void setHorimetro2(float horimetro2) {
        this.horimetro2 = horimetro2;
    }

    public String getMotivoParada() {
        return motivoParada;
    }

    public void setMotivoParada(String motivoParada) {
        this.motivoParada = motivoParada;
    }

    public String getPecaDanificada() {
        return pecaDanificada;
    }

    public void setPecaDanificada(String pecaDanificada) {
        this.pecaDanificada = pecaDanificada;
    }

    public String getServicoRealizado() {
        return servicoRealizado;
    }

    public void setServicoRealizado(String servicoRealizado) {
        this.servicoRealizado = servicoRealizado;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    // Método para inserir um novo equipamento no banco de dados
    public boolean inserirEquipamento(String usuario, String senha) {
        String inserirEquipamentoSQL = "INSERT INTO Equipamento (Tag, Fabricante, Modelo, HorimetroMotor, Horimetro1, Horimetro2, MotivoParada, PecaDanificada, ServicoRealizado, RA, DataFabricacao)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CorretivaApp", "root", "");
                PreparedStatement preparedStatement = connection.prepareStatement(inserirEquipamentoSQL)) {
            preparedStatement.setLong(1, tag);
            preparedStatement.setString(2, fabricante);
            preparedStatement.setString(3, modelo);
            preparedStatement.setFloat(4, horimetroMotor);
            preparedStatement.setFloat(5, horimetro1);
            preparedStatement.setFloat(6, horimetro2);
            preparedStatement.setString(7, motivoParada);
            preparedStatement.setString(8, pecaDanificada);
            preparedStatement.setString(9, servicoRealizado);
            preparedStatement.setLong(10, ra);
            preparedStatement.setDate(11, new java.sql.Date(dataFabricacao.getTime()));

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir equipamento: " + e.getMessage());
            return false;
        }
    }

    // Método toString para exibir informações do equipamento
    @Override
    public String toString() {
        return "Equipamento{" + "tag=" + tag + ", fabricante='" + fabricante + '\'' + ", modelo='" + modelo + '\''
                + ", horimetroMotor=" + horimetroMotor + ", horimetro1=" + horimetro1 + ", horimetro2=" + horimetro2
                + ", motivoParada='" + motivoParada + '\'' + ", pecaDanificada='" + pecaDanificada + '\''
                + ", servicoRealizado='" + servicoRealizado + '\'' + ", ra=" + ra + ", dataFabricacao=" + dataFabricacao
                + '}';
    }

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
