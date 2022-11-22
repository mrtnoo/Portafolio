/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Mesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import oracle.security.o3logon.a;

/**
 *
 * @author Alumno
 */
public class ConMesa {
    
       public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;

}
       
        public int Eliminar_mesa(String id) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String sql = "delete from mesa where id_mesa = '"+id+"'";
        consulta.execute(sql);
        return 1; 
        }
       
       
        public ResultSet id() throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String sql = "select max(id_mesa) from mesa";
        ResultSet a = consulta.executeQuery(sql);
        
  
       
        return a; }
        
        
        public int Ingresar(String MAX_CLIENTES,String ACTIVO , int TIPO_MESA_ID_TIPO,String RESERVA_HORA,String PERSONA_RUT) throws SQLException, Exception {
           
        
            CallableStatement con = conectar().prepareCall("{call INSERTARMESA(?,?,?,?,?)}");

            
            con.setString(1, MAX_CLIENTES);
            con.setString(2,ACTIVO);
            con.setInt(3,TIPO_MESA_ID_TIPO);
            con.setString(4,RESERVA_HORA);
            con.setString(5,PERSONA_RUT);
            
            con.execute();
            return 1;
    }   
        
    
        
        
}