/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class ConPedido {
    

           public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "newddbb";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
           }
           
           
           
    
        public int InsertarPedido(int ID_ORDEN, String AGREGAR_EXTRA,int ORDEN_ID_ORDEN, int PLATO_ID_PLATO) throws SQLException, Exception{
           
           CallableStatement cs = conectar().prepareCall("{call AGREGAR_PEDIDO(?,?,?,?)}");
           
      
            cs.setInt(1, ID_ORDEN);
            cs.setString(2,AGREGAR_EXTRA);
            cs.setInt(3, ORDEN_ID_ORDEN);
            cs.setInt(4, PLATO_ID_PLATO);
            
           
            cs.execute();

            return 1;
    
    }
}
