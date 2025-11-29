
package formularios;

import java.sql.Connection;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class cargaGastos extends javax.swing.JPanel {
      Connection cx=conexion.conexion.conexion();

    
    public cargaGastos() {
        initComponents();
        desactivarGuardar();
    }
    
      public void habilitarBotonGuardar(){
       if( !txtNombre.getText().isEmpty()){
           botonGuardar.setEnabled(true);
       }else{
           botonGuardar.setEnabled(false);
       }
    }
      void desactivarGuardar(){
          botonGuardar.setEnabled(false);
      }
      
      void limpiar(){
          txtNombre.setText("");
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Carga Gastos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del Gasto");

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(51, 102, 255));
        botonGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel2)
                .addGap(129, 129, 129)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(639, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(696, 696, 696))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(249, 249, 249)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 442, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try{
            if(txtNombre.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "No se aceptan campos vacíos","ERROR",ERROR_MESSAGE);  
                    return;
            }
            clases.gasto.cargarGasto(cx, txtNombre.getText());
   
            JOptionPane.showMessageDialog(null, "Se ha cargado el gasto correctamente");  
          
            limpiar();
            desactivarGuardar();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar el gasto","ERROR",ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
                 char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtNombre.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
