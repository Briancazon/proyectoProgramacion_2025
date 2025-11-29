
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.SwingUtilities;


public class objetivosConsulta extends javax.swing.JPanel {
        ResultSet rs;
      Connection cx=conexion.conexion.conexion();
      DefaultComboBoxModel ls= new DefaultComboBoxModel();



    public objetivosConsulta() {
        initComponents();
        cargarComboPreventista();
        obtenerAñoActual();
       desactivarBotonGasto();
    }

    
    void    activarBotonGasto(){
        botonGasto.setEnabled(true);
    }
    
      
    void    desactivarBotonGasto(){
        botonGasto.setEnabled(false);
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
   
   
   
   
   //metodo para obtener el año actual...
   void obtenerAñoActual(){
      LocalDate hoy = LocalDate.now();
       int año = hoy.getYear();
       txtAño.setText(String.valueOf(año));
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTotalS1 = new javax.swing.JTextField();
        txtPdvS1 = new javax.swing.JTextField();
        txtDiasS1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtTotalS2 = new javax.swing.JTextField();
        txtPdvS2 = new javax.swing.JTextField();
        txtDiasS2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTotalS3 = new javax.swing.JTextField();
        txtPdvS3 = new javax.swing.JTextField();
        txtDiasS3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtTotalS4 = new javax.swing.JTextField();
        txtPdvS4 = new javax.swing.JTextField();
        txtDiasS4 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtTotalGeneral = new javax.swing.JTextField();
        txtPdvTotalGeneral = new javax.swing.JTextField();
        txtDiasTotalGeneral = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtTotalDiarios = new javax.swing.JTextField();
        txtPdvDiarios = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtTotalResta = new javax.swing.JTextField();
        txtPdvResta = new javax.swing.JTextField();
        txtDiasResta = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtTotalProyeccion = new javax.swing.JTextField();
        txtDiferenciaProyeccion = new javax.swing.JTextField();
        txtAlcanceProyeccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boxPreventista = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        boxMes = new javax.swing.JComboBox<>();
        txtAño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalGastos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalDevolucion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalFiado = new javax.swing.JTextField();
        botonGasto = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtObjetivoPlata = new javax.swing.JTextField();
        txtObjetivoPdv = new javax.swing.JTextField();
        txtObjetivoDias = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Consulta Objetivos");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel13.setText("Total Semana 1");

        jLabel21.setText("Total $:");

        jLabel22.setText("Puntos de Ventas: ");

        jLabel23.setText("Cantidad de Días: ");

        txtTotalS1.setEditable(false);

        txtPdvS1.setEditable(false);

        txtDiasS1.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPdvS1)
                    .addComponent(txtDiasS1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtTotalS1)
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTotalS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtPdvS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtDiasS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel28.setText("Total Semana 2");

        jLabel29.setText("Total $:");

        jLabel30.setText("Puntos de Ventas: ");

        jLabel31.setText("Cantidad de Días: ");

        txtTotalS2.setEditable(false);

        txtPdvS2.setEditable(false);

        txtDiasS2.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPdvS2)
                    .addComponent(txtDiasS2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel28)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtTotalS2)
                        .addGap(42, 42, 42))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtTotalS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPdvS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtDiasS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel24.setText("Total Semana 3");

        jLabel25.setText("Total $:");

        jLabel26.setText("Puntos de Ventas: ");

        jLabel27.setText("Cantidad de Días: ");

        txtTotalS3.setEditable(false);

        txtPdvS3.setEditable(false);

        txtDiasS3.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPdvS3)
                    .addComponent(txtDiasS3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel24)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtTotalS3)
                        .addGap(42, 42, 42))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtTotalS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtPdvS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtDiasS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel32.setText("Total Semana 4");

        jLabel33.setText("Total $:");

        jLabel34.setText("Puntos de Ventas: ");

        jLabel35.setText("Cantidad de Días: ");

        txtTotalS4.setEditable(false);

        txtPdvS4.setEditable(false);

        txtDiasS4.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPdvS4)
                    .addComponent(txtDiasS4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel32)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtTotalS4)
                        .addGap(42, 42, 42))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtTotalS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtPdvS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtDiasS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel48.setText("Total General");

        jLabel49.setText("Total $:");

        jLabel50.setText("Puntos de Ventas: ");

        jLabel51.setText("Cantidad de Días: ");

        txtTotalGeneral.setEditable(false);
        txtTotalGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalGeneralActionPerformed(evt);
            }
        });

        txtPdvTotalGeneral.setEditable(false);

        txtDiasTotalGeneral.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPdvTotalGeneral)
                    .addComponent(txtDiasTotalGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel48)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtTotalGeneral)
                        .addGap(46, 46, 46))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(txtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtPdvTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtDiasTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel40.setText("Objetivo Diario");

        jLabel41.setText("Total $:");

        jLabel42.setText("Puntos de Ventas: ");

        txtTotalDiarios.setEditable(false);

        txtPdvDiarios.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel40)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPdvDiarios)
                            .addComponent(txtTotalDiarios))
                        .addGap(42, 42, 42))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtTotalDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtPdvDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel36.setText("Resta Objetivo");

        jLabel37.setText("Total $:");

        jLabel38.setText("Puntos de Ventas: ");

        jLabel39.setText("Cantidad de Días: ");

        txtTotalResta.setEditable(false);

        txtPdvResta.setEditable(false);

        txtDiasResta.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPdvResta)
                    .addComponent(txtDiasResta, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel36))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtTotalResta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtTotalResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtPdvResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtDiasResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel44.setText("Proyección");

        jLabel45.setText("Total $:");

        jLabel46.setText("Diferencia:");

        jLabel47.setText("Alcance: ");

        txtTotalProyeccion.setEditable(false);

        txtDiferenciaProyeccion.setEditable(false);

        txtAlcanceProyeccion.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiferenciaProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlcanceProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addGap(93, 93, 93)))
                .addGap(29, 29, 29))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtTotalProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtDiferenciaProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtAlcanceProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel2.setText("Preventista");

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Mes");

        boxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        boxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMesActionPerformed(evt);
            }
        });

        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });

        jLabel4.setText("Año");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel6.setText("Total Gastos");

        txtTotalGastos.setEditable(false);

        jLabel5.setText("Total Devolucion");

        txtTotalDevolucion.setEditable(false);

        jLabel7.setText("Total Fiado");

        txtTotalFiado.setEditable(false);

        botonGasto.setText("+");
        botonGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGastoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)
                        .addGap(80, 80, 80)
                        .addComponent(txtTotalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtTotalFiado))))
                .addGap(18, 18, 18)
                .addComponent(botonGasto)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGasto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalFiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel8.setText("Objetivos Definidos");

        jLabel9.setText("Objetivo $:");

        jLabel10.setText("Objetivo PDV:");

        jLabel11.setText("Objetivo Días:");

        txtObjetivoPlata.setEditable(false);

        txtObjetivoPdv.setEditable(false);

        txtObjetivoDias.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)
                        .addGap(112, 112, 112)
                        .addComponent(txtObjetivoPlata, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addComponent(txtObjetivoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33)
                        .addComponent(txtObjetivoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(jLabel8)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtObjetivoPlata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtObjetivoDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtObjetivoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));

        jLabel12.setText("Sueldo");

        jLabel14.setText("Sueldo");

        txtSueldo.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel12))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(79, 79, 79)
                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(899, 899, 899)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(771, 771, 771)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton1)
                            .addComponent(boxPreventista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
            String preventista= boxPreventista.getSelectedItem().toString();
            // Separar en base al guion
            String[] partes = preventista.split("---");
            // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
            String apellido = partes[0].trim();
            String dni = partes[1].trim();

           int id_preventista= clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni)); ///obtener el ID del preventista...
              ///determinar que mes poner en la variable mes, si es enero, seria mes=1...
           int mes=0;
           if(boxMes.getSelectedItem().equals("Enero")){
               mes=1;
           }else if (boxMes.getSelectedItem().equals("Febrero")){
               mes=2;
           }else if(boxMes.getSelectedItem().equals("Marzo")){
               mes=3;
           }else if(boxMes.getSelectedItem().equals("Abril")){
               mes=4;
           }else if(boxMes.getSelectedItem().equals("Mayo")){
               mes=5;
           }else if(boxMes.getSelectedItem().equals("Junio")){
               mes=6;
           }else if(boxMes.getSelectedItem().equals("Julio")){
               mes=7;
           }else if(boxMes.getSelectedItem().equals("Agosto")){
               mes=8;
           }else if(boxMes.getSelectedItem().equals("Septiembre")){
               mes=9;
           }else if(boxMes.getSelectedItem().equals("Octubre")){
               mes=10;
           }else if(boxMes.getSelectedItem().equals("Noviembre")){
               mes=11;
           }else{
               mes=12;
           }
          int id_objetivo= clases.objetivo.obtenerIDporMesYAño(cx,id_preventista, Integer.parseInt(txtAño.getText()), mes);
          
          
          //////////////////////////////////////////////////////MOSTRAR EN SEMANAS....
          ///ahora mostramos como le fue o esta yendo en la SEMANA 1 al id_objetivo tanto..
          rs=clases.semana.verRendimientoSemana1(cx, id_objetivo);
          while(rs.next()){
              float total_vendido=rs.getFloat("sum(ren.total_ventido)");
              int pdv=rs.getInt("sum(ren.cantidad_ventas)");
              int c_dias=rs.getInt("count(ren.id_rendicion)");
               
              
               ///ponemos los datos obtenidos en los txt
              txtTotalS1.setText(String.valueOf(total_vendido));
              txtPdvS1.setText(String.valueOf(pdv));
              txtDiasS1.setText(String.valueOf(c_dias));
          }
          
          
          ///mostramos como le fue o como le esta yendo en la SEMANA 2 al id_objetivo tanto..
          rs=clases.semana.verRendimientoSemana2(cx, id_objetivo);
          while(rs.next()){
              float total_vendido=rs.getFloat("sum(ren.total_ventido)");
              int pdv=rs.getInt("sum(ren.cantidad_ventas)");
              int c_dias=rs.getInt("count(ren.id_rendicion)");
               
              
               ///ponemos los datos obtenidos en los txt
              txtTotalS2.setText(String.valueOf(total_vendido));
              txtPdvS2.setText(String.valueOf(pdv));
              txtDiasS2.setText(String.valueOf(c_dias));
          }
          
          
          ///mostramos como le fue o como le esta yendo en la SEMANA 3 al id_objetivo tanto..
          rs=clases.semana.verRendimientoSemana3(cx, id_objetivo);
          while(rs.next()){
              float total_vendido=rs.getFloat("sum(ren.total_ventido)");
              int pdv=rs.getInt("sum(ren.cantidad_ventas)");
              int c_dias=rs.getInt("count(ren.id_rendicion)");
               
              
              ///ponemos los datos obtenidos en los txt
              txtTotalS3.setText(String.valueOf(total_vendido));
              txtPdvS3.setText(String.valueOf(pdv));
              txtDiasS3.setText(String.valueOf(c_dias));
          }
          
          ///mostramos como le fue o como le esta yendo en la SEMANA 4 al id_objetivo tanto..
          rs=clases.semana.verRendimientoSemana4(cx, id_objetivo);
          while(rs.next()){
              float total_vendido=rs.getFloat("sum(ren.total_ventido)");
              int pdv=rs.getInt("sum(ren.cantidad_ventas)");
              int c_dias=rs.getInt("count(ren.id_rendicion)");
               
              
               ///ponemos los datos obtenidos en los txt
              txtTotalS4.setText(String.valueOf(total_vendido));
              txtPdvS4.setText(String.valueOf(pdv));
              txtDiasS4.setText(String.valueOf(c_dias));
          }
          
          
          //////////////////////////////////////////////////////////////////mostramos el TOTAL GENERAL, es decir , la suma de cada item de cada semana..
          
          float totalGeneral=Float.parseFloat(txtTotalS1.getText())+Float.parseFloat(txtTotalS2.getText())+ Float.parseFloat(txtTotalS3.getText())+ Float.parseFloat(txtTotalS4.getText());///sumamos el total de de cada semana y lo guardamos en la variable totalGeneral
          int pdvGeneral=Integer.parseInt(txtPdvS1.getText())+ Integer.parseInt(txtPdvS2.getText())+ Integer.parseInt(txtPdvS3.getText())+ Integer.parseInt(txtPdvS4.getText());  //sumamos el total de pdv de cada semana y lo guardamos en la variable pdvGeneral
          int diasGeneral=Integer.parseInt(txtDiasS1.getText()) + Integer.parseInt(txtDiasS2.getText())+ Integer.parseInt(txtDiasS3.getText()) +Integer.parseInt(txtDiasS4.getText()); ///sumamos el total de dias de cada semana y lo guardamos en la variable dtiasGeneral
          
          ///ponemos los datos en los txt pertenecientes  a Total General (del panel)...
          txtTotalGeneral.setText(String.valueOf(totalGeneral));
          txtPdvTotalGeneral.setText(String.valueOf(pdvGeneral));
          txtDiasTotalGeneral.setText(String.valueOf(diasGeneral));
          
          
          
          
         ////////////////////////////////////////////////////////////////////////MOSRAR EN LOS OBJETIVOS:RESTA, DIARIO Y PROYECCION..
         
         //// antes que nada priimero consultamos exactamente los objetivos de ese preventista de un mes en particular de un año en particular..
         rs=clases.objetivo.verObjetivosPreventista(cx, id_objetivo);
         float objetivo_monto=0;
         int objetivo_pdv=0;
         int objetivo_dias=0;
         while(rs.next()){
             objetivo_monto=rs.getFloat("objetivo_monto");
             objetivo_pdv=rs.getInt("objetivo_pdv");
             objetivo_dias=rs.getInt("objetivo_dias");
             
             //mostramos esos datos en los txt pertenecientes a los objetivos definidos para ese preventista
             txtObjetivoPlata.setText(String.valueOf(objetivo_monto));
             txtObjetivoPdv.setText(String.valueOf(objetivo_pdv));
             txtObjetivoDias.setText(String.valueOf(objetivo_dias));
         }

         ///motramos en resta...
         txtTotalResta.setText(String.valueOf(objetivo_monto-totalGeneral));  ///restamos  el objetivo en plata menos el total general en plata que lleva el preventista y lo ponemos en el txt
         txtPdvResta.setText(String.valueOf(objetivo_pdv-pdvGeneral)); /// restamos el objetivo en pdv menos el total general de pdv que lleva el preventista y lo ponemos en el txt
         txtDiasResta.setText(String.valueOf(objetivo_dias-diasGeneral)); ///restamos el objetivo en dias menos el total general de dias que lleva el preventista y lo ponemos en el txt
         
         
         ///mostramos en diarios..
         float totalResta=Float.parseFloat(txtTotalResta.getText());
         int  totalPdvResta=Integer.parseInt(txtPdvResta.getText());
         int totalDiasResta=Integer.parseInt(txtDiasResta.getText());
         // --- PROTEGER DIVISIÓN POR CERO --- //
         if (totalDiasResta == 0) {
            txtTotalDiarios.setText("0");
            txtPdvDiarios.setText("0");
         } else {
            txtTotalDiarios.setText(String.valueOf(totalResta / totalDiasResta));
            txtPdvDiarios.setText(String.valueOf(totalPdvResta / totalDiasResta));
         }

         
         
         //mostramos en proyeccion.
         // --- PROTEGER DIVISIÓN POR CERO --- //
         if (diasGeneral == 0) {
            txtTotalProyeccion.setText("0");
            txtDiferenciaProyeccion.setText("0");
            txtAlcanceProyeccion.setText("0");
         } else {
            float proyeccion = (totalGeneral / diasGeneral) * objetivo_dias;
            txtTotalProyeccion.setText(String.valueOf(proyeccion));
            txtDiferenciaProyeccion.setText(String.valueOf(proyeccion - objetivo_monto));
            txtAlcanceProyeccion.setText(String.valueOf((proyeccion / objetivo_monto) * 100));
         }

          
          
          
          //////////////////////////////////////////////////////////////////MOSTRAR GASTOS, DEVOLUCIONES Y FIADOS...
          
         ///mostrar en gastos..
         rs=clases.gasto_realizado.verGastosPreventista(cx, id_preventista, Integer.parseInt(txtAño.getText()), mes);  //obtener los gastos del preventista de un año y mes
         float montoGasto=0;
          while(rs.next()){
              montoGasto=rs.getFloat("sum(gr.monto)");
              txtTotalGastos.setText(String.valueOf(montoGasto));
          }
          
          
          //mostrar en devoluciones..
          rs=clases.devolucion.verDevolucionesPreventtista(cx, id_preventista,Integer.parseInt(txtAño.getText()), mes); //obtener las devoluciones de un preventista de un alo y mes
          while(rs.next()){
              float totalDevoluciones=rs.getFloat("sum(ren.total_devoluciones)");
              txtTotalDevolucion.setText(String.valueOf(totalDevoluciones));
          }
          
          ///mostrar en fiados.
          rs=clases.fiado.verFiadosPreventista(cx, id_preventista, Integer.parseInt(txtAño.getText()), mes); //obtener el total fiado de un preventista de un año y mes, se recalca que muestra en tiempo real el monto ffiado que lleva...
          float totalFiado=0;
          while(rs.next()){
              totalFiado=rs.getFloat("sum(fi.monto_fiado-fi.monto_entregado)");
              txtTotalFiado.setText(String.valueOf(totalFiado));
          }
          
          
          ///////////////////////////////////////////////////////////////////////////CALCULA EL SUELDO
          
          ///primero obtenemos el sueldo basico actual...
          rs=clases.sueldo.ver(cx);
          float sueldoBasico=0;
          while(rs.next()){
              sueldoBasico=rs.getFloat("sueldo");
          }
          
          
          //////vermos la comision..
          float comision=0;
          if(totalGeneral>= objetivo_monto){
               if(pdvGeneral >= objetivo_pdv){
                   comision=(float) (totalGeneral * 0.045);
               }else{
                   comision= (float) (totalGeneral * 0.03);
               }
          }else{
              if(pdvGeneral >= objetivo_pdv){
                  comision=(float) (totalGeneral*0.015);
              }else{
                  comision=totalGeneral*0;
              }
          }
          
          ///ahora si calculamos el sueldo final..
          float sueldo=sueldoBasico+comision-totalFiado-montoGasto;
          txtSueldo.setText(String.valueOf(sueldo)); //finalmente ponemos el sueldo final en el txt sueldo..
          
          //activamos el boton +, para poder ver el total de lo que gastó de cada gasto que tuvo
          gastos g=new gastos(id_preventista, mes, Integer.parseInt(txtAño.getText())  ) ;
          
          activarBotonGasto();
       }  catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar los preventistas","ERROR",ERROR_MESSAGE);

       }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMesActionPerformed

    private void txtTotalGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalGeneralActionPerformed

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
                  char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtAño.getText().length()>=4) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void botonGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGastoActionPerformed
          
        try{
            String preventista= boxPreventista.getSelectedItem().toString();
        
            // Separar en base al guion
            String[] partes = preventista.split("---");
            // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
            String apellido = partes[0].trim();
            String dni = partes[1].trim();
             
              int mes=0;
           if(boxMes.getSelectedItem().equals("Enero")){
               mes=1;
           }else if (boxMes.getSelectedItem().equals("Febrero")){
               mes=2;
           }else if(boxMes.getSelectedItem().equals("Marzo")){
               mes=3;
           }else if(boxMes.getSelectedItem().equals("Abril")){
               mes=4;
           }else if(boxMes.getSelectedItem().equals("Mayo")){
               mes=5;
           }else if(boxMes.getSelectedItem().equals("Junio")){
               mes=6;
           }else if(boxMes.getSelectedItem().equals("Julio")){
               mes=7;
           }else if(boxMes.getSelectedItem().equals("Agosto")){
               mes=8;
           }else if(boxMes.getSelectedItem().equals("Septiembre")){
               mes=9;
           }else if(boxMes.getSelectedItem().equals("Octubre")){
               mes=10;
           }else if(boxMes.getSelectedItem().equals("Noviembre")){
               mes=11;
           }else{
               mes=12;
           }
           int id_preventista= clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni)); ///obtener el ID del preventista...            
        gastos g=new gastos(id_preventista, mes, Integer.parseInt(txtAño.getText())  ) ;
      JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Gastos del Preventista", true);
dialog.setContentPane(g);
dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
dialog.pack();
dialog.setLocationRelativeTo(null);
dialog.setVisible(true);
        
        
        }catch(Exception e){
                e.printStackTrace();
       }
    }//GEN-LAST:event_botonGastoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGasto;
    private javax.swing.JComboBox<String> boxMes;
    private javax.swing.JComboBox<String> boxPreventista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtAlcanceProyeccion;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDiasResta;
    private javax.swing.JTextField txtDiasS1;
    private javax.swing.JTextField txtDiasS2;
    private javax.swing.JTextField txtDiasS3;
    private javax.swing.JTextField txtDiasS4;
    private javax.swing.JTextField txtDiasTotalGeneral;
    private javax.swing.JTextField txtDiferenciaProyeccion;
    private javax.swing.JTextField txtObjetivoDias;
    private javax.swing.JTextField txtObjetivoPdv;
    private javax.swing.JTextField txtObjetivoPlata;
    private javax.swing.JTextField txtPdvDiarios;
    private javax.swing.JTextField txtPdvResta;
    private javax.swing.JTextField txtPdvS1;
    private javax.swing.JTextField txtPdvS2;
    private javax.swing.JTextField txtPdvS3;
    private javax.swing.JTextField txtPdvS4;
    private javax.swing.JTextField txtPdvTotalGeneral;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTotalDevolucion;
    private javax.swing.JTextField txtTotalDiarios;
    private javax.swing.JTextField txtTotalFiado;
    private javax.swing.JTextField txtTotalGastos;
    private javax.swing.JTextField txtTotalGeneral;
    private javax.swing.JTextField txtTotalProyeccion;
    private javax.swing.JTextField txtTotalResta;
    private javax.swing.JTextField txtTotalS1;
    private javax.swing.JTextField txtTotalS2;
    private javax.swing.JTextField txtTotalS3;
    private javax.swing.JTextField txtTotalS4;
    // End of variables declaration//GEN-END:variables
}
