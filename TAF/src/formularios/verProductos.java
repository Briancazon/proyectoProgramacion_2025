package formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class verProductos extends javax.swing.JPanel {
        Connection cx=conexion.conexion.conexion();
     DefaultTableModel tabla=new DefaultTableModel();
      Object[] datos=new Object[3];
      ResultSet rs;

   
    public verProductos() {
        initComponents();
        desactivarBuscar();
        listar();
    }
    
    void listar(){
               //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Descripion");
    tabla.addColumn("Marca"); 
    tabla.addColumn("Precio"); 

        try{
           tablaProductos.setModel(tabla);
             rs= clases.producto.verTodosProductos(cx);
              while(rs.next()){
                   datos[0]=rs.getString("descripcion");
                   datos[1]=rs.getString("marca");
                   datos[2]=rs.getString("precio");
                   
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la zona","ERROR",ERROR_MESSAGE);
       }
    }
    public void habilitarBotonBuscar(){
       if( !txtDescripcion.getText().isEmpty()){
           botonBuscar.setEnabled(true);
       }else{
           botonBuscar.setEnabled(false);
       }
    }
    void desactivarBuscar(){
        botonBuscar.setEnabled(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        botonListar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Consulta Productos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Descripcion");

        txtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
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

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProductos);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(553, 553, 553)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(640, 640, 640))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(527, 527, 527))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListar)
                    .addComponent(botonBuscar))
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
   //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Descripcion");
    tabla.addColumn("Marca"); 
    tabla.addColumn("Precio"); 

        try{
           tablaProductos.setModel(tabla);
              rs= clases.producto.verProducto(cx, txtDescripcion.getText());
              while(rs.next()){
                   datos[0]=rs.getString("descripcion");
                   datos[1]=rs.getString("marca");
                   datos[2]=rs.getString("precio");
                   
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar el producto","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
   listar();
   txtDescripcion.setText("");
    }//GEN-LAST:event_botonListarActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
          char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' '|| Character.isDigit(c)) || txtDescripcion.getText().length()>21 ) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        habilitarBotonBuscar();
    }//GEN-LAST:event_txtDescripcionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
