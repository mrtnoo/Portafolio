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


public class ConReceta {
    
        public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
        }
      
        
        
        
        
        
    public int InsertarReceta( String NOMBRE, int PRECIO, int TIPO_PLATO_ID_TIPO, int PROMOCION_ID_PROMO, int TIPO_RECETA_ID) throws SQLException, Exception{
           
           CallableStatement cs = conectar().prepareCall("{call Agregar_PlATO(?,?,?,?,?)");
           
           
            
            cs.setString(1, NOMBRE);
            cs.setInt(2, PRECIO);
            cs.setInt(3, TIPO_RECETA_ID);
            cs.setInt(4,PROMOCION_ID_PROMO);
            cs.setInt(5, TIPO_RECETA_ID);
            
         
            cs.execute();

            return 1;
    
    }
    
    
    
    
        public int Eliminar_plato(int ide) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String sql = "delete from ORDEN_PLATILLOS where ID_PEDIDO = '"+ide+"'";
        consulta.execute(sql);
        return 1; 
        
        }
        

       
       
   
        
  
       
 
    
}
