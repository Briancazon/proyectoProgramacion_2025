
package formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class eliminarProducto extends javax.swing.JPanel {
      Connection cx=conexion.conexion.conexion();
     DefaultTableModel tabla=new DefaultTableModel();
      Object[] datos=new Object[4];
      ResultSet rs;

    
    public eliminarProducto() {
        initComponents();
        desactivarEliminar();
        listar();
    }
    
    
      void listar(){
               //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
      tabla.addColumn("Código");
    tabla.addColumn("Descripion");
    tabla.addColumn("Marca"); 
    tabla.addColumn("Precio"); 

        try{
           tablaProductos.setModel(tabla);
             rs= clases.producto.verTodosProductos(cx);
              while(rs.next()){
                        datos[0]=rs.getString("codigo");
                   datos[1]=rs.getString("descripcion");
                   datos[2]=rs.getString("marca");
                   datos[3]=rs.getString("precio");
                   
                  
                   tabla.addRow(datos);

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar los productos","ERROR",ERROR_MESSAGE);
       }
    }
     
    void activarEliminar(){
        botonEliminar.setEnabled(true);
    }
    
    void desactivarEliminar(){
        botonEliminar.setEnabled(false);
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
        botonEliminar = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Eliminar Producto");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Descripción");

        txtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        botonBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        botonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonListar.setBackground(new java.awt.Color(95, 158, 160));
        botonListar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(674, 674, 674))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(botonBuscar)
                    .addComponent(botonListar))
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
    //'tabla' es el objeto creado de tipo DefaultTableModel(en donde le confuguramos un modelo) , y 'tablaZonas' es la tabla que hemos creado en el formulario.
    tabla.setRowCount(0);   
    tabla.setColumnCount(0);
    tabla.addColumn("Código");
    tabla.addColumn("Descripion");
    tabla.addColumn("Marca"); 
    tabla.addColumn("Precio"); 

        try{
           tablaProductos.setModel(tabla);
             rs= clases.producto.verProducto(cx, txtDescripcion.getText());
              while(rs.next()){
                   datos[0]=rs.getString("codigo");
                   datos[1]=rs.getString("descripcion");
                   datos[2]=rs.getString("marca");
                   datos[3]=rs.getString("precio");
                   
                   
                  
                   tabla.addRow(datos);
                   

              }
             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error un producto","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
       try{
            int filaSeleccionada = tablaProductos.getSelectedRow();
            
            String codigo =tablaProductos.getValueAt(filaSeleccionada, 0).toString();

            activarEliminar();
            
     
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       int respuesta = JOptionPane.showConfirmDialog(
       null,
       "¿Estás seguro de que deseas eliminar este producto?",
       "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
       );

       if (respuesta == JOptionPane.YES_OPTION) {
             int filaSeleccionada = tablaProductos.getSelectedRow();
            
            String codigo =tablaProductos.getValueAt(filaSeleccionada, 0).toString();

            try{
               clases.producto.eliminarProducto(cx, Integer.parseInt(codigo));
               JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
   
               desactivarEliminar();
               listar();
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, "No hay datos en la tabla","ERROR",ERROR_MESSAGE);
            }
            
       } else {
           JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminación");
           desactivarEliminar();
       }
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        listar();
        txtDescripcion.setText("");
    }//GEN-LAST:event_botonListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
