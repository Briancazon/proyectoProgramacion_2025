
package formularios;


import Formulario2.CE;
import Formulario2.PD;
import Formulario2.devolucion;
import Formulario2.fiado;
import Formulario2.formula1;
import Formulario2.gastos;
import Formulario2.objetivos;
import Formulario2.objetivosConsulta;
import Formulario2.rendiciones;
import Formulario2.transferencia;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;

import java.awt.BorderLayout;
import java.awt.Color;





public class principal extends javax.swing.JFrame {

 
    public principal() {
        initComponents();
      //  this.setExtendedState(this.MAXIMIZED_BOTH);
       this.setLocationRelativeTo(null);
       this.setExtendedState(this.MAXIMIZED_BOTH);
      


    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        escritorio1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rendicion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fiado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        transferencia = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pdevuelto = new javax.swing.JPanel();
        transferencia1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        clientesMenu = new javax.swing.JMenu();
        opcionCargarCliente = new javax.swing.JMenuItem();
        opcionVerClientes = new javax.swing.JMenuItem();
        opcionModificarEliminarClientes = new javax.swing.JMenuItem();
        zonaMenu = new javax.swing.JMenu();
        opcionCargarVerZonas = new javax.swing.JMenuItem();
        opcionModificarEliminarZonas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(877, 608));
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout escritorio1Layout = new javax.swing.GroupLayout(escritorio1);
        escritorio1.setLayout(escritorio1Layout);
        escritorio1Layout.setHorizontalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1730, Short.MAX_VALUE)
        );
        escritorio1Layout.setVerticalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );

        escritorio.add(escritorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1730, 1010));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rendicion.setBackground(new java.awt.Color(51, 102, 255));
        rendicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        rendicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rendicionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rendicionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rendicionMouseExited(evt);
            }
        });
        rendicion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rendición");
        rendicion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 14, -1, -1));

        jPanel1.add(rendicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 60));

        fiado.setBackground(new java.awt.Color(51, 102, 255));
        fiado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fiado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fiadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fiadoMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fiados");

        javax.swing.GroupLayout fiadoLayout = new javax.swing.GroupLayout(fiado);
        fiado.setLayout(fiadoLayout);
        fiadoLayout.setHorizontalGroup(
            fiadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fiadoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        fiadoLayout.setVerticalGroup(
            fiadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fiadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(fiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, -1));

        transferencia.setBackground(new java.awt.Color(51, 102, 255));
        transferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        transferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferenciaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Transferencias");

        javax.swing.GroupLayout transferenciaLayout = new javax.swing.GroupLayout(transferencia);
        transferencia.setLayout(transferenciaLayout);
        transferenciaLayout.setHorizontalGroup(
            transferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferenciaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        transferenciaLayout.setVerticalGroup(
            transferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferenciaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(transferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, -1));

        pdevuelto.setBackground(new java.awt.Color(51, 102, 255));
        pdevuelto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdevueltoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdevueltoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdevueltoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pdevueltoLayout = new javax.swing.GroupLayout(pdevuelto);
        pdevuelto.setLayout(pdevueltoLayout);
        pdevueltoLayout.setHorizontalGroup(
            pdevueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        pdevueltoLayout.setVerticalGroup(
            pdevueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jPanel1.add(pdevuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 180, -1));

        transferencia1.setBackground(new java.awt.Color(51, 102, 255));
        transferencia1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        transferencia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferencia1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferencia1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferencia1MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Objetivos");

        javax.swing.GroupLayout transferencia1Layout = new javax.swing.GroupLayout(transferencia1);
        transferencia1.setLayout(transferencia1Layout);
        transferencia1Layout.setHorizontalGroup(
            transferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferencia1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        transferencia1Layout.setVerticalGroup(
            transferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferencia1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(transferencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, -1));

        clientesMenu.setText("Clientes");

        opcionCargarCliente.setText("Alta");
        opcionCargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCargarClienteActionPerformed(evt);
            }
        });
        clientesMenu.add(opcionCargarCliente);

        opcionVerClientes.setText("Consulta");
        opcionVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionVerClientesActionPerformed(evt);
            }
        });
        clientesMenu.add(opcionVerClientes);

        opcionModificarEliminarClientes.setText("Modificación/Baja");
        opcionModificarEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModificarEliminarClientesActionPerformed(evt);
            }
        });
        clientesMenu.add(opcionModificarEliminarClientes);

        jMenuBar1.add(clientesMenu);

        zonaMenu.setText("Zonas");
        zonaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaMenuActionPerformed(evt);
            }
        });

        opcionCargarVerZonas.setText("Alta/Consulta");
        opcionCargarVerZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCargarVerZonasActionPerformed(evt);
            }
        });
        zonaMenu.add(opcionCargarVerZonas);

        opcionModificarEliminarZonas.setText("Modificación/Baja");
        opcionModificarEliminarZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModificarEliminarZonasActionPerformed(evt);
            }
        });
        zonaMenu.add(opcionModificarEliminarZonas);

        jMenuBar1.add(zonaMenu);

        jMenu1.setText("Preventistas");

        jMenuItem1.setText("Alta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Baja");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Modificación");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setText("Consulta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gastos");

        jMenuItem5.setText("Alta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Baja");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Modificación");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Consulta");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Productos");

        jMenuItem9.setText("Alta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Consulta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Modificación");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Baja");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Usuario");

        jMenuItem13.setText("Alta");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Baja");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Modificación");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Consulta");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Consultas");

        jMenuItem17.setText("Rendición");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Objetivos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1711, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCargarClienteActionPerformed

    cargarCliente cc= new cargarCliente();
    cc.setSize(escritorio1.getSize());

    cc.setSize(960, 623);
    cc.setLocation(0,0);
    escritorio1.removeAll();
    escritorio1.add(cc, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint();
      
        
    }//GEN-LAST:event_opcionCargarClienteActionPerformed

    private void zonaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaMenuActionPerformed
       
    }//GEN-LAST:event_zonaMenuActionPerformed

    private void opcionCargarVerZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCargarVerZonasActionPerformed

       cargarZona cz= new cargarZona();
    cz.setSize(960, 623);
    cz.setLocation(0,0);
    escritorio1.removeAll();
    escritorio1.add(cz, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint();
        
    }//GEN-LAST:event_opcionCargarVerZonasActionPerformed

    private void opcionModificarEliminarZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModificarEliminarZonasActionPerformed
        
       
       modificarZona mz= new modificarZona();
    mz.setSize(960, 623);
    mz.setLocation(0,0);
    escritorio.removeAll();
    escritorio1.add(mz, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint(); 
        
    }//GEN-LAST:event_opcionModificarEliminarZonasActionPerformed

    private void opcionVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionVerClientesActionPerformed
     verClientes vc= new verClientes();
    vc.setSize(960, 623);
    vc.setLocation(0,0);
    escritorio1.removeAll();
    escritorio1.add(vc, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint();
       
    }//GEN-LAST:event_opcionVerClientesActionPerformed

    private void opcionModificarEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModificarEliminarClientesActionPerformed
        modificarEliminarCliente mec= new modificarEliminarCliente();
    mec.setSize(960, 623);
    mec.setLocation(0,0);
    escritorio1.removeAll();
    escritorio1.add(mec, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint();   
      
    }//GEN-LAST:event_opcionModificarEliminarClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    cargaPreventista cp= new cargaPreventista();
    cp.setSize(960, 623);
    cp.setLocation(0,0);
    escritorio1.removeAll();
    escritorio1.add(cp, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint();   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       verPreventista vp= new verPreventista();
    vp.setSize(960, 623);
    vp.setLocation(0,0);
    escritorio1.removeAll();
    escritorio1.add(vp, BorderLayout.CENTER);
    escritorio1.revalidate();
    escritorio1.repaint();   
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
          modificarPreventista mp = new modificarPreventista();
         mp.setSize(960, 623);
         mp.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(mp, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();  
          
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         eliminarPreventista ep = new eliminarPreventista();
         ep.setSize(960, 623);
         ep.setLocation(0,0);
         escritorio.removeAll();
         escritorio1.add(ep, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         cargaGastos cg = new cargaGastos();
         cg.setSize(960, 623);
         cg.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(cg, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint(); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         verGastos vg = new verGastos();
         vg.setSize(960, 623);
         vg.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(vg, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint(); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
          modificarGasto mg = new modificarGasto();
         mg.setSize(960, 623);
         mg.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(mg, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           eliminarGasto eg = new eliminarGasto();
         eg.setSize(960, 623);
         eg.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(eg, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint(); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
          cargaProductos cp = new cargaProductos();
         cp.setSize(960, 623);
         cp.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(cp, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint(); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         verProductos vp = new verProductos();
         vp.setSize(960, 623);
         vp.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(vp, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         modificarProducto mp = new modificarProducto();
         mp.setSize(960, 623);
         mp.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(mp, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         eliminarProducto ep = new eliminarProducto();
         ep.setSize(960, 623);
         ep.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(ep, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
         cargaUsuario cu = new cargaUsuario();
        cu.setSize(960, 623);
         cu.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(cu, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        verUsuarios vu = new verUsuarios();
        vu.setSize(960, 623);
         vu.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(vu, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        modificarUsuario mu = new modificarUsuario();
        mu.setSize(960, 623);
         mu.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(mu, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        eliminarUsuario eu = new eliminarUsuario();
        eu.setSize(960, 623);
         eu.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(eu, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void rendicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendicionMouseEntered
       rendicion.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_rendicionMouseEntered

    private void rendicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendicionMouseExited
        rendicion.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_rendicionMouseExited

    private void fiadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiadoMouseEntered
        fiado.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_fiadoMouseEntered

    private void fiadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiadoMouseExited
        fiado.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_fiadoMouseExited

    private void transferenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferenciaMouseEntered
       transferencia.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_transferenciaMouseEntered

    private void transferenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferenciaMouseExited
        transferencia.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_transferenciaMouseExited

    private void pdevueltoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdevueltoMouseEntered
        pdevuelto.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pdevueltoMouseEntered

    private void pdevueltoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdevueltoMouseExited
       pdevuelto.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_pdevueltoMouseExited

    private void rendicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendicionMouseClicked
        formula1 f1 = new formula1();
        f1.setSize(1830, 1031);
         f1.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(f1);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_rendicionMouseClicked

    private void fiadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiadoMouseClicked
        fiado fi = new fiado();
        fi.setSize(1684, 1031);
         fi.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(fi, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_fiadoMouseClicked

    private void transferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferenciaMouseClicked
        transferencia t = new transferencia();
        t.setSize(1684, 1031);
         t.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(t);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_transferenciaMouseClicked

    private void pdevueltoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdevueltoMouseClicked
        PD p = new PD();
         p.setSize(1684, 1031);
         p.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(p, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
        
        
        
    }//GEN-LAST:event_pdevueltoMouseClicked

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        rendiciones r = new rendiciones();
         r.setSize(1684, 1031);
         r.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(r, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
        
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void transferencia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferencia1MouseClicked
        objetivos ob = new objetivos();
        ob.setSize(1684, 1031);
         ob.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(ob, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_transferencia1MouseClicked

    private void transferencia1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferencia1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_transferencia1MouseEntered

    private void transferencia1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferencia1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_transferencia1MouseExited

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
         objetivosConsulta oc = new objetivosConsulta();
        oc.setSize(1830, 1031);
         oc.setLocation(0,0);
         escritorio1.removeAll();
         escritorio1.add(oc, BorderLayout.CENTER);
         escritorio1.revalidate();
         escritorio1.repaint();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         try{
//            UIManager.setLookAndFeel(new FlatLightLaf());
              FlatGrayIJTheme.setup();
        } catch (Exception ex) {
             System.out.println("NO");
        }
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu clientesMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel escritorio1;
    private javax.swing.JPanel fiado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem opcionCargarCliente;
    private javax.swing.JMenuItem opcionCargarVerZonas;
    private javax.swing.JMenuItem opcionModificarEliminarClientes;
    private javax.swing.JMenuItem opcionModificarEliminarZonas;
    private javax.swing.JMenuItem opcionVerClientes;
    private javax.swing.JPanel pdevuelto;
    private javax.swing.JPanel rendicion;
    private javax.swing.JPanel transferencia;
    private javax.swing.JPanel transferencia1;
    private javax.swing.JMenu zonaMenu;
    // End of variables declaration//GEN-END:variables
}
