
package formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class verGastos extends javax.swing.JPanel {
      Connection cx=conexion.conexion.conexion();
     DefaultTableModel tabla=new DefaultTableModel();
      Object[] datos=new Object[1];
      ResultSet rs;

  
    public verGastos() {
        initComponents();
        desactivarBuscar();
        listar();
    }
    
     public void habilitarBotonBuscar(){
       if( !txtNombre.getText().isEmpty()){
           botonBuscar.setEnabled(true);
       }else{
           botonBuscar.setEnabled(false);
       }
    }
     
     void desactivarBuscar(){
         botonBuscar.setEnabled(false);
     }
void listar(){
      //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre del gasto");  
        try{
           tablaGastos.setModel(tabla);
             rs= clases.gasto.verTodosGastos(cx);
              while(rs.next()){
                   datos[0]=rs.getString("nombre_gasto");
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la zona","ERROR",ERROR_MESSAGE);
       }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGastos = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de Gastos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del gasto");

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(51, 102, 255));
        botonBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
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

        tablaGastos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaGastos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(657, 657, 657))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(463, 463, 463))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(576, 576, 576)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(botonListar))
                .addGap(111, 111, 111)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
 listar();
 txtNombre.setText("");
    }//GEN-LAST:event_botonListarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
                       //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Nombre del gasto");  
        try{
           tablaGastos.setModel(tabla);
             rs= clases.gasto.verGasto(cx, txtNombre.getText());
              while(rs.next()){
                   datos[0]=rs.getString("nombre_gasto");
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la zona","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
                  char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  || txtNombre.getText().length()>21) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBotonBuscar();
    }//GEN-LAST:event_txtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaGastos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
