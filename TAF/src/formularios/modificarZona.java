/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brian
 */
public class modificarZona extends javax.swing.JPanel {
      Connection cx=conexion.conexion.conexion();
      DefaultTableModel tabla=new DefaultTableModel();
      Object[] datos=new Object[2];
      ResultSet rs;

    /**
     * Creates new form modificarZona
     */
    public modificarZona() {
        initComponents();
         cancelar();
        botonBuscar.setEnabled(false);
        desactivarCancelar();
        desactivarGuardar();
        desactivarEliminar();
        desactivarEditar();
        listar();
        desactivarCampos();
    }
    
     void cancelar(){
        txtZona2.setText("");
        txtZona2.setEnabled(false);
    }
    void editar(){
        txtZona2.setEnabled(true);
    }
    void limpiar (){
        txtZona.setText("");
        txtZona2.setText("");
        
    }
    
     public void habilitarBotonBuscar(){
       if( !txtZona.getText().isEmpty()){
           botonBuscar.setEnabled(true);
       }else{
           botonBuscar.setEnabled(false);
       }
    }
     
     void habilitarBotonGuardar(){
       if( !txtZona2.getText().isEmpty()){
           botonGuardar.setEnabled(true);
       }else{
           botonGuardar.setEnabled(false);
       }
    }
     
     void desactivarCancelar(){
         botonCancelar.setEnabled(false);
     }
     void desactivarGuardar(){
         botonGuardar.setEnabled(false);
     }
     void desactivarBotonBuscar(){
         botonBuscar.setEnabled(false);
     }
     void desactivarEliminar(){
         botonEliminar.setEnabled(false);
     }
     
     void activarCancelar(){
         botonCancelar.setEnabled(true);
     }
     void activarGuardar(){
         botonGuardar.setEnabled(true);
     }
     void activarEliminar(){
         botonEliminar.setEnabled(true);
     }
     
    void activarEditar(){
        botonEditar.setEnabled(true);
    }
    
    void desactivarEditar(){
        botonEditar.setEnabled(false);
    }
  void activarCampos(){
      txtZona2.setEnabled(true);
  }
  
  void desactivarCampos(){
      txtZona2.setEnabled(false);
  }
  
  void listar(){
                        //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre");  
        try{
           tablaZonas.setModel(tabla);
             rs= clases.zona.verTodasZonas(cx);
              while(rs.next()){
                   datos[0]=rs.getString("nombre_zona");
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la zona","ERROR",ERROR_MESSAGE);
       }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaZonas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtZona2 = new javax.swing.JTextField();
        botonEditar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Modificación  o Eliminicación de Zonas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        txtZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZonaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZonaKeyTyped(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaZonas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaZonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaZonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaZonas);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        txtZona2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZona2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZona2KeyTyped(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(51, 102, 255));
        botonGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(95, 158, 160));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("LISTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(502, 502, 502))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88)
                        .addComponent(txtZona2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(586, 586, 586))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(134, 134, 134)
                        .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
            //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre");  
        try{
            
             rs= clases.zona.verZona(cx, txtZona.getText());
              while(rs.next()){
                   datos[0]=rs.getString("nombre_zona");
                  
                   tabla.addRow(datos);
                   
                  
              }
             tablaZonas.setModel(tabla);
              limpiar();
              desactivarCampos();
               desactivarGuardar();
               desactivarCancelar();
               desactivarCampos();
               desactivarEliminar();
          }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar  la  xona","ERROR",ERROR_MESSAGE); 
          }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void tablaZonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaZonasMouseClicked
         try{
            int filaSeleccionada = tablaZonas.getSelectedRow();
            
            String nombre =tablaZonas.getValueAt(filaSeleccionada, 0).toString();
       
            
            txtZona2.setText(nombre);
            activarEliminar();
            activarEditar();
            desactivarGuardar();
            desactivarCancelar();
            desactivarCampos();
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_tablaZonasMouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
  

       if (txtZona2.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "No se permite campos en blanco","ERROR",ERROR_MESSAGE);
           return;
       }
        try{
             int filaSeleccionada = tablaZonas.getSelectedRow();
              String zona   = tablaZonas.getValueAt(filaSeleccionada, 0).toString();
            int id_zona=clases.zona.obtenerId(cx, zona);
            clases.zona.updateZona(cx,  txtZona2.getText(), id_zona);
            JOptionPane.showMessageDialog(null, "Se han actualizado los datos correctamente");
            limpiar();
           desactivarGuardar();
           desactivarCancelar();
           desactivarCampos();
           listar();

        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al guardar los cambios","ERROR",ERROR_MESSAGE);
             e.printStackTrace();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed


       
       int respuesta = JOptionPane.showConfirmDialog(
       null,
       "¿Estás seguro de que deseas eliminar a esta zona?",
       "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
       );
       
       if (respuesta == JOptionPane.YES_OPTION){
        try{
            int filaSeleccionada = tablaZonas.getSelectedRow();
              String zona   = tablaZonas.getValueAt(filaSeleccionada, 0).toString();
              int id_zona=clases.zona.obtenerId(cx, zona);
           clases.zona.eliminarZona(cx, id_zona);
            JOptionPane.showMessageDialog(null, "Se ha eliminado la zona correctamente");
          desactivarEliminar();
            limpiar();
            desactivarEditar();
           
            listar();
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error en la eliminación","ERROR",ERROR_MESSAGE);
       }
       }else{
            JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminación");
                desactivarEliminar();
            limpiar();
            desactivarEditar();
       }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
          activarCampos();
        desactivarEliminar();
        activarCancelar();
        activarGuardar();
        desactivarEditar();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
      cancelar();
        desactivarEliminar();
        desactivarGuardar();
        desactivarCancelar();
        desactivarCancelar();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void txtZonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZonaKeyTyped
          char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtZona.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtZonaKeyTyped

    private void txtZonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZonaKeyReleased
        habilitarBotonBuscar();
    }//GEN-LAST:event_txtZonaKeyReleased

    private void txtZona2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZona2KeyTyped
            char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtZona2.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtZona2KeyTyped

    private void txtZona2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZona2KeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtZona2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    listar();
    txtZona.setText("");
      limpiar();
              desactivarCampos();
               desactivarGuardar();
               desactivarCancelar();
               desactivarCampos();
               desactivarEliminar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaZonas;
    private javax.swing.JTextField txtZona;
    private javax.swing.JTextField txtZona2;
    // End of variables declaration//GEN-END:variables
}
