/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.time.Clock;

/**
 *
 * @author DevOps
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        DPEscritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuSalir = new javax.swing.JMenu();
        menuArchivoClientes = new javax.swing.JMenuItem();
        menuArchivoProductos = new javax.swing.JMenuItem();
        menuArchivoUsuarios = new javax.swing.JMenuItem();
        menuArchivoCambioClave = new javax.swing.JMenuItem();
        menuArchivoCambioUsuario = new javax.swing.JMenuItem();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuEditarNuevaFact = new javax.swing.JMenuItem();
        menuEditarReporteFact = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAyudaAcerca = new javax.swing.JMenuItem();
        menuAyudaFinal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");

        DPEscritorio.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout DPEscritorioLayout = new javax.swing.GroupLayout(DPEscritorio);
        DPEscritorio.setLayout(DPEscritorioLayout);
        DPEscritorioLayout.setHorizontalGroup(
            DPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        DPEscritorioLayout.setVerticalGroup(
            DPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        menuSalir.setText("Archivo");

        menuArchivoClientes.setText("Clientes");
        menuSalir.add(menuArchivoClientes);

        menuArchivoProductos.setText("Productos");
        menuSalir.add(menuArchivoProductos);

        menuArchivoUsuarios.setText("Usuarios");
        menuArchivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoUsuariosActionPerformed(evt);
            }
        });
        menuSalir.add(menuArchivoUsuarios);

        menuArchivoCambioClave.setText("Cambio Clave");
        menuSalir.add(menuArchivoCambioClave);

        menuArchivoCambioUsuario.setText("Cambio Usuario");
        menuSalir.add(menuArchivoCambioUsuario);

        menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuSalir.add(menuArchivoSalir);

        jMenuBar2.add(menuSalir);

        menuEditar.setText("Editar");
        menuEditar.setToolTipText("");

        menuEditarNuevaFact.setText("Nueva Factura");
        menuEditar.add(menuEditarNuevaFact);

        menuEditarReporteFact.setText("Reporte Factura");
        menuEditar.add(menuEditarReporteFact);

        jMenuBar2.add(menuEditar);

        menuAyuda.setText("Ayuda");

        menuAyudaAcerca.setText("Acerca de");
        menuAyuda.add(menuAyudaAcerca);

        menuAyudaFinal.setText("Ayuda");
        menuAyuda.add(menuAyudaFinal);

        jMenuBar2.add(menuAyuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DPEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DPEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuArchivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoUsuariosActionPerformed
        frmUsuario misUsuarios = new frmUsuario();
        DPEscritorio.add(misUsuarios);
        misUsuarios.show();
    }//GEN-LAST:event_menuArchivoUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DPEscritorio;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuArchivoCambioClave;
    private javax.swing.JMenuItem menuArchivoCambioUsuario;
    private javax.swing.JMenuItem menuArchivoClientes;
    private javax.swing.JMenuItem menuArchivoProductos;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuArchivoUsuarios;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuAyudaAcerca;
    private javax.swing.JMenuItem menuAyudaFinal;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuEditarNuevaFact;
    private javax.swing.JMenuItem menuEditarReporteFact;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
