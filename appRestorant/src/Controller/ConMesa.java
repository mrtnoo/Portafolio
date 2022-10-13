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

/**
 *
 * @author Alumno
 */
public class ConMesa {
    
       public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "prueba";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;

}
        
 
        
        public int EliminarProducto(String id) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String query = "delete from producto where id_producto='"+id+"' ";
        
            return consulta.executeUpdate(query);

    
        }
        
        
        public int Ingresar(Mesa m) throws SQLException, Exception {
           
        
            CallableStatement con = conectar().prepareCall("{call INSERTARMESA(?,?,?,?)}");

            con.setString(1, m.getId_mesa());
            con.setString(2, m.getEstado());
            con.setString(3, m.getTipo_mesa());
            con.setString(4, m.getMax_clientes());
            con.execute();
            return 1;
    }   
        
        public void consultar_tipo(JComboBox cbotipo) throws SQLException{
        
            Connection con = conectar() ;
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String sql = "select ubicaccion from tipo_mesa";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            cbotipo.addItem("Seleccione una opcion");
        
            while(rs.next()){
                
                cbotipo.addItem(rs.getString("ubicaccion"));
                
            }
        }
        
        
}