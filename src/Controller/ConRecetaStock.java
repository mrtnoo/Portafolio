/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Empleado;
import Model.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class ConRecetaStock {
    
    
      public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
       }
    
    public int InsertarReceta(int CANTIDAD, int PLATO_ID_PLATO, int PRODUCTO_ID_PRODUCTO, int TIPO_PESAJE_ID_PESAJE) throws SQLException, Exception{
           
        
            JOptionPane.showMessageDialog(null, TIPO_PESAJE_ID_PESAJE);
            
           CallableStatement cs = conectar().prepareCall("{call AGREGAR_RECETA(?,?,?,?)");
           
            
            cs.setInt(1, CANTIDAD);
            cs.setInt(2, PLATO_ID_PLATO);
            cs.setInt(3, PRODUCTO_ID_PRODUCTO);
            cs.setInt(4, TIPO_PESAJE_ID_PESAJE);
            
         
            cs.execute();

            return 1;
    
    }
    
}



