/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Empleado;
import Model.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class ConEmpleado {
    

        public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "newddbb";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;}
    
      
    
    public int InsertarPersona(Persona per) throws SQLException, Exception{
           
           CallableStatement cs = conectar().prepareCall("{call InsertaPer(?,?,?,?,?,?,?)}");
           
      
            cs.setString(3, per.getNombre());
            cs.setString(4, per.getApellido());
            cs.setString(5, per.getTelefono());
            cs.setString(6, per.getCorreo());
            cs.setString(7, per.getDireccion());
           
            cs.execute();

            return 1;
    
    }
        
    public int InsertarEmpleado(Empleado emp) throws SQLException, Exception{
            
        
           CallableStatement cs = conectar().prepareCall("{call INSERTAR_EMPLEADO(?,?,?,?,?)}");
         
            cs.setString(1, emp.getID_PERSONA_EMPLEADO());
            cs.setString(2, emp.getCONTRASEÑA());
            cs.setString(3, emp.getTURNO_EMPLEADO_ID_TURNO());
            cs.setString(4, emp.getTIPO_EMPLEADO_ID_TIPO_EMPLEADO());
            cs.setString(5, emp.getPERSONA_ID_PERSONA());
            cs.execute();
            
            return 1;
        }
}
