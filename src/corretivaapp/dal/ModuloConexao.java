
package corretivaapp.dal;

import java.sql.*;
/**
 *
 * @author RA200252575 Eng Sotware
 */

public class ModuloConexao{
    //driver, caminho , nome prioridade, Autenticação
    // Método responsavel por conexao com BDB
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // chama o driver importado para a biblioteca
        String driver = "com.msql.jdbc.Driver";
        //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecendo a conexao com banco de Dados
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch (Exception e){
            return null;
            
        }
        
    }
}

/*public class ModuloConexao implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public ModuloConexao() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}*/
