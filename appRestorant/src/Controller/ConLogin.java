/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
    
       public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "apprest";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;

}
        
        public int Login(String id, String contraseña) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String q = "select * from usuario where id = '"+id+"' and contraseña='"+contraseña+"'";
        return consulta.executeUpdate(q);
        
        
    }
    
}
