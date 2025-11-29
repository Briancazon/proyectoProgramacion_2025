
package formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class cargarZona extends javax.swing.JPanel {
     Connection cx=conexion.conexion.conexion();
     DefaultTableModel tabla=new DefaultTableModel();
      Object[] datos=new Object[1];
      ResultSet rs;

 
    public cargarZona() {
        initComponents();
        habilitarBotonGuardar();
        habilitarBotonBuscar();
        listar();
    }
    void limpiar(){
        txtZona.setText("");
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
     public void habilitarBotonGuardar(){
       if( !txtZona.getText().isEmpty()){
           botonGuardar.setEnabled(true);
       }else{
           botonGuardar.setEnabled(false);
       }
    }
     
      public void habilitarBotonBuscar(){
       if( !txtZonaBuscador.getText().isEmpty()){
           botonBuscar.setEnabled(true);
       }else{
           botonBuscar.setEnabled(false);
       }
    }
      
      void desactivarGuardar(){
          botonGuardar.setEnabled(false);
      }
      
      void desactivarBuscar(){
          botonBuscar.setEnabled(false);
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtZonaBuscador = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaZonas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Carga de Zona");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre ");

        txtZona.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZonaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZonaKeyTyped(evt);
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

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Buscar Zona por nombre");

        txtZonaBuscador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtZonaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZonaBuscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZonaBuscadorKeyTyped(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(95, 158, 160));
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
        jScrollPane1.setViewportView(tablaZonas);

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
                .addGap(707, 707, 707)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75)
                        .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtZonaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtZonaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
          try{
           if(txtZona.getText().trim().isEmpty()){
               JOptionPane.showMessageDialog(null, "El campo es obligatorio","ERROR",ERROR_MESSAGE);
               return;
           }
            clases.zona.cargarZona(cx, txtZona.getText(), 0);
            JOptionPane.showMessageDialog(this, "Se ha cargado correctamente la zona");
            limpiar();
            desactivarGuardar();
            listar();
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar una zona","ERROR",ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
                   //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre");  
        try{
           tablaZonas.setModel(tabla);
             rs= clases.zona.verZona(cx, txtZonaBuscador.getText());
              while(rs.next()){
                   datos[0]=rs.getString("nombre_zona");
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la zona","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
listar();
txtZonaBuscador.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtZonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZonaKeyTyped
         char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtZona.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtZonaKeyTyped

    private void txtZonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZonaKeyReleased
        habilitarBotonGuardar();
    }//GEN-LAST:event_txtZonaKeyReleased

    private void txtZonaBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZonaBuscadorKeyTyped
         char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtZonaBuscador.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtZonaBuscadorKeyTyped

    private void txtZonaBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZonaBuscadorKeyReleased
        habilitarBotonBuscar();
    }//GEN-LAST:event_txtZonaBuscadorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaZonas;
    private javax.swing.JTextField txtZona;
    private javax.swing.JTextField txtZonaBuscador;
    // End of variables declaration//GEN-END:variables
}
