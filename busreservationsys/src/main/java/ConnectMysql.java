import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
public class ConnectMysql {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     String db_url="jdbc:mysql://localhost:3306/library_db?";
    String us="root";
     String pass="";
    
    
        Connection connection=null;
        
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(db_url,us,pass);
            System.out.println("Connection to the Database. ");
        }
        catch(SQLException e){
            System.out.println("Failed to connect to the Database. ");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
