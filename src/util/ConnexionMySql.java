
package util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sahrour
 */
public class ConnexionMySql {

    /**
     * @param args the command line arguments
     */
    private String url ;
    private String user ;
    private String password ;
    private Connection connexion;
    private static   ConnexionMySql instance=null;

    private ConnexionMySql() {
      
        url = "jdbc:mysql://localhost/bestdeal";
        user= "root";
        password="";
        try {     
            connexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    
    }
    

    
    public static  synchronized ConnexionMySql getInstance()
    {
        if (instance==null) 
            instance=new ConnexionMySql();
    return instance;
    }
    
    public Connection getConnection()
            {
                return connexion;
            }
    
}
