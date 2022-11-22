/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Cone.conexion;
import Model.Usuario;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Alumno
 */
public class ConLogin {
    
      

        conexion con = new conexion();
        
        public int Login(String id, String contraseña) throws SQLException, Exception {
           
        Statement consulta = con.conectar().createStatement();
        String q = "select * from empleado where persona_rut = '"+id+"' and contraseña='"+contraseña+"'";
        return consulta.executeUpdate(q);
        
        
    }
    
}
