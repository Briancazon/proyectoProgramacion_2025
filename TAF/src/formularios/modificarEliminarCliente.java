
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
public class modificarEliminarCliente extends javax.swing.JPanel {
    Connection cx=conexion.conexion.conexion();
    ResultSet rs;
    
    DefaultTableModel tabla=new DefaultTableModel();
    Object[] datos=new Object[4];

    /**
     * Creates new form modificarEliminarCliente
     */
    public modificarEliminarCliente() {
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
    
     void listar(){
         tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre y Apellido");

    tabla.addColumn("Telefono");
    tabla.addColumn("Dirección");
     
    
 
    try{
        tablaClientes.setModel(tabla);
        rs=clases.cliente.verTodosClientes(cx);
        while(rs.next()){
            datos[0]=rs.getString("apenom");
         
            datos[1]=rs.getString("telefono");
            datos[2]=rs.getString("direccion");
           
            tabla.addRow(datos);
        }
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar un cliente","ERROR",ERROR_MESSAGE);
        
    }
    }
    
     public void habilitarBotonBuscar(){
       if( !txtApellido.getText().isEmpty()){
           botonBuscar.setEnabled(true);
       }else{
           botonBuscar.setEnabled(false);
       }
    }
     
     public void habilitarBotonGuardar(){
       if( !txtApenom.getText().isEmpty() && !txtApenom.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtTelefono.getText().isEmpty()){
           botonGuardar.setEnabled(true);
       }else{
           botonGuardar.setEnabled(false);
       }
    }
    void limpiar(){
         txtApenom.setText("");
        
        txtTelefono.setText("");
        txtDireccion.setText("");

        
        txtApenom.setEnabled(false);
   
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
       
    }
    
    void desactivarCampos(){
        txtApenom.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
    }
    
    
    void activarCampos(){
        txtApenom.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
    }
    void cancelar(){
          txtApenom.setText("");

        txtTelefono.setText("");
        txtDireccion.setText("");
      
                
        txtApenom.setEnabled(false);
   
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
       
        
      
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
    
    
    void desactivarCancelar(){
        botonCancelar.setEnabled(false);
    }
    
    void activarCancelar(){
        botonCancelar.setEnabled(true);
    }
    
    
    
    void desactivarGuardar(){
        botonGuardar.setEnabled(false);
    }
    
    void activarGuardar(){
        botonGuardar.setEnabled(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtApenom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        botonEditar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Modificación o Eliminación de Clientes");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre y/o Apellido");

        txtApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre y Apellido");

        txtApenom.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtApenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApenomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApenomKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Dirección");

        txtDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Teléfono");

        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
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
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
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

        botonListar.setBackground(new java.awt.Color(95, 158, 160));
        botonListar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonListar.setForeground(new java.awt.Color(255, 255, 255));
        botonListar.setText("LISTAR");
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtApenom, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(146, 146, 146)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(462, 462, 462))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(216, 216, 216)
                                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(243, 243, 243))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(botonListar))
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
          
     
       String apenom=txtApenom.getText();
       String telefono= txtTelefono.getText();
       String direccion= txtDireccion.getText();
       
      if(apenom.trim().isEmpty()  || telefono.trim().isEmpty() || direccion.trim().isEmpty()  ){
          JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",ERROR_MESSAGE);
          return;
      } 
       try{
           int filaSeleccionada = tablaClientes.getSelectedRow();
              String apenomT   = tablaClientes.getValueAt(filaSeleccionada, 0).toString();
              String telefonoT  = tablaClientes.getValueAt(filaSeleccionada, 1).toString();
                int codigoCliente=clases.cliente.obtenerCodigoCliente(cx, apenomT, telefonoT );
          
           //update
           clases.cliente.updateCliente(cx, txtApenom.getText(), txtTelefono.getText(), txtDireccion.getText(), codigoCliente );
           JOptionPane.showMessageDialog(null, "Se han actualizado los datos correctamente");
           limpiar();
           desactivarGuardar();
           desactivarCancelar();
           listar();
          
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al actualizar el cliente","ERROR",ERROR_MESSAGE);
        
       }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
    //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaClientes' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre y Apellido");

    tabla.addColumn("Telefono");
    tabla.addColumn("Dirección");
    
    
    String apenom=txtApellido.getText();
    try{
        
        rs=clases.cliente.verCliente(cx,apenom);
     
        while(rs.next()){
            
            datos[0]=rs.getString("apenom");
            datos[1]=rs.getString("telefono");
            datos[2]=rs.getString("direccion");
            
            tabla.addRow(datos);
            
            desactivarEliminar();

           desactivarCancelar();
           desactivarGuardar();
           desactivarEditar();
           cancelar();
        }
       tablaClientes.setModel(tabla);
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar un cliente","ERROR",ERROR_MESSAGE);

        
    }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        try{
            int filaSeleccionada = tablaClientes.getSelectedRow();
            

            String apenom =tablaClientes.getValueAt(filaSeleccionada, 0).toString();
            String telefono =tablaClientes.getValueAt(filaSeleccionada, 1).toString();
            String direccion =tablaClientes.getValueAt(filaSeleccionada, 2).toString();
           
            
            txtApenom.setText(apenom);

            txtTelefono.setText(telefono);
            txtDireccion.setText(direccion);
            activarEliminar();
            activarEditar();
            desactivarGuardar();
            desactivarCancelar();
            desactivarCampos();
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       
        int respuesta = JOptionPane.showConfirmDialog(
       null,
       "¿Estás seguro de que deseas eliminar a este cliente?",
       "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
       );
        if (respuesta == JOptionPane.YES_OPTION){
          try{
              int filaSeleccionada = tablaClientes.getSelectedRow();
              String apenom   = tablaClientes.getValueAt(filaSeleccionada, 0).toString();
              String telefono   = tablaClientes.getValueAt(filaSeleccionada, 1).toString();
            clases.cliente.eliminarCliente(cx, apenom, telefono);
             JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
             desactivarEliminar();
            limpiar();
            desactivarEditar();
            listar();
            
          }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar eliminar el cliente","ERROR",ERROR_MESSAGE);
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

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
       habilitarBotonBuscar();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
         char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ') || txtApellido.getText().length()>18 ) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtApenomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApenomKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtApenomKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtApenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApenomKeyTyped
          char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ' )|| txtApenom.getText().length()>21 ) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtApenomKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
            char c=evt.getKeyChar();
      if ( !(Character.isLetter(c) || Character.isDigit(c) || c==' ' ) || txtDireccion.getText().length()>40){
          evt.consume();
      }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
                   char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtTelefono.getText().length()>12) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
listar();
 desactivarEliminar();

           desactivarCancelar();
           desactivarGuardar();
           desactivarEditar();
           cancelar();
           txtApellido.setText("");
    }//GEN-LAST:event_botonListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApenom;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
