/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alumno
 */
public class ConOrden {
    
        public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
        }
        
    
    
        public int Ingresar(String DESCRIPCION, int TOTAL_COSTO, int MESA_ID_MESA, int EMPLEADO_ID_EMPLEADO, int ESTADO_PEDIDO_ID_EST, String PERSONA_RUT) throws SQLException, Exception {
           
        
            CallableStatement con = conectar().prepareCall("{call INSERTAORDEN(?,?,?,?,?,?)}");

   
            con.setString(1, DESCRIPCION);
            con.setInt(2, TOTAL_COSTO);
            con.setInt(3, MESA_ID_MESA);
            con.setInt(4, EMPLEADO_ID_EMPLEADO);
            con.setInt(5, ESTADO_PEDIDO_ID_EST);
            con.setString(6, PERSONA_RUT );
            
          
            
            con.execute();
            return 1;
    }   
    
        public int Platos(int plato_id_plato) throws SQLException, Exception {
           
        
            CallableStatement con = conectar().prepareCall("{call platos(?)}");

   
            con.setInt(1, plato_id_plato);
            
            con.execute();
            return 1;
    }   
    
        
}
