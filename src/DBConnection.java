/**
 *
 * @author jovit
 */

import java.sql.*;

public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB() {
        Connection conn = null;
        try {
            //register jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            
            
            //open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
            
        } catch (Exception ex) {
            System.out.println("Error gan");
            return null;
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
