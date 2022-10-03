
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class MyConnection {
    private static String DBaseName = "real_estate_management";
    private static String Username = "root";
    private static String ServerName = "localhost";
    private static String Password = "";
    private static int portnumber = 3306;
    
    public static Connection GetConnection(){
        Connection con = null;
        MysqlDataSource data = new MysqlDataSource();
        data.setServerName(ServerName);
        data.setUser(Username);
        data.setDatabaseName(DBaseName);
        data.setPort(portnumber);
        data.setPassword(Password);
        try {
            con = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
        
    }
    
    
    
}
