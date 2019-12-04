   package data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 * essa classe é responsavel por fazer a conexão do java com o SQL express
 */
public class conexaoC {
    
    /**
     *
     */
    public conexaoC(){};
    
    /**
     *
     * @return
     * o metodo getConexao faz a conexão com o banco de dados utilizando o driver jtds
     */
    public Connection getConexao(){
        String url = "jdbc:jtds:sqlserver://DESKTOP-GB9FTKE:1433/uniparts";
        String usuario = "sa";
        String senha = "sa";
        Connection result = null;
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            result = DriverManager.getConnection(url,usuario,senha);
        }
        catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return result;   
    }
}
    //DESKTOP-GB9FTKE\\SQLEXPRESS:1433;databaseName=uniparts

