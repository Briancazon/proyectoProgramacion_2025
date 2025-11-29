
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
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
        camposNoEntry();
        configurarFechasMesActual();
    }
    
    
     void limpiar(){
         txtObjetivoMonto.setText("");
         txtObjetivoPdv.setText("");
         txtObjetivoDias.setText("");
         boxPreventista.setSelectedItem("Seleccione un Preventista");
         dateS1Desde.setDate(null);
dateS1Hasta.setDate(null);
dateS2Desde.setDate(null);
dateS2Hasta.setDate(null);

dateS3Desde.setDate(null);
dateS3Hasta.setDate(null);
dateS4Desde.setDate(null);
dateS4Hasta.setDate(null);

     }
    void configurarFechasMesActual() {

    // 1) Obtener la fecha de hoy
    LocalDate hoy = LocalDate.now();

    // 2) Calcular inicio y fin del mes actual
    LocalDate inicioMes = hoy.withDayOfMonth(1);
    LocalDate finMes = hoy.withDayOfMonth(hoy.lengthOfMonth());

    // 3) Pasar LocalDate → java.util.Date (lo que usa JDateChooser)
    Date inicio = Date.from(inicioMes.atStartOfDay(ZoneId.systemDefault()).toInstant());
    Date fin = Date.from(finMes.atStartOfDay(ZoneId.systemDefault()).toInstant());

    // =======================================================
    // 4) Aplicar restricciones a cada JDateChooser
    // =======================================================
    configurarRango(dateS1Desde, inicio, fin);
    configurarRango(dateS1Hasta, inicio, fin);

    configurarRango(dateS2Desde, inicio, fin);
    configurarRango(dateS2Hasta, inicio, fin);

    configurarRango(dateS3Desde, inicio, fin);
    configurarRango(dateS3Hasta, inicio, fin);

    configurarRango(dateS4Desde, inicio, fin);
    configurarRango(dateS4Hasta, inicio, fin);
}
    
     void configurarRango(com.toedter.calendar.JDateChooser dateChooser, 
                             Date min, Date max) {

    // Obtener el calendario interno del JDateChooser
    dateChooser.getJCalendar().setMinSelectableDate(min); // fecha mínima
    dateChooser.getJCalendar().setMaxSelectableDate(max); // fecha máxima
}

     // Aplica el rango mínimo y máximo a un JDateChooser.
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
     void camposNoEntry(){
    // Bloquear el editor de texto para que no se pueda escribir
dateS1Desde.getDateEditor().setEnabled(false);
dateS1Hasta.getDateEditor().setEnabled(false);

dateS2Desde.getDateEditor().setEnabled(false);
dateS2Hasta.getDateEditor().setEnabled(false);

dateS3Desde.getDateEditor().setEnabled(false);
dateS3Hasta.getDateEditor().setEnabled(false);

dateS4Desde.getDateEditor().setEnabled(false);
dateS4Hasta.getDateEditor().setEnabled(false);
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
        jLabel22 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Ventas y Objetivos");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Objetivo Mensual de Ventas");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Total $:");

        txtObjetivoMonto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));
        txtObjetivoMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObjetivoMontoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Puntos de Ventas:");

        txtObjetivoPdv.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));
        txtObjetivoPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObjetivoPdvActionPerformed(evt);
            }
        });
        txtObjetivoPdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObjetivoPdvKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Días:");

        txtObjetivoDias.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));
        txtObjetivoDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObjetivoDiasKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Configurar Semanas");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Semana 1: ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Desde");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Hasta");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Semana 2:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Desde");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Hasta");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Semana 3:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Desde");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Hasta");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Semana 4:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Desde");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Hasta");

        botonGuardar.setBackground(new java.awt.Color(51, 102, 255));
        botonGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR CAMBIOS");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Preventista");

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelAño.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAño.setText("jLabel43");

        labelMes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMes.setText("jLabel43");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelAño))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObjetivoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtObjetivoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtObjetivoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(labelMes)
                .addGap(347, 347, 347))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateS2Desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateS3Desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateS1Desde, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(dateS4Desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateS3Hasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(dateS2Hasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateS1Hasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateS4Hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(434, 434, 434))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAño, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dateS2Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateS2Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateS3Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dateS3Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel16))))
                                    .addComponent(jLabel17))
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateS1Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtObjetivoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12))
                                    .addComponent(dateS1Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtObjetivoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel11)
                                .addComponent(jLabel18))
                            .addComponent(dateS4Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtObjetivoDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateS4Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1429, 1429, 1429))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(656, 656, 656)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtObjetivoPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObjetivoPdvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObjetivoPdvActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try{
            //validar que no hayan campos vacios..
            if(boxPreventista.getSelectedItem().equals("Seleccione un Preventista") || txtObjetivoMonto.getText().trim().isEmpty() || txtObjetivoPdv.getText().trim().isEmpty() || txtObjetivoDias.getText().trim().isEmpty() || dateS1Desde.getDate()==null || dateS1Hasta.getDate()==null || dateS2Desde.getDate()==null || dateS2Hasta.getDate()==null || dateS3Desde.getDate()==null || dateS3Hasta.getDate()==null || dateS4Desde.getDate()==null || dateS4Hasta.getDate()==null){
                 JOptionPane.showMessageDialog(null, "No se permiten datos vacíos","ERROR",ERROR_MESSAGE);
                 return;
            }

// VALIDAR FECHAS DE LAS 4 SEMANAS


// Obtener las fechas crudas desde los JDateChooser
Date s1d = dateS1Desde.getDate();
Date s1h = dateS1Hasta.getDate();
Date s2d = dateS2Desde.getDate();
Date s2h = dateS2Hasta.getDate();
Date s3d = dateS3Desde.getDate();
Date s3h = dateS3Hasta.getDate();
Date s4d = dateS4Desde.getDate();
Date s4h = dateS4Hasta.getDate();

// Convertimos Date -> LocalDate (más fácil para validar)
LocalDate S1D = s1d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S1H = s1h.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S2D = s2d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S2H = s2h.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S3D = s3d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S3H = s3h.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S4D = s4d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate S4H = s4h.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();


// 1. Validar que en cada semana "desde" <= "hasta"

if (S1D.isAfter(S1H) || S2D.isAfter(S2H) || S3D.isAfter(S3H) || S4D.isAfter(S4H)) {
    JOptionPane.showMessageDialog(null, "En cada semana, la fecha 'desde' debe ser menor o igual a 'hasta'.");
    return;
}




// 3. Validar que las semanas NO SE SOLAPEN

// Un rango A-B NO se solapa con C-D si:
// B < C  o  A > D
// Entonces el solape ocurre cuando NO se cumple eso.

boolean solapa12 = !(S1H.isBefore(S2D) || S1D.isAfter(S2H));
boolean solapa23 = !(S2H.isBefore(S3D) || S2D.isAfter(S3H));
boolean solapa34 = !(S3H.isBefore(S4D) || S3D.isAfter(S4H));

if (solapa12 || solapa23 || solapa34) {
    JOptionPane.showMessageDialog(null, "Las semanas no pueden solaparse entre sí.");
    return;
}


// 4. Validar que las semanas estén ORDENADAS cronológicamente

// Semana 1 debe empezar antes que la 2, y así sucesivamente

if (!(S1D.isBefore(S2D) && S2D.isBefore(S3D) && S3D.isBefore(S4D))) {
    JOptionPane.showMessageDialog(null, "Las semanas deben estar en orden cronológico.");
    return;
}

// Si llega hasta aquí las fechas son válidas


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

    private void txtObjetivoMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObjetivoMontoKeyTyped

                  char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtObjetivoMonto.getText().length()>9) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtObjetivoMontoKeyTyped

    private void txtObjetivoPdvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObjetivoPdvKeyTyped
  
                  char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtObjetivoPdv.getText().length()>9) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtObjetivoPdvKeyTyped

    private void txtObjetivoDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObjetivoDiasKeyTyped
      
                  char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtObjetivoDias.getText().length()>9) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtObjetivoDiasKeyTyped


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
    private javax.swing.JLabel jLabel22;
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
