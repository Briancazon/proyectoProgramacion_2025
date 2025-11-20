
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class producto extends javax.swing.JPanel {
      ResultSet rs;
    Connection cx=conexion.conexion.conexion();
  
    DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[3]; 
    formula1 f1 ;


    public producto(formula1 form) {
        initComponents();
           this.f1 = form;
        desactivarBotonSeleccionar();
        cargarProductosActivos();
    }
    
    void cargarProductosActivos(){
              
           tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Descripción");
           tabla.addColumn("Marca");
          tabla.addColumn("Precio");
     

     try{
        
        rs=clases.producto.verTodosProductos(cx);
     
        while(rs.next()){
            datos[0]=rs.getString("descripcion");
            datos[1]=rs.getString("marca");
            datos[2]=rs.getString("precio");
            
            
           
            tabla.addRow(datos);
        }
         tablaProductos.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar el producto","ERROR",ERROR_MESSAGE);
        
    }
    }
    void activarBotonSeleccionar(){
        botonSeleccionar.setEnabled(true);
    }
    
     void desactivarBotonSeleccionar(){
        botonSeleccionar.setEnabled(false);
    }
      
            

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        botonSeleccionar = new javax.swing.JButton();

        jLabel1.setText("PRODUCTOS");

        jLabel2.setText("Descripción");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descripción", "Marca", "Precio"
            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        botonSeleccionar.setText("SELECCIONAR PRODUCTO");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonSeleccionar)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
           tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Descripción");
           tabla.addColumn("Marca");
          tabla.addColumn("Precio");
     
    
      String descripcion=txtProducto.getText();
     try{
        
        rs=clases.producto.verProducto(cx, descripcion);
     
        while(rs.next()){
            datos[0]=rs.getString("descripcion");
            datos[1]=rs.getString("marca");
            datos[2]=rs.getString("precio");
            
            
           
            tabla.addRow(datos);
        }
         tablaProductos.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar el producto","ERROR",ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
          
        try{
            int filaSeleccionada = tablaProductos.getSelectedRow();
            
            
            String producto=tablaProductos.getValueAt(filaSeleccionada, 0).toString();
            f1.setTxtProducto(producto);
      
          
          SwingUtilities.getWindowAncestor(this).dispose();  ///cierra  este panel y vuelve al anterior(formula1)

     
            

       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        try{
              activarBotonSeleccionar();
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_tablaProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
