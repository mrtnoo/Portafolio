
package Cone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private static Connection conn = null;
    private static String URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private static String USER = "apprest";
    private static String PASWORD = "123";
    
    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(URL,USER,PASWORD);
            conn.setAutoCommit(false);
            if(conn != null) {
                JOptionPane.showMessageDialog(null, "si");
            }else{
                System.out.println("desconectado");
            }
        } catch (ClassNotFoundException | SQLException e)   {
            System.out.println("error"+ e);
        }
        return conn;
    }
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("error2");
        }
    }
    public static void main(String[] args){
        conexion c = new conexion();
        c.getConnection();
    }
}