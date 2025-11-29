
package formularios;

import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class cargaProductos extends javax.swing.JPanel {
       Connection cx=conexion.conexion.conexion();

    public cargaProductos() {
        initComponents();
        desactivarGuardar();
    }
    
     public void habilitarBotonGuardar(){
       if( !txtDescripcion.getText().isEmpty() && !txtMarca.getText().isEmpty() && !txtPrecio.getText().isEmpty()){
           botonGuardar.setEnabled(true);
       }else{
           botonGuardar.setEnabled(false);
       }
    }
     
     void desactivarGuardar(){
         botonGuardar.setEnabled(false);
     }
     void limpiar(){
         txtDescripcion.setText("");
         txtMarca.setText("");
         txtPrecio.setText("");
     }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Carga Productos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Descripción");

        txtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Marca");

        txtMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Precio");

        txtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(118, 118, 118)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(txtMarca)
                    .addComponent(txtPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 737, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(661, 661, 661))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4)))
                .addGap(160, 160, 160)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        try{
            if( txtDescripcion.getText().trim().isEmpty() || txtMarca.getText().trim().isEmpty() || txtPrecio.getText().trim().isEmpty()){
                 JOptionPane.showMessageDialog(null, "No se permiten campos vacíos","ERROR",ERROR_MESSAGE);
                 return;
            }
                    float precio= Float.parseFloat(txtPrecio.getText());
            clases.producto.cargarProducto(cx, txtDescripcion.getText(), txtMarca.getText(),precio );
             JOptionPane.showMessageDialog(null, "Se ha cargado correctamente el producto");
            limpiar();
            desactivarGuardar();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' '|| Character.isDigit(c)) || txtDescripcion.getText().length()>21 ) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
                      char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtMarca.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
                      char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtPrecio.getText().length()>12) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
         habilitarBotonGuardar();
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtPrecioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
