
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//
public class Conexao{
    Connection conn = null;
   //public static String base="CleanBank";
    
   // private static Connection conexao;
    
    public static Connection ConexaoBD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
          //  String url="jdbc:mysql://localhost:3306/inventorycontrol?", "root", "";
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanbank?", "root", "");
           
            System.out.println("Conexao OK");
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
             
        }
        return null;
    }
   /* public Connection getConexao(){
        return conexao;
    }*/
}
