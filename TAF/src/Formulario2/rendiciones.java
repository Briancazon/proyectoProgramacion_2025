

package Formulario2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;





public class rendiciones extends javax.swing.JPanel {
      ResultSet rs;
      Connection cx=conexion.conexion.conexion();
     DefaultComboBoxModel ls2= new DefaultComboBoxModel();
     DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[11]; 

  
    public rendiciones() {
        initComponents();
        cargarComboPreventista();
        ((JTextField) dateFecha.getDateEditor().getUiComponent()).setEditable(false);  /// esto bloquea la entrada de texto en el chooser, de manera que el usuario solo podrá selecionar una fecha desde el calendario
         verRendiciones();
         validarCamposVacios();
    }
    
    void cargarComboPreventista(){
        try{
            rs=clases.preventista.listarPreventistas(cx);
            ls2.addElement("Seleccione un Preventista");
            while(rs.next())
                ls2.addElement(rs.getString("apellido"));
                boxPreventista.setModel(ls2);
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar los preventistas","ERROR",ERROR_MESSAGE);
        }
    }
    
    void validarCamposVacios(){
         if(dateFecha.getDate() == null && boxPreventista.getSelectedItem().equals("Seleccione un Preventista")){
                    botonBuscar.setEnabled(false);
       }else{
             botonBuscar.setEnabled(true);
         }
    }
    
    
    
void verRendiciones(){
        tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Preventista");
           tabla.addColumn("Fecha");
          tabla.addColumn("Zona");
          tabla.addColumn("Total General");
          tabla.addColumn("Rendición Real");
          tabla.addColumn("Total Fiado");
          tabla.addColumn("Total Devoluciones");
          tabla.addColumn("Total Gastos");
            tabla.addColumn("DIferencia");
              tabla.addColumn("Puntos de Ventas");
                tabla.addColumn("Observación");
                
    
   
     try{
      
        rs=clases.rendicion.verRendiciones(cx);
     
        while(rs.next()){
            datos[0]=rs.getString("pre.apellido");
            datos[1]=rs.getString("ren.fecha");
            datos[2]=rs.getString("zo.nombre_zona");
            datos[3]=rs.getString("ren.total_preventa");
            datos[4]=rs.getString("ren.total_ventido");
            datos[5]=rs.getString("ren.total_fiado");
            datos[6]=rs.getString("ren.total_devoluciones");
            datos[7]=rs.getString("ren.total_gastos");
            datos[8]=rs.getString("ren.diferencia");
            datos[9]=rs.getString("ren.cantidad_ventas");
            datos[10]=rs.getString("ren.observacion");
            
           
            tabla.addRow(datos);
        }
         tablaRendicion.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la rendicion del preventista ","ERROR",ERROR_MESSAGE);
        
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxPreventista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRendicion = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("RENDICIONES");

        jLabel2.setText("Fecha");

        jLabel3.setText("Preventista");

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxPreventista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPreventistaItemStateChanged(evt);
            }
        });

        tablaRendicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Preventista", "Fecha", "Zona", "Total General", "Rendición Real", "Total Fiado", "Total Devoluciones", "Total Gastos", "Diferencia", "Puntos de Ventas", "Observación"
            }
        ));
        jScrollPane1.setViewportView(tablaRendicion);

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        dateFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateFechaPropertyChange(evt);
            }
        });

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
                .addGap(296, 296, 296)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(652, 652, 652))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

      

        tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Preventista");
           tabla.addColumn("Fecha");
          tabla.addColumn("Zona");
          tabla.addColumn("Total General");
          tabla.addColumn("Rendición Real");
          tabla.addColumn("Total Fiado");
          tabla.addColumn("Total Devoluciones");
          tabla.addColumn("Total Gastos");
            tabla.addColumn("DIferencia");
              tabla.addColumn("Puntos de Ventas");
                tabla.addColumn("Observación");
                
    
    String preventista=boxPreventista.getSelectedItem().toString();
     try{
         
         String fechaDB=null;
         if(dateFecha.getDate()!=null){
              java.util.Date fecha = dateFecha.getDate();
              SimpleDateFormat formatoBD = new SimpleDateFormat("yyyy-MM-dd");
              fechaDB = formatoBD.format(fecha);
         }
        


        int id=clases.preventista.obetnerId(cx, preventista);

        rs=clases.rendicion.verRendicion(cx, fechaDB,id);
     
        while(rs.next()){
            datos[0]=rs.getString("pre.apellido");
            datos[1]=rs.getString("ren.fecha");
            datos[2]=rs.getString("zo.nombre_zona");
            datos[3]=rs.getString("ren.total_preventa");
            datos[4]=rs.getString("ren.total_ventido");
            datos[5]=rs.getString("ren.total_fiado");
            datos[6]=rs.getString("ren.total_devoluciones");
            datos[7]=rs.getString("ren.total_gastos");
            datos[8]=rs.getString("ren.diferencia");
            datos[9]=rs.getString("ren.cantidad_ventas");
            datos[10]=rs.getString("ren.observacion");
            
           
            tabla.addRow(datos);
        }
         tablaRendicion.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la rendicion del preventista ","ERROR",ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void boxPreventistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPreventistaItemStateChanged
        validarCamposVacios();
    }//GEN-LAST:event_boxPreventistaItemStateChanged

    private void dateFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateFechaPropertyChange
           validarCamposVacios();
    }//GEN-LAST:event_dateFechaPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dateFecha.setDate(null);   ///limpiar el chooser

        boxPreventista.setSelectedItem("Seleccione un Preventista");
        verRendiciones();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JComboBox<String> boxPreventista;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRendicion;
    // End of variables declaration//GEN-END:variables
}
