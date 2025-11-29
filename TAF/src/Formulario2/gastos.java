
package Formulario2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class gastos extends javax.swing.JPanel {
 int id_preventista;
 int mes;
 int año;
  ResultSet rs;
    Connection cx=conexion.conexion.conexion();
  
    DefaultTableModel tabla=new DefaultTableModel();
     Object[] datos=new Object[4]; 
    
    public gastos(int id_preventista, int mes, int año) {
        initComponents();
        this.id_preventista=id_preventista;
        this.mes=mes;
        this.año=año;
        verGastosTotalesPreventista();
    }
    
    
    void verGastosTotalesPreventista(){
           tabla.setRowCount(0);   
           tabla.setColumnCount(0);
            tabla.addColumn("Gasto");
           tabla.addColumn("Total");
          tabla.addColumn("Preventista");
          tabla.addColumn("Dni");
     

     try{
        
        rs=clases.gasto_realizado.verGastosTotalesPreventista(cx, año, mes, id_preventista);
     
        while(rs.next()){
            datos[0]=rs.getString("ga.nombre_gasto");
            datos[1]=rs.getString("sum(gr.monto)");
            datos[2]=rs.getString("pre.apellido");
            datos[3]=rs.getString("pre.dni");
            
            
           
            tabla.addRow(datos);
        }
         tablaGastos.setModel(tabla);
       
    }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar los gastos","ERROR",ERROR_MESSAGE);
        
    
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGastos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Gasto", "Total", "Preventista", "Dni"
            }
        ));
        jScrollPane1.setViewportView(tablaGastos);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Gastos del Preventista");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaGastos;
    // End of variables declaration//GEN-END:variables
}
