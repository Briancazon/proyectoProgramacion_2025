
package Formulario2;

import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTextField;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class formula1 extends javax.swing.JPanel {
    ResultSet rs;
      Connection cx=conexion.conexion.conexion();
     DefaultComboBoxModel ls= new DefaultComboBoxModel();
      DefaultComboBoxModel ls2= new DefaultComboBoxModel();
     DefaultComboBoxModel ls3= new DefaultComboBoxModel();
      DefaultComboBoxModel ls4= new DefaultComboBoxModel();
        DefaultComboBoxModel ls5= new DefaultComboBoxModel();
         DefaultTableModel tabla1=new DefaultTableModel();
        DefaultTableModel tabla2=new DefaultTableModel();
          DefaultTableModel tabla3=new DefaultTableModel();
        DefaultTableModel tabla4=new DefaultTableModel();
        DefaultTableModel tabla5=new DefaultTableModel();
     Object[] datos=new Object[3];
      Object[] datos2=new Object[4];
      Object[] datos3=new Object[3];
      Object[] datos4=new Object[4];
     Object[] datos5=new Object[3];
    
     
     
   

   
    public formula1() {
        initComponents();
        cargarComboZona();
         cargarComboPreventista();
         cargarComboGasto();
      
         desactivarQuitarFiado();
         desactivarQuitarTransferencia();
         desactivarQuitarGasto();
         desactivarQuitarDevolucion();
         desactivarQuitarProductosDevueltos();
        
        
         desactivarCamposNoEntry();
         
         
         tabla1=(DefaultTableModel) tablaFiados.getModel();
          tabla2=(DefaultTableModel) tablaTransferencias.getModel();
         tabla3=(DefaultTableModel) tablaGastos.getModel();
          tabla4=(DefaultTableModel) tablaDevolucion.getModel();
          tabla5=(DefaultTableModel) tablaProductosDevueltos.getModel();
         
    }
    
  public String obtenerFecha() throws DateTimeParseException {      
    String fechaUsuario = txtFecha.getText().trim();
    fechaUsuario = fechaUsuario.replace("/", "-");

    DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("d-M-uuuu");
    DateTimeFormatter formatoDB = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    LocalDate fecha = LocalDate.parse(fechaUsuario, formatoEntrada);
    return fecha.format(formatoDB);
}

  
  void limpiar(){
      boxZona.setSelectedItem("Seleccione una Zona");
      boxPreventista.setSelectedItem("Seleccione un Preventista");
      txtMonto.setText("");
      txtVentas.setText("");
      txtFecha.setText("");
      DefaultTableModel m1 = (DefaultTableModel) tablaFiados.getModel();
      DefaultTableModel m2 = (DefaultTableModel) tablaTransferencias.getModel();
      DefaultTableModel m3 = (DefaultTableModel) tablaGastos.getModel();
      DefaultTableModel m4 = (DefaultTableModel) tablaDevolucion.getModel();
      DefaultTableModel m5 = (DefaultTableModel) tablaProductosDevueltos.getModel();
      m1.setRowCount(0); // 🔥 Elimina todas las filas
      m2.setRowCount(0);
      m3.setRowCount(0);
      m4.setRowCount(0);
      m5.setRowCount(0);
      txtEfectivo.setText("");
      txtCobranzas.setText("");
      txtRendicionReal.setText("");
      txtTotalGeneral.setText("");
      txtPuntosDeVentas.setText("");
      txtDiferencia.setText("");
      txtObservacion.setText("");
      
      
      

  }
    void activarQuitarProductosDevueltos(){
        botonQuitarProDev.setEnabled(true);
    }
    
     void desactivarQuitarProductosDevueltos(){
        botonQuitarProDev.setEnabled(false);
    }
    
    void activarQuitarDevolucion(){
        botonQuitarDevolucion.setEnabled(true);
    }
    
     void desactivarQuitarDevolucion(){
        botonQuitarDevolucion.setEnabled(false);
    }
    
    void activarQuitarGasto(){
        botonQuitarGasto.setEnabled(true);
    }
    
     void desactivarQuitarGasto(){
        botonQuitarGasto.setEnabled(false);
    }
    
    void activarQuitarTransferencia(){
        botonQuitarTransferencia.setEnabled(true);
    }
      
    void desactivarQuitarTransferencia(){
        botonQuitarTransferencia.setEnabled(false);
    }
    
    void activarQuitarFiado(){
        botonQuitarFiado.setEnabled(true);
    }
      void desactivarQuitarFiado(){
        botonQuitarFiado.setEnabled(false);
    }
      
      
      
         void desactivarCamposNoEntry(){
             txtRendicionReal.setEnabled(false);
             txtTotalGeneral.setEnabled(false);
             txtDiferencia.setEnabled(false);
             txtPuntosDeVentas.setEnabled(false);
              txtNombreCliente.setEnabled(false);
            txtNombreCliente2.setEnabled(false);
            txtNombreCliente3.setEnabled(false);
           txtProducto.setEnabled(false);
            txtMontoProductosDev.setEnabled(false);
         }     
      
    void rendicionTIempoReal(){
        
       
        try{
            
            ///////////////////fiados
             float montoFiado=0;
            for (int i = 0; i < tablaFiados.getRowCount(); i++) {
            
             Object montoObj = tablaFiados.getValueAt(i, 2);

             // Primero validar que NO sean null
             if ( montoObj == null) {
               continue; // salta a la siguiente fila
             }

            // Ahora sí convertir a String
          
           String montoF = montoObj.toString().trim();
           montoFiado+=Float.parseFloat(montoF);
          
     
        }
            
          /////////////transferencias
          float totalTransferencias=0;
            for (int i = 0; i < tablaTransferencias.getRowCount(); i++) {
            
             Object montoTObj = tablaTransferencias.getValueAt(i, 2);

             // Primero validar que NO sean null
             if ( montoTObj == null) {
               continue; // salta a la siguiente fila
             }

            // Ahora sí convertir a String
          
           String montoT = montoTObj.toString().trim();
           totalTransferencias+=Float.parseFloat(montoT);

        }
         
         ////////////////////// gastos
         float totalGastos=0;
              for (int i = 0; i < tablaGastos.getRowCount(); i++) {
            
             Object montoGObj = tablaGastos.getValueAt(i, 1);

             // Primero validar que NO sean null
             if ( montoGObj == null) {
               continue; // salta a la siguiente fila
             }

            // Ahora sí convertir a String
          
           String montoG = montoGObj.toString().trim();
           totalGastos+=Float.parseFloat(montoG);

        }
              
         /////////// devoluciones
         float totalDevoluciones=0;
         int cantidadD=0;
              for (int i = 0; i < tablaDevolucion.getRowCount(); i++) {
            
             Object montoDObj = tablaDevolucion.getValueAt(i, 2);

             // Primero validar que NO sean null
             if ( montoDObj == null) {
               continue; // salta a la siguiente fila
             }

            // Ahora sí convertir a String
          
           String montoD = montoDObj.toString().trim();
           totalDevoluciones+=Float.parseFloat(montoD);
           cantidadD=cantidadD+1;
        }
        
              ///////////////// productos devueltos
              float totalPD=0;
              for (int i = 0; i < tablaProductosDevueltos.getRowCount(); i++) {
            
             Object montoPDObj = tablaProductosDevueltos.getValueAt(i, 2);

             // Primero validar que NO sean null
             if ( montoPDObj == null) {
               continue; // salta a la siguiente fila
             }

            // Ahora sí convertir a String
          
           String montoPD = montoPDObj.toString().trim();
           totalPD+=Float.parseFloat(montoPD);

        }
          
          float montoFicticio=0;
          float efectivo=0;
          float cobranza=0;
          int ventas=0;
           if(!txtEfectivo.getText().isEmpty()){
               efectivo=Float.parseFloat(txtEfectivo.getText());
           }
              
            if(!txtCobranzas.getText().isEmpty()){
                cobranza=Float.parseFloat(txtCobranzas.getText());
            } 
            if(!txtMonto.getText().isEmpty()){
                montoFicticio=Float.parseFloat(txtMonto.getText());
            }
            if(!txtVentas.getText().isEmpty()){
                ventas=Integer.parseInt(txtVentas.getText());
            }
            
            ////////////////CALCULOS FINALES DE LA RENDICION REAL...
            float montoRealFicticio=montoFicticio-(totalDevoluciones+totalPD);
            float montoRendicionReal=efectivo+montoFiado+totalTransferencias+totalGastos-cobranza;
            float diferencia=montoRendicionReal-montoRealFicticio;
            if(diferencia<0){

                txtDiferencia.setBackground(Color.RED);
                txtDiferencia.setForeground(Color.WHITE); // texto blanco
            }else{
                if(diferencia>0){
      
                    txtDiferencia.setBackground(Color.GREEN);
                    txtDiferencia.setForeground(Color.WHITE); // texto blanco
                }else{
                   
                    txtDiferencia.setBackground(Color.white);
                    txtDiferencia.setForeground(Color.BLACK); // texto negro norma
                }
            }
            int puntosRealDeVentas=ventas-cantidadD;
            
            txtRendicionReal.setText(String.valueOf(montoRendicionReal));
            txtDiferencia.setText(String.valueOf(diferencia));
            txtTotalGeneral.setText(String.valueOf(montoRealFicticio));
            txtPuntosDeVentas.setText(String.valueOf(puntosRealDeVentas));
            
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar mostrar los datos en tiempo real","ERROR",ERROR_MESSAGE);

        }
        
    }
   
    
      void cargarComboGasto(){
         
        try{
            rs=clases.gasto.verTodosGastos(cx);
             ls4.addElement("Seleccione un Gasto");
            while(rs.next())
                
                ls4.addElement(rs.getString("nombre_gasto"));
                boxGasto.setModel(ls4);
           
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar los gastos","ERROR",ERROR_MESSAGE);
        }
    } 
      
      
    
    
    
    
    
    
     void cargarComboZona(){
        try{
            rs=clases.zona.verTodasZonas(cx);
              ls.addElement("Seleccione una Zona");
            while(rs.next())
              
                ls.addElement(rs.getString("nombre_zona"));
                boxZona.setModel(ls);
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar las zonas","ERROR",ERROR_MESSAGE);
        }
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        Rendicion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        boxZona = new javax.swing.JComboBox<>();
        boxPreventista = new javax.swing.JComboBox<>();
        txtMonto = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCobranzas = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtVentas = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMontoFiado = new javax.swing.JTextField();
        botonAgregarFiado = new javax.swing.JButton();
        botonQuitarFiado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFiados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMontoTransferencia = new javax.swing.JTextField();
        botonAgregarTransferencia = new javax.swing.JButton();
        botonQuitarTransferencia = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTransferencias = new javax.swing.JTable();
        txtNombreCliente2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        boxGasto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtMontoGasto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        botonQuitarGasto = new javax.swing.JButton();
        botonAgregarGasto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaGastos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMontoDevolucion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        botonAgregarDevolucion = new javax.swing.JButton();
        botonQuitarDevolucion = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaDevolucion = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        txtNombreCliente3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtTelefono3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaProductosDevueltos = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        botonAgregarProDev = new javax.swing.JButton();
        botonQuitarProDev = new javax.swing.JButton();
        txtMontoProductosDev = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtDiferencia = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        txtPuntosDeVentas = new javax.swing.JTextField();
        txtRendicionReal = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtTotalGeneral = new javax.swing.JTextField();

        jButton12.setText("jButton12");

        Rendicion.setBackground(new java.awt.Color(255, 255, 255));
        Rendicion.setForeground(new java.awt.Color(255, 255, 255));
        Rendicion.setPreferredSize(new java.awt.Dimension(180, 571));
        Rendicion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Fecha");
        Rendicion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel6.setText("Zona");
        Rendicion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel10.setText("Preventista");
        Rendicion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel12.setText("Monto");
        Rendicion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        Rendicion.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, -1));

        boxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Rendicion.add(boxZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 180, -1));

        boxPreventista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Rendicion.add(boxPreventista, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 180, -1));

        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        Rendicion.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));

        botonRegistrar.setBackground(new java.awt.Color(51, 102, 255));
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("REGISTRAR RENDICION");
        botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        Rendicion.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 850, 320, 90));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Efectivo");
        Rendicion.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 760, -1, -1));

        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyTyped(evt);
            }
        });
        Rendicion.add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 760, 210, -1));

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Cobranzas");
        Rendicion.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 850, -1, -1));

        txtCobranzas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCobranzasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCobranzasKeyTyped(evt);
            }
        });
        Rendicion.add(txtCobranzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 850, 210, -1));

        jLabel24.setText("Puntos de Ventas");
        Rendicion.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVentasActionPerformed(evt);
            }
        });
        txtVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasKeyTyped(evt);
            }
        });
        Rendicion.add(txtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FIADOS");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Monto");

        txtMontoFiado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoFiadoKeyTyped(evt);
            }
        });

        botonAgregarFiado.setText("Agregar");
        botonAgregarFiado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarFiado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonAgregarFiadoItemStateChanged(evt);
            }
        });
        botonAgregarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarFiadoActionPerformed(evt);
            }
        });

        botonQuitarFiado.setText("Quitar");
        botonQuitarFiado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonQuitarFiado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonQuitarFiadoItemStateChanged(evt);
            }
        });
        botonQuitarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarFiadoActionPerformed(evt);
            }
        });

        tablaFiados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Tel.", "Monto Fiado"
            }
        ));
        tablaFiados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFiadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaFiados);

        jButton1.setText("...");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel31.setText("Tel.");

        txtTelefono1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(63, 63, 63)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMontoFiado, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtTelefono1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1)
                        .addComponent(botonAgregarFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonQuitarFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregarFiado)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonQuitarFiado)
                            .addComponent(txtMontoFiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Rendicion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 540, 330));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(540, 330));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TRANSFERENCIAS");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cliente");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Monto");

        txtMontoTransferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoTransferenciaKeyTyped(evt);
            }
        });

        botonAgregarTransferencia.setText("Agregar");
        botonAgregarTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarTransferencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonAgregarTransferenciaItemStateChanged(evt);
            }
        });
        botonAgregarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTransferenciaActionPerformed(evt);
            }
        });

        botonQuitarTransferencia.setText("Quitar");
        botonQuitarTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonQuitarTransferencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonQuitarTransferenciaItemStateChanged(evt);
            }
        });
        botonQuitarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarTransferenciaActionPerformed(evt);
            }
        });

        jLabel28.setText("Estado");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Acreditado" }));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });

        tablaTransferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Tel.", "Monto", "Estado"
            }
        ));
        tablaTransferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTransferenciasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaTransferencias);

        jButton2.setText("...");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel32.setText("Tel.");

        txtTelefono2.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel32))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMontoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtTelefono2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregarTransferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(botonQuitarTransferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregarTransferencia)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(botonQuitarTransferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Rendicion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));
        jPanel3.setPreferredSize(new java.awt.Dimension(540, 330));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("GASTOS");

        boxGasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Gasto");

        txtMontoGasto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoGastoKeyTyped(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Monto");

        botonQuitarGasto.setText("Quitar");
        botonQuitarGasto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonQuitarGasto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonQuitarGastoItemStateChanged(evt);
            }
        });
        botonQuitarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarGastoActionPerformed(evt);
            }
        });

        botonAgregarGasto.setText("Agregar");
        botonAgregarGasto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarGasto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonAgregarGastoItemStateChanged(evt);
            }
        });
        botonAgregarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarGastoActionPerformed(evt);
            }
        });

        tablaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Gasto", "Monto"
            }
        ));
        tablaGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGastosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaGastos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMontoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregarGasto))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonQuitarGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(botonAgregarGasto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(botonQuitarGasto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
        );

        Rendicion.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 540, 330));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));
        jPanel4.setPreferredSize(new java.awt.Dimension(540, 330));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DEVOLUCIONES");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cliente");

        txtMontoDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoDevolucionKeyTyped(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Monto");

        botonAgregarDevolucion.setText("Agregar");
        botonAgregarDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarDevolucion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonAgregarDevolucionItemStateChanged(evt);
            }
        });
        botonAgregarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarDevolucionActionPerformed(evt);
            }
        });

        botonQuitarDevolucion.setText("Quitar");
        botonQuitarDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonQuitarDevolucion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonQuitarDevolucionItemStateChanged(evt);
            }
        });
        botonQuitarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarDevolucionActionPerformed(evt);
            }
        });

        tablaDevolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Tel.", "Monto", "Motivo"
            }
        ));
        tablaDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDevolucionMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaDevolucion);

        jLabel17.setText("Motivo");

        txtMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMotivoKeyTyped(evt);
            }
        });

        jButton3.setText("...");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel33.setText("Tel.");

        txtTelefono3.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(221, 221, 221))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(4, 4, 4)))
                    .addComponent(jLabel16)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txtNombreCliente3)
                    .addComponent(txtMontoDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txtTelefono3))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonQuitarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(botonAgregarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botonAgregarDevolucion))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMontoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonQuitarDevolucion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        );

        Rendicion.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));
        jPanel5.setPreferredSize(new java.awt.Dimension(540, 330));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("PRODUCTOS DEVUELTOS");

        tablaProductosDevueltos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Monto"
            }
        ));
        tablaProductosDevueltos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosDevueltosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaProductosDevueltos);

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Producto");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Cantidad");

        botonAgregarProDev.setText("Agregar");
        botonAgregarProDev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarProDev.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonAgregarProDevItemStateChanged(evt);
            }
        });
        botonAgregarProDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProDevActionPerformed(evt);
            }
        });

        botonQuitarProDev.setText("Quitar");
        botonQuitarProDev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonQuitarProDev.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonQuitarProDevItemStateChanged(evt);
            }
        });
        botonQuitarProDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarProDevActionPerformed(evt);
            }
        });

        txtMontoProductosDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoProductosDevActionPerformed(evt);
            }
        });
        txtMontoProductosDev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoProductosDevKeyTyped(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Monto");

        jButton4.setText("...");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                            .addComponent(txtMontoProductosDev, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(56, 56, 56)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtProducto))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(65, 65, 65)))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonAgregarProDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonQuitarProDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarProDev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoProductosDev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonQuitarProDev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Rendicion.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, -1, -1));

        jLabel25.setText("Rendicion Real");
        Rendicion.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 760, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));

        jLabel29.setText("Diferencia");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Observaciòn");

        txtDiferencia.setForeground(new java.awt.Color(255, 255, 255));

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        txtObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(txtObservacion);

        jLabel27.setText("Puntos de Ventas Real");

        jLabel30.setText("Total General");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(34, 34, 34)
                        .addComponent(txtPuntosDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRendicionReal, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtTotalGeneral))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(36, 36, 36)
                        .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtRendicionReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPuntosDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(31, 31, 31))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel30)
                                            .addComponent(txtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)))
                                .addComponent(jLabel27)))
                        .addGap(17, 17, 17))))
        );

        Rendicion.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 790, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rendicion, javax.swing.GroupLayout.DEFAULT_SIZE, 1687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rendicion, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTransferenciaActionPerformed
     if(txtMontoTransferencia.getText().isEmpty() || txtNombreCliente2.getText().isEmpty() || txtTelefono2.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de transferencia","ERROR",ERROR_MESSAGE);
     }else{
          datos2[0]=txtNombreCliente2.getText().trim();
          datos2[1]=txtTelefono2.getText().trim();
          datos2[2]=txtMontoTransferencia.getText().trim();
          datos2[3]=boxEstado.getSelectedItem().toString().trim();
     
  
     tabla2.insertRow(0, datos2);
     txtMontoTransferencia.setText("");
     txtNombreCliente2.setText("");
     txtTelefono2.setText("");
     rendicionTIempoReal();
     
     }
     
    }//GEN-LAST:event_botonAgregarTransferenciaActionPerformed

    private void botonAgregarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarFiadoActionPerformed
if (txtMontoFiado.getText().isEmpty() || txtNombreCliente.getText().isEmpty() || txtTelefono1.getText().isEmpty()){
      JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de fiados","ERROR",ERROR_MESSAGE);
      return;
}else{
     datos[0]=txtNombreCliente.getText().trim();
     datos[1]=txtTelefono1.getText().trim();
     datos[2]=txtMontoFiado.getText().trim();
     
  
     tabla1.insertRow(0, datos);
     txtMontoFiado.setText("");
     txtNombreCliente.setText("");
     txtTelefono1.setText("");
     rendicionTIempoReal();

}
 
    }//GEN-LAST:event_botonAgregarFiadoActionPerformed

    private void botonQuitarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarFiadoActionPerformed
     
            tabla1.removeRow(tablaFiados.getSelectedRow());
            desactivarQuitarFiado();
            rendicionTIempoReal();
       
           
       
       
    }//GEN-LAST:event_botonQuitarFiadoActionPerformed

    private void tablaFiadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFiadosMouseClicked
    
        activarQuitarFiado();
       
       
       
    }//GEN-LAST:event_tablaFiadosMouseClicked

    private void botonQuitarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarTransferenciaActionPerformed
        tabla2.removeRow(tablaTransferencias.getSelectedRow());
        desactivarQuitarTransferencia();
        rendicionTIempoReal();
        
    }//GEN-LAST:event_botonQuitarTransferenciaActionPerformed

    private void tablaTransferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTransferenciasMouseClicked
      activarQuitarTransferencia();
    }//GEN-LAST:event_tablaTransferenciasMouseClicked

    private void botonAgregarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarGastoActionPerformed
       if (txtMontoGasto.getText().isEmpty() || boxGasto.getSelectedItem().equals("Seleccione un Gasto")){
          JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de gastos","ERROR",ERROR_MESSAGE);
           return;
       }else{
           datos3[0]=boxGasto.getSelectedItem().toString().trim();
           datos3[1]=txtMontoGasto.getText().trim();
          datos3[2]=boxPreventista.getSelectedItem();
  
          tabla3.insertRow(0, datos3);
          txtMontoGasto.setText("");
          rendicionTIempoReal();

}
    }//GEN-LAST:event_botonAgregarGastoActionPerformed

    private void botonQuitarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarGastoActionPerformed
       tabla3.removeRow(tablaGastos.getSelectedRow());
       desactivarQuitarGasto();
       rendicionTIempoReal();
    }//GEN-LAST:event_botonQuitarGastoActionPerformed

    private void tablaGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGastosMouseClicked
        activarQuitarGasto();
    }//GEN-LAST:event_tablaGastosMouseClicked

    private void botonAgregarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarDevolucionActionPerformed
       if (txtMontoDevolucion.getText().isEmpty() || txtNombreCliente3.getText().isEmpty() || txtTelefono3.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Debe llenar algunos campos de devolución","ERROR",ERROR_MESSAGE);
           return;
       }else{
           datos4[0]=txtNombreCliente3.getText().trim();
           datos4[1]=txtTelefono3.getText().trim();
           datos4[2]=txtMontoDevolucion.getText().trim();
           datos4[3]=txtMotivo.getText().trim();
           
          
  
          tabla4.insertRow(0, datos4);
          txtMontoDevolucion.setText("");
          txtMotivo.setText("");      
          txtNombreCliente3.setText("");
          txtTelefono3.setText("");
          rendicionTIempoReal();

      }
    }//GEN-LAST:event_botonAgregarDevolucionActionPerformed

    private void botonQuitarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarDevolucionActionPerformed
        tabla4.removeRow(tablaDevolucion.getSelectedRow());
        desactivarQuitarDevolucion();
        rendicionTIempoReal();
    }//GEN-LAST:event_botonQuitarDevolucionActionPerformed

    private void tablaDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDevolucionMouseClicked
        activarQuitarDevolucion();
    }//GEN-LAST:event_tablaDevolucionMouseClicked

    private void botonAgregarProDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProDevActionPerformed
       if (txtCantidad.getText().isEmpty() || txtMontoProductosDev.getText().isEmpty() || txtProducto.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de productos devueltos","ERROR",ERROR_MESSAGE);
           return;
       }else{
           datos5[0]=txtProducto.getText().trim();
           datos5[1]=txtCantidad.getText().trim();
           datos5[2]=txtMontoProductosDev.getText().trim();
  
          tabla5.insertRow(0, datos5);
          txtCantidad.setText("");
          txtMontoProductosDev.setText("");
          txtProducto.setText("");
          rendicionTIempoReal();

}
    }//GEN-LAST:event_botonAgregarProDevActionPerformed

    private void botonQuitarProDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarProDevActionPerformed
         tabla5.removeRow(tablaProductosDevueltos.getSelectedRow());
         desactivarQuitarProductosDevueltos();
         rendicionTIempoReal();
    }//GEN-LAST:event_botonQuitarProDevActionPerformed

    private void tablaProductosDevueltosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosDevueltosMouseClicked
         activarQuitarProductosDevueltos();
    }//GEN-LAST:event_tablaProductosDevueltosMouseClicked

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
      //validar que los campos esten llenos..
      if (txtFecha.getText().isEmpty() || boxZona.getSelectedItem().equals("Seleccione una Zona") || boxPreventista.getSelectedItem().equals("Seleccione un Preventista") ||  txtMonto.getText().isEmpty() || txtVentas.getText().isEmpty() ||  txtEfectivo.getText().isEmpty() || txtCobranzas.getText().isEmpty()  ){
          JOptionPane.showMessageDialog(null, "Debe llenar algunos campos obligatorios","ERROR",ERROR_MESSAGE);
          return;
      }
        
      
      try{
                   String fechaDB=obtenerFecha();// si la fecha está mal, salta directo al catch
                   
                   ////////////////////////verificamos que primero haya cargado un objetivo del año y mes que haya cargado  en fecha, por ejemplo si pone 01/01/2025  verficaremos que tenga un objetivo cargado del mes 1(enero) del año 2025 en esta caso, si no tiene cargado un objetivo el sistema no le permitirá registrar una rendicion hasta que cargue un objetivo del mes de enero de 2025 en esta caso
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                  LocalDate fecha = LocalDate.parse(fechaDB, formatter);

                   int año = fecha.getYear();   // ej: 2025
                   int mes  = fecha.getMonthValue(); // ej: 11
                   // Obtener mes en español (enero, febrero, …)
                   String mesEnLetra = fecha.getMonth()
                  .getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

                   // Convertir primera letra a mayúscula
                   mesEnLetra = mesEnLetra.substring(0,1).toUpperCase() + mesEnLetra.substring(1);
                   String preventista= boxPreventista.getSelectedItem().toString();
            // Separar en base al guion
            String[] partes = preventista.split("---");
            // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
            String apellido = partes[0].trim();
            String dni = partes[1].trim();
            int id=clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
                   
                   int id_objetivo=clases.objetivo.obtenerIDporMesYAño(cx, id, año, mes); //obtener el id objetivo del preventista , para ver si la fecha que ingreso el usuario(el año y el mes mas que nada) estan cargados en objetivos, osea que haya cargado el objetivo del preventista con ese año y ese mes 
                   if(id_objetivo==0){
                        JOptionPane.showMessageDialog(null, "No ha registrado un objetivo del año "+año+" del mes "+mesEnLetra+" del preventista "+boxPreventista.getSelectedItem(),"ERROR",ERROR_MESSAGE);
                     return;
                   }
                   
                   
                   ////////////////////////////veriricamos que no registre una misma rendicion dos veces, es decir, si ya cargo la rendicion de cazon el 01/01/2025 y quiere volver a cargar otra rendicion de cazon con esa fecha, el sistema no le permitirá, ya que solo es un rendicion por dia...
               boolean v= clases.rendicion.veficarDobleRendicion(cx,fechaDB, id);
               if (v==true){
                     JOptionPane.showMessageDialog(null, "Ya ha registrado la rendicion de la fecha "+txtFecha.getText()+" del preventista "+boxPreventista.getSelectedItem(),"ERROR",ERROR_MESSAGE);
                     return;
               }
      }catch(Exception e){
             JOptionPane.showMessageDialog(null, "error ","ERROR",ERROR_MESSAGE);
             e.printStackTrace();
              return;
              
      }

      ///////////////////////////////////// FIADOS
       float  totalFiado=0;
        for (int i = 0; i < tablaFiados.getRowCount(); i++) {
          Object clienteObj = tablaFiados.getValueAt(i, 0);
          Object telefono1Obj = tablaFiados.getValueAt(i, 1);
           Object montoObj = tablaFiados.getValueAt(i, 2);

        // Primero validar que NO sean null
        if (clienteObj == null || montoObj == null || telefono1Obj==null) {
            continue; // salta a la siguiente fila
        }

        // Ahora sí convertir a String
        String clienteF = clienteObj.toString().trim();
        String montoF = montoObj.toString().trim();
        totalFiado=totalFiado+Float.parseFloat(montoF);

        }
        
        //////////////////////////////////////TRANSFERENCIASSS
        float totalTransferencias=0;
        for (int j=0; j<tablaTransferencias.getRowCount();j++){
            Object cliente2Obj = tablaTransferencias.getValueAt(j, 0);
            Object telefono2Obj = tablaTransferencias.getValueAt(j, 1);
            Object monto2Obj = tablaTransferencias.getValueAt(j, 2);
            Object estadoObj=tablaTransferencias.getValueAt(j, 3);
               
          // validar que NO sean null
        if (cliente2Obj == null || monto2Obj == null || estadoObj == null || telefono2Obj==null)  {
            continue; // salta a la siguiente fila
        }
        
        String clienteT=cliente2Obj.toString().trim();
        String montoT= monto2Obj.toString().trim();
        String estado=estadoObj.toString().trim();
        totalTransferencias=totalTransferencias+Float.parseFloat(montoT);
       }
        
        
        ////////////////////////////////////// GASTOOOS
        float totalGastos=0;
        for (int k=0; k<tablaGastos.getRowCount();k++){
            Object gastoObj=tablaGastos.getValueAt(k, 0);
            Object monto3Obj=tablaGastos.getValueAt(k, 1);
            
            if (gastoObj==null || monto3Obj==null){
                continue;
            }
            
            String gasto=gastoObj.toString().trim();
            String montoG=monto3Obj.toString().trim();
            totalGastos=totalGastos+Float.parseFloat(montoG);
        }
        
        
        /////////////////////////////// DEVOLUCIONES
        float totalDevolucion=0;
        int cantidadVentas=Integer.parseInt(txtVentas.getText());
        
        for (int h=0;h<tablaDevolucion.getRowCount();h++){
            Object cliente3Obj=tablaDevolucion.getValueAt(h, 0);
             Object telefono3Obj=tablaDevolucion.getValueAt(h, 1);
            Object monto4Obj=tablaDevolucion.getValueAt(h, 2);
            Object motivo3Obj=tablaDevolucion.getValueAt(h, 3);
            
            if(cliente3Obj==null || monto4Obj==null || motivo3Obj==null || telefono3Obj==null ){
                continue;
            }
            String clienteD=cliente3Obj.toString().trim();
            String montoD=monto4Obj.toString().trim();
            
            totalDevolucion=totalDevolucion+Float.parseFloat(montoD);
            cantidadVentas=cantidadVentas-1;
        }
        
        
        ////// PRODUCTOS DEVUELTOS
 
        for (int p=0;p<tablaProductosDevueltos.getRowCount();p++){
            Object productoObj=tablaProductosDevueltos.getValueAt(p, 0);
            Object cantidadObj = tablaProductosDevueltos.getValueAt(p, 1);
            Object totalObj=tablaProductosDevueltos.getValueAt(p, 2);
           if (productoObj==null || cantidadObj==null || totalObj==null){
                continue;
            }
            
            String producto=productoObj.toString().trim();
            String cantidad=cantidadObj.toString().trim();
            String total=totalObj.toString().trim();
            totalDevolucion=totalDevolucion+Float.parseFloat(total);
            
        }
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////  INSERTAR RENDICION/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //// lo que realmente vendio el preventista .....
        float rendicionFinal=Float.parseFloat(txtEfectivo.getText()) +totalFiado+totalTransferencias+totalGastos-Float.parseFloat(txtCobranzas.getText());
        
         ///// lo que realmente prevendio el preventista....
        float totalGeneral= Float.parseFloat(txtMonto.getText())-totalDevolucion;
        
        
        
        ///diferencia...
        float diferencia=rendicionFinal-totalGeneral;
        
        
      
    

        
        String preventista= boxPreventista.getSelectedItem().toString();
            // Separar en base al guion
            String[] partes = preventista.split("---");
            // Guardar los datos por separado, es decir el apellido del preventista en una variable y su dni en otra...
            String apellido = partes[0].trim();
            String dni = partes[1].trim();
            
        

        String zona=boxZona.getSelectedItem().toString();
        try{
        
        String fechaDB=obtenerFecha();// si la fecha está mal, salta directo al catch
        
            
          int id_preventista=  clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
          int id_zona=clases.zona.obtenerId(cx, zona);
            clases.rendicion.insertarRendicion(cx, id_preventista, fechaDB, id_zona, totalGeneral, rendicionFinal, totalFiado, totalDevolucion, totalGastos, diferencia, cantidadVentas, txtObservacion.getText()  );
          
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al registrar la rendición","ERROR",ERROR_MESSAGE);   ///si ocurre un error al intentar registrar una rendicion, directamente retorna y no se sigue ejecutando.., si es que esta todo bien continua e inserta con las demas tablas..
             return;
        }
        
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////INSERCION MASIVA A OTRAS TABLAS, RELACIONANDO CADA UNA DE ELLAS A LA RENDICION RECIEN INSERTADA ARRIBA ////////////////////////////////////////////////////////////////////////////
        
        // insert a la tabla fiados
          for (int y=0;y<tablaFiados.getRowCount();y++){
            Object clienteFiado=tablaFiados.getValueAt(y, 0);
            Object telefonoFiado=tablaFiados.getValueAt(y, 1);
            Object montoFiado=tablaFiados.getValueAt(y, 2);
     
            if(clienteFiado==null || montoFiado==null || telefonoFiado==null){
                continue;
            }
            String cf=clienteFiado.toString().trim();
            String tf=telefonoFiado.toString().trim();
            String mf=montoFiado.toString().trim();
            
            try{
                int id_cliente=clases.cliente.obtenerCodigoCliente(cx, cf, tf);
                int id_preventista=  clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
                 String fechaDB=obtenerFecha();
                 int id_rendicion=  clases.rendicion.buscarIdRendicion(cx, fechaDB, id_preventista);
              

                clases.rendicion.insertarFiado(cx, id_cliente, Float.parseFloat(mf) , id_rendicion);
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error al intentar cargar un fiado","ERROR",ERROR_MESSAGE);
            }
        }
          
          
          ///insert a la tabla transferncias...
            for (int t=0;t<tablaTransferencias.getRowCount();t++){
            Object clienteTransferencia=tablaTransferencias.getValueAt(t, 0);
            Object telefonoTransferencia=tablaTransferencias.getValueAt(t, 1);
            Object montoTransferencia=tablaTransferencias.getValueAt(t, 2);
            Object estadoTransferencia=tablaTransferencias.getValueAt(t, 3);
     
            if(clienteTransferencia==null || montoTransferencia==null || telefonoTransferencia==null ){
                continue;
            }
            String ct=clienteTransferencia.toString().trim();
            String tt=telefonoTransferencia.toString().trim();
            String mt=montoTransferencia.toString().trim();
           String et = (estadoTransferencia == null) ? "" : estadoTransferencia.toString().trim();
           if (et == null || et.trim().isEmpty()) {
                  et = "Pendiente";
            }
            
            try{
                int id_cliente=clases.cliente.obtenerCodigoCliente(cx, ct,tt);
                  int id_preventista=  clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
                   String fechaDB=obtenerFecha();
                 int id_rendicion=  clases.rendicion.buscarIdRendicion(cx, fechaDB, id_preventista);


                clases.rendicion.insertarTransferencia(cx, fechaDB, id_cliente, Float.parseFloat(mt), id_rendicion, et);
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "Error al intentar cargar una transferencia","ERROR",ERROR_MESSAGE);
            }
        }
            
            
            ////insert a la tabla gastoss realizados..
            for (int e=0;e<tablaGastos.getRowCount();e++){
            Object gasto=tablaGastos.getValueAt(e, 0);
            Object montoG=tablaGastos.getValueAt(e, 1);
        
     
            if(gasto==null  || montoG==null){
                continue;
            }
            String g=gasto.toString().trim();
            String mg=montoG.toString().trim();
       
            
            try{
                int id_gasto= clases.gasto.obtenerId(cx, g);
                  int id_preventista=  clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
                   String fechaDB=obtenerFecha();
                 int id_rendicion=  clases.rendicion.buscarIdRendicion(cx, fechaDB, id_preventista);
                clases.rendicion.insertarGastosRealizados(cx, id_gasto, id_preventista, Float.parseFloat(mg), id_rendicion);
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "Error al intentar cargar un gasto","ERROR",ERROR_MESSAGE);
            }
        }
            
            /// insert a la tabla devoluciones..
              for (int d=0;d<tablaDevolucion.getRowCount();d++){
            Object clienteDev=tablaDevolucion.getValueAt(d, 0);
             Object telefonoDev=tablaDevolucion.getValueAt(d, 1);
            Object montoDev=tablaDevolucion.getValueAt(d, 2);
            Object motivoDev=tablaDevolucion.getValueAt(d, 3);
     
            if(clienteDev==null || montoDev==null  || motivoDev==null || telefonoDev ==null){
                continue;
            }
            String cd=clienteDev.toString().trim();
            String td=telefonoDev.toString().trim();
            String md=montoDev.toString().trim();
            String motivoD=motivoDev.toString().trim();
            
            try{
               
                int id_cliente= clases.cliente.obtenerCodigoCliente(cx,cd , td);
                   int id_preventista=  clases.preventista.obtenerID(cx, apellido, Integer.parseInt(dni));
                    String fechaDB=obtenerFecha();
                 int id_rendicion=  clases.rendicion.buscarIdRendicion(cx, fechaDB, id_preventista);
                clases.rendicion.insertarDevolucion(cx, id_cliente, Float.parseFloat(md), motivoD, id_rendicion);
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error al intentar cargar una devolucion","ERROR",ERROR_MESSAGE);
                 
            }
        }
              
              
              
         JOptionPane.showMessageDialog(null, "Se ha registrado la rendición correctamente");
               ///una vez finalizadas todas las inserciones, limpiamos pantalla..
               limpiar();
        
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void txtMontoProductosDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoProductosDevActionPerformed
   
    }//GEN-LAST:event_txtMontoProductosDevActionPerformed

    public void setTxtPrueba(String nombre) {
       txtNombreCliente.setText(nombre);
    }
     public void setTxtNombreCliente2(String nombre) {
        txtNombreCliente2.setText(nombre);
    }

    public void setTxtNombreCliente3(String nombre) {
       txtNombreCliente3.setText(nombre);
    }

    public void setTxtProducto(String nombre) {
        txtProducto.setText(nombre);
    }

    public void setTxtTelefono1(String telefono) {
        this.txtTelefono1.setText(telefono);
    }

    public void setTxtTelefono2(String telefono2) {
        this.txtTelefono2.setText(telefono2);
    }

    public void setTxtTelefono3(String telefono3) {
        this.txtTelefono3.setText(telefono3);
    }
    

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
          String descripcion=txtProducto.getText();
          int cantidad=0;
          if(!txtCantidad.getText().isEmpty()){
              cantidad= Integer.parseInt(txtCantidad.getText());
          }
        
        try{
          float precio=  clases.producto.obtenerPrecioProducto(cx, descripcion);
          float total=cantidad*precio;
            txtMontoProductosDev.setText(String.valueOf(total) );
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "No se ha podido cargar el monto total del producto","ERROR",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void boxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
JDialog dialog = new JDialog(parent, "Buscar cliente", true); // true = modal
cliente panelCliente = new cliente(this, 1);
dialog.getContentPane().add(panelCliente);
dialog.pack();
dialog.setLocationRelativeTo(parent); // centrar sobre el frame
dialog.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
JDialog dialog = new JDialog(parent, "Buscar cliente", true); // true = modal
cliente panelCliente = new cliente(this, 2);
dialog.getContentPane().add(panelCliente);
dialog.pack();
dialog.setLocationRelativeTo(parent); // centrar sobre el frame
dialog.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
JDialog dialog = new JDialog(parent, "Buscar cliente", true); // true = modal
cliente panelCliente = new cliente(this, 3);
dialog.getContentPane().add(panelCliente);
dialog.pack();
dialog.setLocationRelativeTo(parent); // centrar sobre el frame
dialog.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
JDialog dialog = new JDialog(parent, "Buscar Producto", true); // true = modal
producto panelProducto = new producto(this);
dialog.getContentPane().add(panelProducto);
dialog.pack();
dialog.setLocationRelativeTo(parent); // centrar sobre el frame
dialog.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
           char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMonto.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentasActionPerformed

    private void txtVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasKeyTyped
              char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtVentas.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtVentasKeyTyped

    private void txtMontoFiadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoFiadoKeyTyped
           char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMontoFiado.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoFiadoKeyTyped

    private void txtMontoTransferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTransferenciaKeyTyped
           char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMontoTransferencia.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoTransferenciaKeyTyped

    private void txtMontoGastoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoGastoKeyTyped
            char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMontoGasto.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoGastoKeyTyped

    private void txtMontoDevolucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoDevolucionKeyTyped
            char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMontoDevolucion.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoDevolucionKeyTyped

    private void txtMontoProductosDevKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoProductosDevKeyTyped
             char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMontoProductosDev.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtMontoProductosDevKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
           char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtMonto.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtMotivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoKeyTyped
              char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  ) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtMotivoKeyTyped

    private void txtEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyTyped
            char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtEfectivo.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtEfectivoKeyTyped

    private void txtCobranzasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCobranzasKeyTyped
           char c=evt.getKeyChar();
         // verificar si el carácter ingresado es unicamente numeros
      if (!Character.isDigit(c) || txtCobranzas.getText().length()>10) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txtCobranzasKeyTyped

    private void txtObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyTyped
               char c=evt.getKeyChar();
         // verificar si el carácter ingresado es una letra
      if (!( Character.isLetter(c) || c==' ')  ) {
        evt.consume();  // si no es una letra, consume el evento y no permite el ingreso
    }
    }//GEN-LAST:event_txtObservacionKeyTyped

    private void botonAgregarFiadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonAgregarFiadoItemStateChanged
       
    }//GEN-LAST:event_botonAgregarFiadoItemStateChanged

    private void botonAgregarTransferenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonAgregarTransferenciaItemStateChanged
       
    }//GEN-LAST:event_botonAgregarTransferenciaItemStateChanged

    private void botonAgregarGastoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonAgregarGastoItemStateChanged
       
    }//GEN-LAST:event_botonAgregarGastoItemStateChanged

    private void botonAgregarDevolucionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonAgregarDevolucionItemStateChanged
       
    }//GEN-LAST:event_botonAgregarDevolucionItemStateChanged

    private void botonAgregarProDevItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonAgregarProDevItemStateChanged
    
    }//GEN-LAST:event_botonAgregarProDevItemStateChanged

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
       rendicionTIempoReal();
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void txtCobranzasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCobranzasKeyReleased
        rendicionTIempoReal();
    }//GEN-LAST:event_txtCobranzasKeyReleased

    private void txtMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyReleased
        rendicionTIempoReal();
    }//GEN-LAST:event_txtMontoKeyReleased

    private void botonQuitarFiadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonQuitarFiadoItemStateChanged
  
    }//GEN-LAST:event_botonQuitarFiadoItemStateChanged

    private void botonQuitarTransferenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonQuitarTransferenciaItemStateChanged
    
    }//GEN-LAST:event_botonQuitarTransferenciaItemStateChanged

    private void botonQuitarGastoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonQuitarGastoItemStateChanged
       
    }//GEN-LAST:event_botonQuitarGastoItemStateChanged

    private void botonQuitarDevolucionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonQuitarDevolucionItemStateChanged
        
    }//GEN-LAST:event_botonQuitarDevolucionItemStateChanged

    private void botonQuitarProDevItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonQuitarProDevItemStateChanged

    }//GEN-LAST:event_botonQuitarProDevItemStateChanged

    private void txtVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasKeyReleased
         rendicionTIempoReal();
    }//GEN-LAST:event_txtVentasKeyReleased

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Rendicion;
    private javax.swing.JButton botonAgregarDevolucion;
    private javax.swing.JButton botonAgregarFiado;
    private javax.swing.JButton botonAgregarGasto;
    private javax.swing.JButton botonAgregarProDev;
    private javax.swing.JButton botonAgregarTransferencia;
    private javax.swing.JButton botonQuitarDevolucion;
    private javax.swing.JButton botonQuitarFiado;
    private javax.swing.JButton botonQuitarGasto;
    private javax.swing.JButton botonQuitarProDev;
    private javax.swing.JButton botonQuitarTransferencia;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxGasto;
    private javax.swing.JComboBox<String> boxPreventista;
    private javax.swing.JComboBox<String> boxZona;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tablaDevolucion;
    private javax.swing.JTable tablaFiados;
    private javax.swing.JTable tablaGastos;
    private javax.swing.JTable tablaProductosDevueltos;
    private javax.swing.JTable tablaTransferencias;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCobranzas;
    private javax.swing.JTextField txtDiferencia;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoDevolucion;
    private javax.swing.JTextField txtMontoFiado;
    private javax.swing.JTextField txtMontoGasto;
    private javax.swing.JTextField txtMontoProductosDev;
    private javax.swing.JTextField txtMontoTransferencia;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreCliente2;
    private javax.swing.JTextField txtNombreCliente3;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtPuntosDeVentas;
    private javax.swing.JTextField txtRendicionReal;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefono3;
    private javax.swing.JTextField txtTotalGeneral;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables

  
}
