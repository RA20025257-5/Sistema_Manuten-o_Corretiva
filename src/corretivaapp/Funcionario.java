
package corretivaapp;

public class Funcionario {
   private String nome;
   private String area;
   private String RA;
   private String RG;
   private String CPF;
    
    public Funcionario(String nome, String area, String RA, String RG, String CPF) {
        this.nome = nome;
        this.area = area;
        this.RA = RA;
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
   
}
