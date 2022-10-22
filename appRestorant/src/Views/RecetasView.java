/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.ConMesa;
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
public class RecetasView extends javax.swing.JFrame {

        public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "newddbb";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
       }
    /**
     * Creates new form ClienteView
     */
    public RecetasView() {

        initComponents();
        
        
            try {
                Cargartabla();
            } catch (SQLException ex) {
                Logger.getLogger(RecetasView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        cboTipoReceta.addItem("Seleccione receta");
        cboTipoReceta.addItem("italiana");
        cboTipoReceta.addItem("kilo");
        
        cboPromo.addItem("seleccione");
        cboPromo.addItem("2x1");
        
        cboTipo.addItem("seleccione");
        cboTipo.addItem("Tallarines con boloñesa");
                
 
        
        
    }

 
   

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtAux = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboTipoReceta = new javax.swing.JComboBox<>();
        cboPromo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, -1));
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 150, -1));

        jLabel1.setText("producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 28, -1, -1));

        jLabel3.setText("precio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 28, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 110, 52));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 150, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 150, -1));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 150, -1));

        txtAux.setForeground(new java.awt.Color(153, 153, 153));
        txtAux.setText("Ingrese rut...");
        jPanel1.add(txtAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 230, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/kisspng-ingredient-kitchen-utensil-food-condiment-ingredients-and-kitchen-utensils-5a70503c83a3c0.7918750215173100125392.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -10, 480, 500));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 710, 160));

        jPanel1.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, -1));

        jLabel12.setText("Tipo Plato");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        cboTipoReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoRecetaActionPerformed(evt);
            }
        });
        jPanel1.add(cboTipoReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 150, -1));

        jPanel1.add(cboPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 150, -1));

        jLabel13.setText("id receta");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 28, -1, -1));

        jLabel14.setText("Tipo Receta");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 110, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

AgregarReceta();
    

        
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConReceta con = new ConReceta();
        
        try {
            if(con.Eliminar_plato(Integer.parseInt(txtid.getText()))>0){
            
                JOptionPane.showMessageDialog(null, "Plato Eliminado");
                Cargartabla();
        }
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboTipoRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoRecetaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            try {
                Cargartabla();
            } catch (SQLException ex) {
                Logger.getLogger(RecetasView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton4ActionPerformed


    
    public void AgregarReceta(){

        ConReceta con = new ConReceta();
        
        int ID_PLATO   = (Integer.parseInt(txtid.getText()));
        String NOMBRE      = txtnombre.getText();
        int PRECIO = (Integer.parseInt(txtprecio.getText()));
        
        
        int TIPO_PLATO_ID_TIPO = cboTipoReceta.getSelectedIndex();
        int PROMOCION_ID_PROMO = cboPromo.getSelectedIndex();
        int TIPO_RECETA_ID = cboTipo.getSelectedIndex();
        
        
        
        try{

            if(con.InsertarReceta(ID_PLATO, NOMBRE, PRECIO, 
               TIPO_PLATO_ID_TIPO, PROMOCION_ID_PROMO, TIPO_RECETA_ID)>0){
                

                JOptionPane.showMessageDialog(null, "Plato Registrado");
                Cargartabla();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }        
        
    }
    
    
    
    
    
    
         public void Cargartabla() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String sql = "select ID_PLATO, NOMBRE, PRECIO, t.descripcion , pro.descripcion , tr.descripcion from plato p " +
"join tipo_plato t " +
"on p.tipo_plato_id_tipo = t.id_tipo " +
"join promocion pro " +
"on pro.id_promo = p.promocion_id_promo " +
"join tipo_receta tr " +
"on tr.id = p.tipo_receta_id";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
           
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("PRECIO");
            modelo.addColumn("TIPO RECETA");
            modelo.addColumn("PROMOCION");
            modelo.addColumn("DESCRIPCION");
            
       

            
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
                new RecetasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPromo;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JComboBox<String> cboTipoReceta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtAux;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
