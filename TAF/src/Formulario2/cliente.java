
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brian
 */
public class cliente extends javax.swing.JPanel {
      ResultSet rs;
    Connection cx=conexion.conexion.conexion();
  
    DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[3]; 
    formula1 f1 ;
    int origen;    // indica qué botón abrió este pane
     


   
    public cliente(formula1 form, int origen) {
        initComponents();
        this.f1 = form;
         this.origen = origen;
         desactivarBotonSeleccionar();
         cargarClientesActivos();
    }

    
void activarBotonSeleccionar(){
    botonSeleccionar.setEnabled(true);
}

void desactivarBotonSeleccionar(){
    botonSeleccionar.setEnabled(false);
}

void cargarClientesActivos(){
        tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Nombre y Apellido");
           tabla.addColumn("Teléfono");
          tabla.addColumn("Dirección");
     

     try{
        
        rs=clases.cliente.verTodosClientes(cx);
     
        while(rs.next()){
            datos[0]=rs.getString("apenom");
            datos[1]=rs.getString("telefono");
            datos[2]=rs.getString("direccion");
            
            
           
            tabla.addRow(datos);
        }
         tablaClientes.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar el cliente","ERROR",ERROR_MESSAGE);
        
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApenom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        botonSeleccionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel1.setText("Nombre Cliente");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre y apellido", "Teléfono", "Dirección"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        botonSeleccionar.setText("SELECCIONAR CLIENTE");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        jLabel2.setText("CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(txtApenom, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(botonSeleccionar)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        
        try{
            int filaSeleccionada = tablaClientes.getSelectedRow();
            
            
            String nombre=tablaClientes.getValueAt(filaSeleccionada, 0).toString();
            
            
            if(origen==1){
                    f1.setTxtPrueba(nombre);
            }else if(origen==2){
                    f1.setTxtNombreCliente2(nombre);
                
            }else{
                f1.setTxtNombreCliente3(nombre);
            }
      
          
          SwingUtilities.getWindowAncestor(this).dispose();

     
            

       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
     
        
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
           tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Nombre y Apellido");
           tabla.addColumn("Teléfono");
          tabla.addColumn("Dirección");
     
    
      String nombre=txtApenom.getText();
     try{
        
        rs=clases.cliente.verCliente(cx, nombre);
     
        while(rs.next()){
            datos[0]=rs.getString("apenom");
            datos[1]=rs.getString("telefono");
            datos[2]=rs.getString("direccion");
            
            
           
            tabla.addRow(datos);
        }
         tablaClientes.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar el cliente","ERROR",ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
      try{
           activarBotonSeleccionar();

       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_tablaClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApenom;
    // End of variables declaration//GEN-END:variables
}
