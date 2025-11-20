
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class transferencia extends javax.swing.JPanel {
   ResultSet rs;
    Connection cx=conexion.conexion.conexion();
    DefaultComboBoxModel ls2= new DefaultComboBoxModel();
    DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[4]; 

 
    public transferencia() {
        initComponents();
        cargarComboPreventista();
        desactivarBotonGuardar();
        desactivarBotonEditar();
        desactivarBoxEstado();
    }
    
   
    
    void desactivarBoxEstado(){
        boxEstado.setEnabled(false);
    }
    void activarBoxEstado(){
        boxEstado.setEnabled(true);
    }
    
    
    void desactivarBotonGuardar(){
        botonGuardar.setEnabled(false);
    }
    
        void activarBotonGuardar(){
        botonGuardar.setEnabled(true);
    }
        
        
        
        void desactivarBotonEditar(){
            botonEditar.setEnabled(false);
        }
        
         void activarBotonEditar(){
            botonEditar.setEnabled(true);
        }
    
    
     void cargarComboPreventista(){
        try{
            rs=clases.preventista.listarPreventistas(cx);
            
            while(rs.next())
                ls2.addElement(rs.getString("apellido"));
                boxPreventista.setModel(ls2);
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar los preventistas","ERROR",ERROR_MESSAGE);
        }
    }
     
     


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTransferencias = new javax.swing.JTable();
        boxEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boxPreventista = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaTransferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Cliente", "Monto", "Estado"
            }
        ));
        tablaTransferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTransferenciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTransferencias);

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Acreditado" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Estado");

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Preventista");

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("TRANSFERENCIAS");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 385, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(643, 643, 643))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
           tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Fecha");
           tabla.addColumn("Cliente");
          tabla.addColumn("Monto");
          tabla.addColumn("Estado");
    
    String preventista=boxPreventista.getSelectedItem().toString();
     try{
        int id=clases.preventista.obetnerId(cx, preventista);
        rs=clases.rendicion.verTransferencias(cx, id);
     
        while(rs.next()){
            datos[0]=rs.getString("tra.fecha");
            datos[1]=rs.getString("cli.apenom");
            datos[2]=rs.getString("tra.monto");
            datos[3]=rs.getString("tra.estado");
            
           
            tabla.addRow(datos);
        }
         tablaTransferencias.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar las transferencias del preventista "+boxPreventista.getSelectedItem(),"ERROR",ERROR_MESSAGE);
        
    }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaTransferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTransferenciasMouseClicked
       try{
           int filaSeleccionada=tablaTransferencias.getSelectedRow();
           String estado=tablaTransferencias.getValueAt(filaSeleccionada, 3).toString();
           boxEstado.setSelectedItem(estado);
           activarBotonEditar();
           desactivarBotonGuardar();
           desactivarBoxEstado();
       }catch(Exception e){
          
       }
    }//GEN-LAST:event_tablaTransferenciasMouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       try{
            int filaSeleccionada = tablaTransferencias.getSelectedRow();
            
            String fecha=tablaTransferencias.getValueAt(filaSeleccionada, 0).toString();
            String cliente =tablaTransferencias.getValueAt(filaSeleccionada, 1).toString();
            
     
            
            
              
            String preventista=boxPreventista.getSelectedItem().toString();
      
       
            try{
              
              int id_p=clases.preventista.obetnerId(cx, preventista);
              int id_c=clases.cliente.obtenerCodigoCliente(cx, cliente);
              int id_r=clases.rendicion.buscarIdRendicion(cx, fecha, id_p);
              clases.rendicion.actualizarTransferenciasPendientes(cx, boxEstado.getSelectedItem().toString(), id_r, id_c);
          
              JOptionPane.showMessageDialog(null, "Se ha actualizado el estado de la transferencia correctamente");
              desactivarBotonGuardar();
              desactivarBoxEstado();
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "No se ha podido actualizar el estado de la transferencia","ERROR",ERROR_MESSAGE);
           }
            
          
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
     
       
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
       activarBoxEstado();
       activarBotonGuardar();
       desactivarBotonEditar();
    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxPreventista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTransferencias;
    // End of variables declaration//GEN-END:variables
}
