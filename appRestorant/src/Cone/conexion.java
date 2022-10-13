
package Cone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private static Connection conn = null;
    private static String URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private static String USER = "prueba";
    private static String PASWORD = "123";
    
   public Connection conectar() throws SQLException { {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(URL,USER,PASWORD);
            conn.setAutoCommit(false);
            if(conn != null) {
                JOptionPane.showMessageDialog(null, "conectado");
            }else{
                System.out.println("desconectado");
            }
        } catch (ClassNotFoundException | SQLException e)   {
            System.out.println("error"+ e);
        }
        return conn;
    }

    
}
}