
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class objetivos extends javax.swing.JPanel {
        ResultSet rs;
      Connection cx=conexion.conexion.conexion();
      DefaultComboBoxModel ls= new DefaultComboBoxModel();


   
    public objetivos() {
        initComponents();
        cargarComboPreventista();
        cargarAñoYMesActual();
    }

   void cargarComboPreventista(){
        try{
            rs=clases.preventista.listarPreventistas(cx);
            ls.addElement("Seleccione un Preventista");
            while(rs.next())
                ls.addElement(rs.getString("apellido")+"---"+rs.getString("dni"));
                boxPreventista.setModel(ls);
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar los preventistas","ERROR",ERROR_MESSAGE);
        }
    }
   
   void cargarAñoYMesActual(){
       LocalDate hoy = LocalDate.now();
       int año = hoy.getYear();
       Month mes = hoy.getMonth();
      
       // Mes en español (capitalizado)
       String mesEnEspañol = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")); 
       mesEnEspañol = mesEnEspañol.substring(0,1).toUpperCase() + mesEnEspañol.substring(1);
       labelMes.setText(mesEnEspañol);

       
        ///ponemos los datos recien obtenidos en los txt..
       labelAño.setText(String.valueOf(año));
       labelMes.setText(mesEnEspañol);
   }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtObjetivoMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtObjetivoPdv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtObjetivoDias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateS1Desde = new com.toedter.calendar.JDateChooser();
        dateS1Hasta = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dateS2Desde = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        dateS2Hasta = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dateS3Desde = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        dateS3Hasta = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dateS4Desde = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        dateS4Hasta = new com.toedter.calendar.JDateChooser();
        botonGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boxPreventista = new javax.swing.JComboBox<>();
        labelAño = new javax.swing.JLabel();
        labelMes = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Ventas y Objetivos");

        jLabel3.setText("Objetivo Mensual de Ventas");

        jLabel4.setText("Total $:");

        jLabel5.setText("Puntos de Ventas:");

        txtObjetivoPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObjetivoPdvActionPerformed(evt);
            }
        });

        jLabel6.setText("Días:");

        jLabel7.setText("Configurar Semanas");

        jLabel8.setText("Semana 1: ");

        jLabel12.setText("Desde");

        jLabel20.setText("Hasta");

        jLabel9.setText("Semana 2:");

        jLabel14.setText("Desde");

        jLabel15.setText("Hasta");

        jLabel10.setText("Semana 3:");

        jLabel16.setText("Desde");

        jLabel17.setText("Hasta");

        jLabel11.setText("Semana 4:");

        jLabel18.setText("Desde");

        jLabel19.setText("Hasta");

        botonGuardar.setText("GUARDAR CAMBIOS");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Preventista");

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelAño.setText("jLabel43");

        labelMes.setText("jLabel43");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtObjetivoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtObjetivoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtObjetivoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateS2Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateS2Hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(9, 9, 9)
                                        .addComponent(dateS3Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateS3Hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(12, 12, 12)
                                .addComponent(dateS4Desde, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateS4Hasta, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateS1Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateS1Hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(145, 145, 145))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(labelAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAño, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateS1Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtObjetivoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateS1Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateS2Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(dateS2Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtObjetivoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(dateS3Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateS3Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtObjetivoDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel11)
                                .addComponent(jLabel18))
                            .addComponent(dateS4Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addComponent(dateS4Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(656, 656, 656))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtObjetivoPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObjetivoPdvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObjetivoPdvActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try{
           String preventista= boxPreventista.getSelectedItem().toString();
            // Separar en base al guion
            String[] partes = preventista.split("---");
            // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
            String apellido = partes[0].trim();
            String dni = partes[1].trim();

           int id_preventista= clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni)); ///obtener el ID del preventista...
          
           int año=Integer.parseInt(labelAño.getText());
           
           ///determinar que mes poner en la variable mes, si es enero, seria mes=1...
           int mes=0;
           if(labelMes.getText().equalsIgnoreCase("enero")){
               mes=1;
           }else if (labelMes.getText().equalsIgnoreCase("febrero")){
               mes=2;
           }else if(labelMes.getText().equalsIgnoreCase("marzo")){
               mes=3;
           }else if(labelMes.getText().equalsIgnoreCase("abril")){
               mes=4;
           }else if(labelMes.getText().equalsIgnoreCase("mayo")){
               mes=5;
           }else if(labelMes.getText().equalsIgnoreCase("junio")){
               mes=6;
           }else if(labelMes.getText().equalsIgnoreCase("julio")){
               mes=7;
           }else if(labelMes.getText().equalsIgnoreCase("agosto")){
               mes=8;
           }else if(labelMes.getText().equalsIgnoreCase("septiembre")){
               mes=9;
           }else if(labelMes.getText().equalsIgnoreCase("octubre")){
               mes=10;
           }else if(labelMes.getText().equalsIgnoreCase("noviembre")){
               mes=11;
           }else{
               mes=12;
           }
           float objetivo_monto=Float.parseFloat(txtObjetivoMonto.getText());
           int objeitvo_pdv=Integer.parseInt(txtObjetivoPdv.getText());
           int objetivo_dias=Integer.parseInt(txtObjetivoDias.getText());
           
           //una vez todos los datos capturados, insertamos lo que sera el objetivo de ese preventista...
           clases.objetivo.insertar(cx, id_preventista, año, mes, objetivo_monto, objeitvo_pdv, objetivo_dias);
           
           
           /////////////////////////////////////////////////////////////AHORA DEBEMOS HACER LOS INSERTS DE LAS SEMANAS EN LA TABLA SEMANAS
           
           ///obtemos el ultimo id_objetivo registrado del preventista, osea el que acabamos  de ingresar...
          int id_objetivo= clases.objetivo.obtenerUltimoIdObjetivo(cx, id_preventista);
          String fechaDesde="";///inicializamos las variables que usaremos para las fechas
          String fechaHasta="";
          
          
          ///empiezo a iterar 4 veces, porque son 4 semanas, en cada iteracion guarda el id_objetivo que recien cargamos, la semana_num(por ejemplo seria 1 en la primer iteracion) y las fechas desde y hasta...
           for (int i=1; i<=4;i++){
               
               if(i==1){
                   Date desde=dateS1Desde.getDate();
                   Date hasta=dateS1Hasta.getDate();
                   SimpleDateFormat formatoDB = new SimpleDateFormat("yyyy-MM-dd");
                   fechaDesde = formatoDB.format(desde);
                   fechaHasta=formatoDB.format(hasta);
               }else if(i==2){
                   Date desde=dateS2Desde.getDate();
                   Date hasta=dateS2Hasta.getDate();
                   SimpleDateFormat formatoDB = new SimpleDateFormat("yyyy-MM-dd");
                   fechaDesde = formatoDB.format(desde);
                   fechaHasta=formatoDB.format(hasta);
               }else if(i==3){
                   Date desde=dateS3Desde.getDate();
                   Date hasta=dateS3Hasta.getDate();
                   SimpleDateFormat formatoDB = new SimpleDateFormat("yyyy-MM-dd");
                   fechaDesde = formatoDB.format(desde);
                   fechaHasta=formatoDB.format(hasta);
               }else{
                   Date desde=dateS4Desde.getDate();
                   Date hasta=dateS4Hasta.getDate();
                   SimpleDateFormat formatoDB = new SimpleDateFormat("yyyy-MM-dd");
                   fechaDesde = formatoDB.format(desde);
                   fechaHasta=formatoDB.format(hasta);
           }
               clases.semana.insertar(cx, id_objetivo, i, fechaDesde, fechaHasta  );
           }
           
           
              JOptionPane.showMessageDialog(null, "Se han cargado correctamente los datos");
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar cargar los datos","ERROR",ERROR_MESSAGE);

        }
            
    }//GEN-LAST:event_botonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> boxPreventista;
    private com.toedter.calendar.JDateChooser dateS1Desde;
    private com.toedter.calendar.JDateChooser dateS1Hasta;
    private com.toedter.calendar.JDateChooser dateS2Desde;
    private com.toedter.calendar.JDateChooser dateS2Hasta;
    private com.toedter.calendar.JDateChooser dateS3Desde;
    private com.toedter.calendar.JDateChooser dateS3Hasta;
    private com.toedter.calendar.JDateChooser dateS4Desde;
    private com.toedter.calendar.JDateChooser dateS4Hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAño;
    private javax.swing.JLabel labelMes;
    private javax.swing.JTextField txtObjetivoDias;
    private javax.swing.JTextField txtObjetivoMonto;
    private javax.swing.JTextField txtObjetivoPdv;
    // End of variables declaration//GEN-END:variables
}
