
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
public class dbcon {
    private static final String db_url="jdbc:mysql://sudharsan.mysql.database.azure.com:3306/bus?useSSL=true";
    private static final String us="sudharsan";
    private static final String pass="Animess174#";
    
    static Connection getConnection(){
        Connection connection=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        try{
            connection=DriverManager.getConnection(db_url,us,pass);
            System.out.println("Connection to the Database. ");
        }
        catch(SQLException e){
            System.out.println("Failed to connect to the Database. ");
            e.printStackTrace();
        }
        return connection;
    }
    
}
