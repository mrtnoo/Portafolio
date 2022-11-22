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
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class VistaPedidoCliente extends javax.swing.JFrame {

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
    public VistaPedidoCliente() {

                
                
            try {
                initComponents();
                llenarCboProducto();
                llenarCboPlato();
                CargartablaProducto();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
                txtArea.setEditable(false);
                txtTotal_costo.setEditable(false);
                txtTotalOrneed.setEditable(false);
                
        
        this.setLocationRelativeTo(null);
    
                
                
               
           
   

        
        
    }

 
   

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtClienteRut = new javax.swing.JTextField();
        txtTotal_costo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboPlato = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtExtras = new javax.swing.JTextArea();
        txtTotalOrneed = new javax.swing.JTextField();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        cboProducto = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(53, 91, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar plato");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 28, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 110, 52));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Agregar plato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 150, 70));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 90, -1));

        txtClienteRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRutActionPerformed(evt);
            }
        });
        jPanel1.add(txtClienteRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 330, -1));

        txtTotal_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal_costoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 120, -1));

        jButton3.setBackground(new java.awt.Color(59, 110, 52));
        jButton3.setText("Registrar orden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 560, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comentarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 40, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rut Cliente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, 20));

        jPanel1.add(cboPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 280, 30));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 330, 40));

        txtExtras.setColumns(20);
        txtExtras.setRows(5);
        jScrollPane4.setViewportView(txtExtras);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 280, 50));

        txtTotalOrneed.setBorder(null);
        jPanel1.add(txtTotalOrneed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 340, 110, -1));

        jTable1.setBackground(new java.awt.Color(35, 75, 109));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jPanel1.add(jTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 700, -1));

        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 30, 40));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 310, 290));

        jToggleButton1.setText("imprimir");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, 100, -1));

        jPanel1.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 180, -1));

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 80, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrediente extra");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 100, 20));

        cboEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nro pedido" }));
        jPanel1.add(cboEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 100, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Boleta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("PLATOS DISPONIBLES");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jTable2.setBackground(new java.awt.Color(35, 75, 109));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jTable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 460, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/kisspng-ingredient-kitchen-utensil-food-condiment-ingredients-and-kitchen-utensils-5a70503c83a3c0.7918750215173100125392.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setInheritsPopupMenu(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 480, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


            AgregarPlato();
            CalcularTotal();
           
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConReceta con = new ConReceta();
        String no =  (String) cboEliminar.getSelectedItem();
            
        int a = Integer.parseInt(no);
            
        try {
            
            
            if(con.Eliminar_plato(a)>0){
            
                JOptionPane.showMessageDialog(null, "Plato Eliminado");
                Cargartabla(nroOrden);
                cboEliminar.setSelectedIndex(0);
                llenarCboEliminar();
                CalcularTotal();
        }
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        AgregarOrden();
       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtClienteRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRutActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        txtArea.setText("");
        txtClienteRut.setText("");
        txtDescripcion.setText("");
        txtTotalOrneed.setText("");
        txtTotal_costo.setText("");
        cboPlato.setSelectedIndex(0);
        
            try {
                Connection con = conectar();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
        modelo.setRowCount(0);
        
        
        Properties defaultProps = new Properties();

        PrintJob print=Toolkit.getDefaultToolkit().getPrintJob(this,"Imprimir",defaultProps);       
        Graphics g=print.getGraphics();

        if(g!=null)
        {
                txtArea.printAll(g); // AreaPrograma es JTextArea
        }
        g.dispose();
        print.end();
        

        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String a = (String) cboProducto.getSelectedItem();
        txtExtras.append(a+" ");
        cboProducto.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTotal_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal_costoActionPerformed
    
    public int sumarExt;
    public int extra ;
    public int nroOrden;
    public String plato;
    public int ext = 0;
    public String agregarExtra;
    public int total = 0;
    public int totaltotal;
    public int totalOrden;
    
    
    
    
    public void AgregarPlato(){
        try {
            

        int id_tipo = 0;
        
        ConOrden ord = new ConOrden();
        ConPedido con = new ConPedido();

                String cbtipo = (String) cboPlato.getSelectedItem();         
                
                plato = (String) cboPlato.getSelectedItem();
        
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select id_plato from plato where nombre = '"+cbtipo+"'";
               
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                id_tipo = rs.getInt(1);
                }
       
                

                String AGREGAR_EXTRA = txtExtras.getText();
                agregarExtra = AGREGAR_EXTRA;
                
                int Cantidadd = 0;
                if(AGREGAR_EXTRA.length()>2){
                for (int i = 0; i < AGREGAR_EXTRA.length(); i++) {
            // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
                if (AGREGAR_EXTRA.charAt(i) == ' ') Cantidadd++;
                    }
                
                    ext = (1000*Cantidadd);
                }
                else{
                    ext = 0;
                }
                
                int ORDEN_ID_ORDEN = nroOrden;
                int PLATO_ID_PLATO = (id_tipo);
        
    

        
        try{

            if(con.InsertarPedido( AGREGAR_EXTRA, ORDEN_ID_ORDEN, PLATO_ID_PLATO)>0){
              ord.Platos(PLATO_ID_PLATO);

                JOptionPane.showMessageDialog(null, "Plato Registrado");
                Cargartabla(nroOrden);
                
                txtExtras.setText("");
                
                
                
                txtArea.append("\n"+plato+" ");
                VerPrecio();
                llenarCboEliminar();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }        

        } catch (Exception e) {
        }        
    }
    
    
    
    
    
    public void AgregarOrden(){

  
        
        ConOrden con = new ConOrden();
        
        String DESCRIPCION = txtDescripcion.getText();
        int TOTAL_COSTO = 0;
        int MESA_ID_MESA = 1;
        int EMPLEADO_ID_EMPLEADO = 1;
        int ESTADO_PEDIDO_ID_EST = 1;
        String PERSONA_RUT = txtClienteRut.getText();
   
        try{

            if(con.Ingresar(DESCRIPCION, TOTAL_COSTO, ESTADO_PEDIDO_ID_EST, MESA_ID_MESA, EMPLEADO_ID_EMPLEADO, PERSONA_RUT)>0){
                {
               
                    
                try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql = "select max(id_orden) from orden";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    nroOrden = myRS.getInt(1);
                    
                    String g = String.valueOf(nroOrden);
                    Date date = new Date();
                    txtArea.setText(date+" \n\nnumero pedido: "+g+"     "+"rut cliente: "+PERSONA_RUT+"\ncomentario: "+DESCRIPCION+"\n");
                    
 
                    
                JOptionPane.showMessageDialog(null, "nro pedido"+nroOrden+"");
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
                            
                  

                
                  
                   
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        
    }
        
    
           
        
        
    public void Cargartabla(int orden) throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID = nroOrden;
            
            String sql = "select id_pedido ,nombre, precio, agregar_extra\n" +
                            "from orden_platillos ord\n" +
                            "join plato  pla     on  pla.id_plato = ord.plato_id_plato\n" +
                            "join orden o        on o.id_orden = ord.orden_id_orden\n" +
                            "join promocion pro  on pro.id_promo = pla.PROMOCION_ID_PROMO where orden_id_orden = '"+ID+"'";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            String a = String.valueOf(ext);
            
            modelo.addColumn("id");           
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
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
        
    
    
        }
    
    
    
    
    public void CargartablaProducto() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID = nroOrden;
            
            String sql = "select nombre , precio from plato";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            String a = String.valueOf(ext);
            
         
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
           
            
            
          
          
            
            
       

            
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
    
    
    
    public void AgregarTotal(int total){ 
        
        PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = (nroOrden);
            totalOrden = total;
            String sa = String.valueOf(totalOrden);
            try {
                
                String sql = "update Orden set total_costo='"+total+"'\n" +
                "  where id_orden= '"+ID+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                
                
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    
    public void CalcularTotal(){
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = nroOrden;
            
            

                   
            try {
                String sql = "select  sum(p.precio) From plato p join orden_platillos o on p.id_plato = o.plato_id_plato where orden_id_orden = '"+ID+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                 
                    total = myRS.getInt(1);
                  
                    int j = total;
                    totaltotal = j + sumarExt +ext;
                    
                    
                    
                    String numCadena= String.valueOf(totaltotal);
                    
                    txtTotal_costo.setText(numCadena);
                   
                String sq = "update Orden set total_costo='"+totaltotal+"'\n" +
                "  where id_orden= '"+ID+"'";
                
                ps = conectar().prepareStatement(sq);
                myRS = ps.executeQuery();
                    
              
                txtTotalOrneed.setText(numCadena);
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }
    

    public void VerPrecio(){
        
        
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = nroOrden;
                   
            try {
                String sql = "select  precio From plato p join orden_platillos o on p.id_plato = o.plato_id_plato where nombre = '"+plato+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                 
                    int as = myRS.getInt(1);
                    
                    String exs = "";
                    if(ext>2){
                        exs = "Extra";
                    txtArea.append(""+as+"  "+exs+" "+agregarExtra+" "+ext);
                    }else{
                    txtArea.append(""+as+"  "+exs);}
                    
                    
                    
                  
              
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }
    

    public void CalcularTotalDiario(){
       
            
          

                   
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql = "select sum(TOTAL_COSTO) from orden";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    int total = myRS.getInt(1);
                    
                    String numCadena= String.valueOf(total);
                    
                    
                            
                  
                   
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }


    public void llenarCboPlato() {
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
    
    
    public void llenarCboProducto() {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre from producto";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboProducto.addItem("seleccione");   
                while(rs.next()){
            
            cboProducto.addItem(rs.getString(1));
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    }    
    
    
    public void llenarCboEliminar() {
        try {
            Connection con;
            try {
                cboEliminar.removeAllItems();

                
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select id_pedido from orden_platillos where orden_id_orden = "+nroOrden+"";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
                cboEliminar.addItem("Nro pedido");
                while(rs.next()){
            
            cboEliminar.addItem(rs.getString(1));
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
                new VistaPedidoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JComboBox<String> cboPlato;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtClienteRut;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtExtras;
    private javax.swing.JTextField txtTotalOrneed;
    private javax.swing.JTextField txtTotal_costo;
    // End of variables declaration//GEN-END:variables
}
