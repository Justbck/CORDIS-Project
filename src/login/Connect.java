package login;

import java.sql.*;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   

//Stefania Bartoli

public class Connect {  
    
    private static Connection conn;

    
    public static Connection connect() {  

        try{
            
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:cordis.sqlite");
            
            System.out.println("SQLite DB connected!");
            
        } catch (Exception e) {
            System.err.println(e);
        }

        return conn;


} 
  
    public static void main(String[] args) throws Exception {  

     Connect.connect();
     
         
    }  
}  
