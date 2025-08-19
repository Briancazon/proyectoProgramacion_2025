
package formularios;

import java.awt.BorderLayout;





public class principal extends javax.swing.JFrame {

 
    public principal() {
        initComponents();
      //  this.setExtendedState(this.MAXIMIZED_BOTH);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
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
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

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

        jMenuItem12.setText("Baja");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem11.setText("Modificación");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem10.setText("Consulta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

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

        jMenu5.setText("Rendicion");

        jMenuItem17.setText("Ver");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCargarClienteActionPerformed

    cargarCliente cc= new cargarCliente();
    cc.setSize(escritorio.getSize());

    cc.setSize(960, 623);
    cc.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(cc, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint();
      
        
    }//GEN-LAST:event_opcionCargarClienteActionPerformed

    private void zonaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaMenuActionPerformed
       
    }//GEN-LAST:event_zonaMenuActionPerformed

    private void opcionCargarVerZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCargarVerZonasActionPerformed

       cargarZona cz= new cargarZona();
    cz.setSize(960, 623);
    cz.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(cz, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint();
        
    }//GEN-LAST:event_opcionCargarVerZonasActionPerformed

    private void opcionModificarEliminarZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModificarEliminarZonasActionPerformed
        
       
       modificarZona mz= new modificarZona();
    mz.setSize(960, 623);
    mz.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(mz, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint(); 
        
    }//GEN-LAST:event_opcionModificarEliminarZonasActionPerformed

    private void opcionVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionVerClientesActionPerformed
     verClientes vc= new verClientes();
    vc.setSize(960, 623);
    vc.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(vc, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint();
       
    }//GEN-LAST:event_opcionVerClientesActionPerformed

    private void opcionModificarEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModificarEliminarClientesActionPerformed
        modificarEliminarCliente mec= new modificarEliminarCliente();
    mec.setSize(960, 623);
    mec.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(mec, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint();   
      
    }//GEN-LAST:event_opcionModificarEliminarClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    cargaPreventista cp= new cargaPreventista();
    cp.setSize(960, 623);
    cp.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(cp, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint();   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       verPreventista vp= new verPreventista();
    vp.setSize(960, 623);
    vp.setLocation(0,0);
    escritorio.removeAll();
    escritorio.add(vp, BorderLayout.CENTER);
    escritorio.revalidate();
    escritorio.repaint();   
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
          modificarPreventista mp = new modificarPreventista();
         mp.setSize(960, 623);
         mp.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(mp, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();  
          
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         eliminarPreventista ep = new eliminarPreventista();
         ep.setSize(960, 623);
         ep.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(ep, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         cargaGastos cg = new cargaGastos();
         cg.setSize(960, 623);
         cg.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(cg, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint(); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         verGastos vg = new verGastos();
         vg.setSize(960, 623);
         vg.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(vg, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint(); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
          modificarGasto mg = new modificarGasto();
         mg.setSize(960, 623);
         mg.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(mg, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           eliminarGasto eg = new eliminarGasto();
         eg.setSize(960, 623);
         eg.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(eg, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint(); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
          cargaProductos cp = new cargaProductos();
         cp.setSize(960, 623);
         cp.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(cp, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint(); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         verProductos vp = new verProductos();
         vp.setSize(960, 623);
         vp.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(vp, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         modificarProducto mp = new modificarProducto();
         mp.setSize(960, 623);
         mp.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(mp, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         eliminarProducto ep = new eliminarProducto();
         ep.setSize(960, 623);
         ep.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(ep, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
         cargaUsuario cu = new cargaUsuario();
        cu.setSize(960, 623);
         cu.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(cu, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        verUsuarios vu = new verUsuarios();
        vu.setSize(960, 623);
         vu.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(vu, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        modificarUsuario mu = new modificarUsuario();
        mu.setSize(960, 623);
         mu.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(mu, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        eliminarUsuario eu = new eliminarUsuario();
        eu.setSize(960, 623);
         eu.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(eu, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
       rendicion ren= new rendicion ();
        ren.setSize(1147, 708);
         ren.setLocation(0,0);
         escritorio.removeAll();
         escritorio.add(ren, BorderLayout.CENTER);
         escritorio.revalidate();
         escritorio.repaint();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu clientesMenu;
    private javax.swing.JDesktopPane escritorio;
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem opcionCargarCliente;
    private javax.swing.JMenuItem opcionCargarVerZonas;
    private javax.swing.JMenuItem opcionModificarEliminarClientes;
    private javax.swing.JMenuItem opcionModificarEliminarZonas;
    private javax.swing.JMenuItem opcionVerClientes;
    private javax.swing.JMenu zonaMenu;
    // End of variables declaration//GEN-END:variables
}
