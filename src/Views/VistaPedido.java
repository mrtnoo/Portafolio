/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.ConMesa;
import Controller.ConOrden;
import Controller.ConPedido;
import Controller.ConPersona;
import Controller.ConReceta;
import Model.Empleado;
import Model.Mesa;
import Model.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class VistaPedido extends javax.swing.JFrame {

        public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
       }
    /**
     * Creates new form ClienteView
     */
    public VistaPedido() {

                initComponents();
                CargarTablaOrden();
                llenarCboPlato();
                

        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String sql = "select ID_PEDIDO ,nombre, agregar_extra, pro.descripcion\n" +
                            "from orden_platillos ord\n" +
                            "join plato  pla     on  pla.id_plato = ord.plato_id_plato\n" +
                            "join orden o        on o.id_orden = ord.orden_id_orden\n" +
                            "join promocion pro  on pro.id_promo = pla.PROMOCION_ID_PROMO";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("id");           
            modelo.addColumn("Nombre");
            modelo.addColumn("Extra");
            
            
            while(rs.next()){
                
                
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i< cantidadColumnas ; i++)
                {
                    
                    filas[i] = rs.getObject(i+1);
                    
                }
                
                modelo.addRow(filas);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        this.setLocationRelativeTo(null);
    
                
                
               
           
   

        
        
    }

 
   

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtid_orden = new javax.swing.JTextField();
        txtid_mesa = new javax.swing.JTextField();
        txtClienteRut = new javax.swing.JTextField();
        txtTotal_costo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboGarzon = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboPlato = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtExtras = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtid_ = new javax.swing.JTextField();
        txtTotalDiario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(53, 91, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Agregar Comentario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 28, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 110, 52));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 349, 80, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 90, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 760, 160));

        jLabel13.setText("nro pedido");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, -1));
        jPanel1.add(txtid_orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 120, -1));
        jPanel1.add(txtid_mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 160, -1));

        txtClienteRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRutActionPerformed(evt);
            }
        });
        jPanel1.add(txtClienteRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 190, 30));
        jPanel1.add(txtTotal_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 170, -1));

        jButton3.setBackground(new java.awt.Color(59, 110, 52));
        jButton3.setText("Registrar orden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 270, 40));

        jLabel1.setText("Comentarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 20));

        jLabel7.setText("Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        jLabel8.setText("Nro Mesa");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, -1));

        cboGarzon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Garzon", "juan meloso", "Martin Huerta", "esteban dido", " " }));
        cboGarzon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGarzonActionPerformed(evt);
            }
        });
        jPanel1.add(cboGarzon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 190, -1));

        jLabel9.setText("Rut Cliente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 100, 20));

        jPanel1.add(cboPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 150, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 740, 130));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 330, 50));

        txtExtras.setColumns(20);
        txtExtras.setRows(5);
        jScrollPane4.setViewportView(txtExtras);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 220, 30));

        jLabel3.setText("Garzon");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, -1));

        jLabel10.setText("Comentario");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        txtid_.setText("nro pedido");
        jPanel1.add(txtid_, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 90, 30));

        txtTotalDiario.setText("$$$");
        txtTotalDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDiarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 140, -1));

        jLabel11.setText("Total Diario");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 90, -1));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/kisspng-ingredient-kitchen-utensil-food-condiment-ingredients-and-kitchen-utensils-5a70503c83a3c0.7918750215173100125392.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setInheritsPopupMenu(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 510, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


            AgregarPlato();
            CalcularTotal();
            Cargartabla();
            CargarTablaOrden();
            
         

        
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConReceta con = new ConReceta();
        
        try {
            if(con.Eliminar_plato(Integer.parseInt(txtid_.getText()))>0){
            
                JOptionPane.showMessageDialog(null, "Plato Eliminado");
                Cargartabla();
                
        }
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        AgregarOrden();
        CargarTablaOrden();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTotalDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDiarioActionPerformed

    private void cboGarzonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGarzonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGarzonActionPerformed

    private void txtClienteRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRutActionPerformed
    int extra ;  
    public int sumarExt;
       
    public void AgregarPlato(){
        try {
            

        int id_tipo = 0;
        
        ConOrden ord = new ConOrden();
        ConPedido con = new ConPedido();

                String cbtipo = (String) cboPlato.getSelectedItem();         
        
        
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select id_plato from plato where nombre = '"+cbtipo+"'";
               
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                id_tipo = rs.getInt(1);
                }
       
        String AGREGAR_EXTRA      = txtExtras.getText();
        int ORDEN_ID_ORDEN = (Integer.parseInt(txtid_orden.getText()));
        int PLATO_ID_PLATO = (id_tipo);
        
    

        
        try{

            if(con.InsertarPedido( AGREGAR_EXTRA, ORDEN_ID_ORDEN, PLATO_ID_PLATO)>0){
              ord.Platos(PLATO_ID_PLATO);

                JOptionPane.showMessageDialog(null, "Plato Registrado");
                Cargartabla();
                
                
                
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }        

        } catch (Exception e) {
        }        
    }
    
    
    
    
    
    public void AgregarOrden()          {

        
        
 
        
        ConOrden con = new ConOrden();
        
        String DESCRIPCION = txtDescripcion.getText();
        int TOTAL_COSTO = 0;
        int MESA_ID_MESA = (Integer.parseInt(txtid_mesa.getText()));
        int EMPLEADO_ID_EMPLEADO = cboGarzon.getSelectedIndex();
        int ESTADO_PEDIDO_ID_EST = 1;
        String PERSONA_RUT = txtClienteRut.getText();
   
        try{

            if(con.Ingresar(DESCRIPCION, TOTAL_COSTO, ESTADO_PEDIDO_ID_EST, MESA_ID_MESA, EMPLEADO_ID_EMPLEADO, PERSONA_RUT)>0){
                

                JOptionPane.showMessageDialog(null, "Orden Registrada");
                
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        
    }
        
    
    
        
    public void CargarTablaOrden()      {
            
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable3.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            

            String sql = "select o.id_orden,o.mesa_id_mesa ,p.nombre, p.apellido , o.persona_rut, o.total_costo , es.descripcion\n" +
                        "from orden o \n" +
                        "join empleado e\n" +
                        "on e.id_empleado = o.empleado_id_empleado\n" +
                        "join persona p\n" +
                        "on p.rut = e.persona_rut\n" +
                        "join estado_pedido es\n" +
                        "on es.id_est = o.estado_pedido_id_est";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
           
            modelo.addColumn("Nro Pedido");
            modelo.addColumn("Nro Mesa");
            modelo.addColumn("Nombre Garzon");
            modelo.addColumn("Apellido Garzon");
            modelo.addColumn("Rut Cliente");  
            modelo.addColumn("Total");
            modelo.addColumn("Comentario");
            
            while(rs.next()){
                
                
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i< cantidadColumnas ; i++)
                {
                    
                    filas[i] = rs.getObject(i+1);
                    
                }
                
                modelo.addRow(filas);

            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        this.setLocationRelativeTo(null);
    
        }
        
        
        
    public void Cargartabla()           {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID = (Integer.parseInt(txtid_orden.getText()));
            
            String sql = "select id_pedido ,nombre, precio, agregar_extra, fecha\n" +
                            "from orden_platillos ord\n" +
                            "join plato  pla     on  pla.id_plato = ord.plato_id_plato\n" +
                            "join orden o        on o.id_orden = ord.orden_id_orden\n" +
                            "join promocion pro  on pro.id_promo = pla.PROMOCION_ID_PROMO where orden_id_orden = '"+ID+"'";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("id");           
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Extra");
            modelo.addColumn("Promocion");
          
            
            
       

            
            while(rs.next()){
                
                
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i< cantidadColumnas ; i++)
                {
                    
                    filas[i] = rs.getObject(i+1);
                    
                }
                
                modelo.addRow(filas);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    
    
        }
    

    
    
    public void AgregarTotal(int total) { 
        
        PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = (Integer.parseInt(txtid_orden.getText()));
            
                   
            try {
                
                String sql = "update Orden set total_costo='"+total+"'\n" +
                "  where id_orden= '"+ID+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    
    

    public void CalcularTotal()         {
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = (Integer.parseInt(txtid_orden.getText()));
            
            

                   
            try {
                String sql = "select  sum(p.precio) From plato p join orden_platillos o on p.id_plato = o.plato_id_plato where orden_id_orden = '"+ID+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    int total = myRS.getInt(1);
                    int to = total + sumarExt;
                    
                    
                    
                    String numCadena= String.valueOf(to);
                    
                    txtTotal_costo.setText(numCadena);
                            
                String sq = "update Orden set total_costo='"+to+"'\n" +
                "  where id_orden= '"+ID+"'";
                
                ps = conectar().prepareStatement(sq);
                myRS = ps.executeQuery();
                    
                    CargarTablaOrden();
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }
    
     
    
    public void CalcularTotalDiario()   {
            PreparedStatement ps = null;
            ResultSet rs = null;
            
          

                   
            try {
                String sql = "select sum(TOTAL_COSTO) from orden";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    int total = myRS.getInt(1);
                    
                    String numCadena= String.valueOf(total);
                    
                    txtTotalDiario.setText(numCadena);
                            
                  
                    CargarTablaOrden();
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }


    public void llenarCboGarzon()       {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre \n" +
                                "from PERSONA p\n" +
                                "join empleado e\n" +
                                "on e.persona_rut = p.rut";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboGarzon.addItem("seleccione");            
                while(rs.next()){
            
            cboGarzon.addItem(rs.getString(1));
            
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    }

    
        
        public void llenarCboPlato()    {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre from plato";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboPlato.addItem("seleccione");            
                while(rs.next()){
            
            cboPlato.addItem(rs.getString(1));
            
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboGarzon;
    private javax.swing.JComboBox<String> cboPlato;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtClienteRut;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtExtras;
    private javax.swing.JTextField txtTotalDiario;
    private javax.swing.JTextField txtTotal_costo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid_;
    private javax.swing.JTextField txtid_mesa;
    private javax.swing.JTextField txtid_orden;
    // End of variables declaration//GEN-END:variables
}
