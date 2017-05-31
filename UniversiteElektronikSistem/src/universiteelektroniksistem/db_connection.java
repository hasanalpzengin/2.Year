/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universiteelektroniksistem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db_connection {
    
    Connection connect;
    
    public db_connection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Connection");
        connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vize_odevi?autoReconnect=true&useSSL=false", "root", "12345678");
    }
    
}
