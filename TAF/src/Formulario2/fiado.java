
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class fiado extends javax.swing.JPanel {
     ResultSet rs;
    Connection cx=conexion.conexion.conexion();
    DefaultComboBoxModel ls2= new DefaultComboBoxModel();
    DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[6]; 

    public fiado() {
        initComponents();
        cargarComboPreventista();
    }
    
     void cargarComboPreventista(){
        try{
            rs=clases.preventista.listarPreventistas(cx);
            
            while(rs.next())
               ls2.addElement(rs.getString("apellido")+"---"+rs.getString("dni"));
                boxPreventista.setModel(ls2);
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar los preventistas","ERROR",ERROR_MESSAGE);
        }
    }
  
     
     void verFIadosPreventista(){
         
          tabla.setRowCount(0);   
          tabla.setColumnCount(0);
          tabla.addColumn("Fecha");
          tabla.addColumn("Cliente");
           tabla.addColumn("Tel. Cliente");
          tabla.addColumn("Monto Fiado");
          tabla.addColumn("Saldo Pendiente");
          tabla.addColumn("Estado");
          
    
     try{
      
      String preventista= boxPreventista.getSelectedItem().toString();
            // Separar en base al guion
            String[] partes = preventista.split("---");
            // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
            String apellido = partes[0].trim();
            String dni = partes[1].trim();

           int id_preventista= clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni)); ///obtener el ID del preventista...
        rs=clases.rendicion.verFiados(cx, id_preventista);
        
     
        while(rs.next()){
            datos[0]=rs.getString("ren.fecha");
            datos[1]=rs.getString("cli.apenom");
             datos[2]=rs.getString("cli.telefono");
            datos[3]=rs.getString("fi.monto_fiado");
            datos[4]=rs.getString("(fi.monto_fiado-fi.monto_entregado)");
            datos[5]=rs.getString("fi.estado");
            
           
            tabla.addRow(datos);
        }
         tablaFiados.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar los fiados del preventista "+boxPreventista.getSelectedItem(),"ERROR",ERROR_MESSAGE);
        
    }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFiados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        boxPreventista = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaFiados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cliente", "Tel. Cliente", "Monto Fiado", "Saldo Pendiente", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablaFiados);

        jLabel5.setText("Preventista");

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Monto a entregar: ");

        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("FIADOS");

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(432, 432, 432)
                            .addComponent(jLabel6)
                            .addGap(115, 115, 115)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(337, 337, 337)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 410, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(768, 768, 768))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(789, 789, 789))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(botonBuscar)
                    .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
 verFIadosPreventista();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
          try{
            int filaSeleccionada = tablaFiados.getSelectedRow();
            
            String fecha =tablaFiados.getValueAt(filaSeleccionada, 0).toString();
            String cliente =tablaFiados.getValueAt(filaSeleccionada, 1).toString();
            String cliente_tel =tablaFiados.getValueAt(filaSeleccionada, 2).toString();
             String monto_fiado=tablaFiados.getValueAt(filaSeleccionada,3).toString();
             String monto_pendiente=tablaFiados.getValueAt(filaSeleccionada,4).toString();
         
            float monto_entregado=Float.parseFloat(txtMonto.getText());
            
            ////////verrficar que el monto total saldado no se pasa del monto fiado...
           if( (Float.valueOf(monto_pendiente)-monto_entregado)  < 0 ){
                JOptionPane.showMessageDialog(null, "Esta intentando saldar mas del monto pendiente","ERROR",ERROR_MESSAGE);
           }else{
               
               
               try{
                      String preventista= boxPreventista.getSelectedItem().toString();
                       // Separar en base al guion
                       String[] partes = preventista.split("---");
                       // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
                       String apellido = partes[0].trim();
                       String dni = partes[1].trim();
                      int id_cliente= clases.cliente.obtenerCodigoCliente(cx, cliente, cliente_tel);
          
                       
                       
                       int id_preventista=clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
                       int id_rendicion=clases.rendicion.buscarIdRendicion(cx, fecha, id_preventista);
                       int id_fiado=   clases.rendicion.obtenerIdFiado(cx, id_cliente, id_rendicion );
              
                       ///entregar monto a saldar...
                       clases.rendicion.entregarMontoFiado(cx, monto_entregado, id_fiado, id_rendicion);
                      JOptionPane.showMessageDialog(null, "Se ha entregado el monto correctamente ");
                      
                      /////////////////////////////////////////////////////////////consutlar su estado como fiado...
                      float total_pendiente=clases.rendicion.consultarMontoPendienteFiado(cx, id_fiado, id_rendicion);
                      
                      ///si ya pagó todo, pasa a ser fiado 'pagado', por lo tanto ya no aparecera en busqueda de los fiados, pero permanecerá ese registro en la db...en caso de que aun no haya pagado todo, permanecera su estado como 'pendiente'
                      if(total_pendiente==0){
                          clases.rendicion.cambiarEstadoFiado(cx, id_fiado, id_rendicion);
                      }
                      verFIadosPreventista();
                      
               }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error al intentar saldar","ERROR",ERROR_MESSAGE);
               }
           
               
           }
        
          
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Seleccione un registro","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
               char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMonto.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> boxPreventista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFiados;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
