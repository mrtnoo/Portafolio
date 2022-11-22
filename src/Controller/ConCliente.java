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
public class ConCliente {
    
        public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
        }
        
        
    public int InsertarPersona(String RUT, String NOMBRE, String APELLIDO, String TELEFONO,String CORREO,String DIRECCION) throws SQLException, Exception{
         try {
            
             CallableStatement cs = conectar().prepareCall("{call INSERTAR_PERSONA(?,?,?,?,?,?)");
           
           
            cs.setString(1, RUT);
            cs.setString(2, NOMBRE);
            cs.setString(3, APELLIDO);
            cs.setString(4, TELEFONO);
            cs.setString(5, CORREO);
            cs.setString(6, DIRECCION);
         
            cs.execute();

            return 1;
            
        } catch (Exception e) {
             return 0;
            

        }
  
  
    
    }
        
        public int Eliminar_persona(String rut) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String sql = "delete from persona where rut = '"+rut+"'";
        consulta.execute(sql);
        return 1; 
        
        }
       
       
   
        
  
       
 
    
}
