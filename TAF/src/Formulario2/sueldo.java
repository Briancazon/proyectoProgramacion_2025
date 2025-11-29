
package Formulario2;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class sueldo extends javax.swing.JPanel {
       ResultSet rs;
      Connection cx=conexion.conexion.conexion();
      DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[4]; 
   
    public sueldo() {
        initComponents();
        verSueldoActual();
        desactivarGuardar();
        desactivarEditar();
        desactivarCampo();
    }
  
    
    void activarEditar(){
          botonEditar.setEnabled(true);
    }
    
     void desactivarEditar(){
          botonEditar.setEnabled(false);
    }
     
     void activarGuardar(){
          botonGuardar.setEnabled(true);
    }
     
   void desactivarGuardar(){
          botonGuardar.setEnabled(false);
    }
   
   void activarCampo(){
       txtSueldo.setEnabled(true);
   }
     
   
    void desactivarCampo(){
       txtSueldo.setEnabled(false);
   }
    
    void  limpiar(){
        txtSueldo.setText("");
    }
    
    void verSueldoActual(){
        
           tabla.setRowCount(0);   
           tabla.setColumnCount(0);
           tabla.addColumn("Sueldo");

      
     try{
        
        rs=clases.sueldo.ver(cx);
     
        while(rs.next()){
            datos[0]=rs.getString("sueldo");
            tabla.addRow(datos);
        }
         tablaSueldos.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar el sueldo básico","ERROR",ERROR_MESSAGE);
        
    }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSueldos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("SUELDO BÁSICO");

        tablaSueldos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Sueldo"
            }
        ));
        tablaSueldos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSueldosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSueldos);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nuevo valor del sueldo básico: ");

        txtSueldo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
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

        botonEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(689, 689, 689)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       try{
           if(txtSueldo.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "Ingrese el nuevo valor del sueldo básico","ERROR",ERROR_MESSAGE);
                return;
           }
           clases.sueldo.actualizar(cx, Float.parseFloat(txtSueldo.getText()) );
           JOptionPane.showMessageDialog(null, "Se ha actualizado el sueldo básico");
           desactivarGuardar();
           desactivarEditar();
           desactivarCampo();
           verSueldoActual();
           limpiar();
           
       }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Error al actualizar el sueldo básico","ERROR",ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void tablaSueldosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSueldosMouseClicked
       try{
           int filaSeleccionada=tablaSueldos.getSelectedRow();
           String sueldo=tablaSueldos.getValueAt(filaSeleccionada, 0).toString();
           txtSueldo.setText(sueldo);
           activarEditar();
           desactivarGuardar();
           desactivarCampo();
           activarEditar();
       }catch(Exception e){
          
       }       
    }//GEN-LAST:event_tablaSueldosMouseClicked

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        activarCampo();
        activarGuardar();
        desactivarEditar();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
           char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtSueldo.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtSueldoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSueldos;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
