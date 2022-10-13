/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Producto;
import java.sql.CallableStatement;
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
        
        
        public int EliminarProducto(String id) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String query = "delete from producto where id_producto='"+id+"' ";
        
            return consulta.executeUpdate(query);

    }   
        
        public int InsertarProducto(Producto pro) throws SQLException, Exception{
        
            CallableStatement con = conectar().prepareCall("{call ingresarmesa(?,?)}");

            con.setString(1, pro.getId());
            con.setString(2, pro.getNombre());
            con.setString(3, pro.getActivo());
            con.setString(4, pro.getPesaje());
            con.setString(5, pro.getTipoProducto());
            con.setString(6, pro.getTipoAnimal());
            con.setString(7, pro.getReceta());
            con.setString(8, pro.getStock());
            

            return con.executeUpdate();
        }
}

    


