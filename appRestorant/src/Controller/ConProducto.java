/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class ConProducto {
    

       public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "apprest";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;

}
        
        public int IngresarProducto(Producto pro) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        
        
        String query = "insert into producto values ('"+pro.getId()+"','"+pro.getNombre()+"','"+pro.getStock()+"','"
                +pro.getPesaje() +"','"+pro.getTipoProducto()+"','"+pro.getReceta()+"','"+pro.getActivo()+"')";
        
            return consulta.executeUpdate(query);

    }
        
        public int EliminarProducto(String id) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        
        
        String query = "delete from producto where id_producto='"+id+"' ";
        
            return consulta.executeUpdate(query);

    }   
    
}
