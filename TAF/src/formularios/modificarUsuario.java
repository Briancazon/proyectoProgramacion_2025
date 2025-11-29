
package formularios;

import clases.sesion;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

public class modificarUsuario extends javax.swing.JPanel {
     Connection cx=conexion.conexion.conexion();
      DefaultTableModel tabla=new DefaultTableModel();
      Object[] datos=new Object[3];
      ResultSet rs;
      String usuario;
      String contraseña;

    /**
     * Creates new form modificarUsuario
     */
    public modificarUsuario() {
        initComponents();
        cancelar();
        desactivarGuardar();
        desactivarCancelar();

  
        setearCampos();
    }
    
   
    
    void activarGuardar(){
        botonGuardar.setEnabled(true);
    }
    void activarCancelar(){
        botonCancelar.setEnabled(true);
    }
    
     void desactivarGuardar(){
        botonGuardar.setEnabled(false);
    } 
     
    void desactivarCancelar(){
        botonCancelar.setEnabled(false);
    }
    void editar(){
        txtUsuario.setEnabled(true);
        txtContraseña.setEnabled(true);
    }
    
    void activarEliminar(){
        botonEliminar.setEnabled(true);
    }
    
       void desactivarEliminar(){
        botonEliminar.setEnabled(false);
    }
       
       void activarEditar(){
           botonEditar.setEnabled(true);
       }
       
         void desactivarEditar(){
           botonEditar.setEnabled(false);
       }
       
       void activarCampos(){
           txtUsuario.setEnabled(true);
           txtContraseña.setEnabled(true);
       }
       
         void desactivarCampos(){
           txtUsuario.setEnabled(false);
           txtContraseña.setEnabled(false);
       }
       
    void cancelar(){
        txtUsuario.setEnabled(false);
        txtContraseña.setEnabled(false);
        txtUsuario.setText(this.usuario);
        txtContraseña.setText(this.contraseña);
        
       
    }
   
    //metodo que hace set a los campos txt...
    void setearCampos(){
        this.usuario= sesion.getUsuario();
        this.contraseña=sesion.getContraseña();
        txtUsuario.setText(this.usuario);
        txtContraseña.setText(this.contraseña);

    }
    
    void limpìar(){
         tabla.setRowCount(0); 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Modificación Usuario");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Usuario");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(51, 102, 255));
        botonGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR CAMBIOS");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Contraseña");

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(142, 142, 142)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(541, 541, 541))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(616, 616, 616))))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(73, 73, 73)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCancelar)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardar)
                            .addComponent(botonEditar))
                        .addGap(428, 428, 428))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

   

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
       editar();
       activarGuardar();
       activarCancelar();
       desactivarEditar();
       desactivarEliminar();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        try{
            int codigo_usuario=clases.usuario.obtenerCodigo(cx, this.usuario);
         clases.usuario.update(cx,txtUsuario.getText(), txtContraseña.getText(), codigo_usuario);
         JOptionPane.showMessageDialog(null, "Se han modificado los datos de tu usuario correctamente");
         ///le mandamos a la sesion lso nuevos datos del usuario, para refrescar..
         sesion.setUsuario(txtUsuario.getText());
         sesion.setContraseña(txtContraseña.getText());
         setearCampos();
         desactivarGuardar();
         desactivarCancelar();
         desactivarCampos();
         activarEditar();
         activarEliminar();
         cancelar();
         
         limpìar();
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Ha ocurrido un error al actualizar el usuario","ERROR",ERROR_MESSAGE); 
     }        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        cancelar();
        desactivarCancelar();
        desactivarGuardar();
        activarEditar();
        activarEliminar();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
           char c=evt.getKeyChar();
        
      if (txtUsuario.getText().length()>15 ) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
           char c=evt.getKeyChar();
        
      if (txtContraseña.getText().length()>15 ) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
         
         int respuesta = JOptionPane.showConfirmDialog(
       null,
       "¿Estás seguro de que deseas eliminar tu usuario?",
       "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
       );
        if (respuesta == JOptionPane.YES_OPTION){

            

  
      
          try{
           int codigo_usuario=   clases.usuario.obtenerCodigo(cx, this.usuario);
            clases.usuario.eliminar(cx, codigo_usuario);
             JOptionPane.showMessageDialog(null, "se ha eliminado correctamente tu usuario, cerrando aplicación");
             System.exit(0);
        
             
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de eliminar tu usuario","ERROR",ERROR_MESSAGE); 
          }
        }else{
             JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminación");
             activarEliminar();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
