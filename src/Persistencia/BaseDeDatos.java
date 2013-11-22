
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {
 protected static Connection instance = null;
    public static Connection getInstance() throws ClassNotFoundException, SQLException {
        if (instance == null) {
            String url = "jdbc:postgresql://127.0.0.1:5432/practico";  
            String driver = "org.postgresql.Driver";  
            String user = "postgres"; 
            String pass = "Iddqdidkfa1";
            Class.forName(driver);
            instance = DriverManager.getConnection(url,user,pass);
        }        
        return instance;
    }   

  
}
