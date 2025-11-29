
package Formulario2;

import clases.sesion;
import formularios.modificarUsuario;
import formularios.principal;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class login_iniciarSesion extends javax.swing.JFrame {

   principal p= new principal();
   modificarUsuario mu=new modificarUsuario();
     Connection cx=conexion.conexion.conexion();
   
    public login_iniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);  //centrar
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("INICIAR SESIÓN");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        jButton1.setText("INICIAR SESIÓN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelCuenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCuenta.setText("¿No tienes una cuenta?");
        labelCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCuentaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(labelCuenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(327, 327, 327))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCuenta))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
             
             //fiiltro para que no hayan campos vacios..
             if(txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios","ERROR",ERROR_MESSAGE);
                   return;
             }
             //filtro para verificar si existe un usuario activo con ese usuario y contraseña...
              int existe=clases.usuario.consultarSiCoincideUsuarioYContraseña(cx, txtUsuario.getText(), txtContraseña.getText());
              if(existe==0){
                  JOptionPane.showMessageDialog(null, "El usuario y/o contraseña no coinciden con ningun registro en la base de datos","ERROR",ERROR_MESSAGE);
                   return;
              }
              
              //en caso de que pase los filtros quiere decir que el  usuario existe en el sistema , por lo tanto se le permtite el ingreso....
              
              p.setLabelBienvenida("Bienvenido/a "+txtUsuario.getText()); //l le hacemos un set al labelBienvenida del principal para que se muestre en el panel de inicio(principal)
            sesion.setUsuario(txtUsuario.getText());
            sesion.setContraseña(txtContraseña.getText());

              
              this.dispose(); //cerramos este form
               
              p.setVisible(true);
             
         } catch(Exception e){
               JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar entrar al sistema","ERROR",ERROR_MESSAGE);
                   return;
         }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCuentaMouseClicked
         login_registro reg = new login_registro();  // Crear el formulario de registro
           this.dispose();                 // Cerrar login
         reg.setVisible(true);           // Mostrarlo
      
    }//GEN-LAST:event_labelCuentaMouseClicked

    private void labelCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCuentaMouseEntered
          labelCuenta.setForeground(Color.BLUE); // color cuando pasa el mouse
        labelCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR)); // cursor de mano
    }//GEN-LAST:event_labelCuentaMouseEntered

    private void labelCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCuentaMouseExited
          labelCuenta.setForeground(new Color(187, 187, 187)); //color original
    }//GEN-LAST:event_labelCuentaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelCuenta;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
