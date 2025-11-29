
package Formulario2;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class login_registro extends javax.swing.JFrame {
     Connection cx=conexion.conexion.conexion();
     login_iniciarSesion login= new login_iniciarSesion();
  
    public login_registro() {
        initComponents();
        this.setLocationRelativeTo(null);  //centrar
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        labelCuenta = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmarContraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Registro de Usuario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        labelCuenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCuenta.setText("¿Ya tienes una cuenta?");
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

        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Confirmar Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(289, 289, 289))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(labelCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel2)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(113, 113, 113)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5)
                        .addGap(62, 62, 62)
                        .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCuenta)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        try{
            ///vericamos que no haya campos vacios...
            if(txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty() || txtConfirmarContraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",ERROR_MESSAGE);
                return;
            }
            
            ///verificamos que los campos contraseña y confirmar contraseña sean iguales, de lo contrario el sistema no le permitirá registrar
            if(!txtContraseña.getText().equals(txtConfirmarContraseña.getText())){
                JOptionPane.showMessageDialog(null, "Deben coincidir los dos campos que piden la contraseña y la confirmación de la misma","ERROR",ERROR_MESSAGE);
                return;
            }
            
            //vericamos si ya existe ese usuario..
            int existe=clases.usuario.consultarSiExisteUsuario(cx, txtUsuario.getText());
            if(existe==1){
                  JOptionPane.showMessageDialog(null, "Ese nombre de usuario no se encuentra disponible","ERROR",ERROR_MESSAGE);
                   return;
            }
            
            //una vex pasado todos los filtros, recien insertamos...
            clases.usuario.insertar(cx, txtUsuario.getText(), txtContraseña.getText());
            JOptionPane.showMessageDialog(null, "Se ha registrado el usuario correctamente");
            this.dispose(); //cerramos el form registro..
            login.setVisible(true);  //hacemos visible el login, es decir, que abra el login

        } catch(Exception e){
               JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar registrar el usuario","ERROR",ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void labelCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCuentaMouseEntered
        labelCuenta.setForeground(Color.BLUE); // color cuando pasa el mouse
        labelCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR)); // cursor de mano
    }//GEN-LAST:event_labelCuentaMouseEntered

    private void labelCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCuentaMouseExited
      labelCuenta.setForeground(new Color(187, 187, 187)); //color original
    }//GEN-LAST:event_labelCuentaMouseExited

    private void labelCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCuentaMouseClicked
       login_iniciarSesion reg = new login_iniciarSesion();  // Crear el formulario de longin (iniciar sesion)
       this.dispose();                 // Cerrar login
       reg.setVisible(true);           // Mostrarlo
    
       
    }//GEN-LAST:event_labelCuentaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelCuenta;
    private javax.swing.JTextField txtConfirmarContraseña;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
