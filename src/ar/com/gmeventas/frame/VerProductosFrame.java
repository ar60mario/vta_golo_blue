/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.frame;

import ar.com.gmeventas.entities.Producto;
import ar.com.gmeventas.main.MainFrame;
import ar.com.gmeventas.services.ProductoService;
import java.awt.print.PrinterException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mario
 */
public class VerProductosFrame extends javax.swing.JFrame {

    public DefaultTableModel tabla = null;

    /**
     * Creates new form VerProductos
     */
    public VerProductosFrame() {
        initComponents();
        limpiarCampos();
        tabla = (DefaultTableModel) tablaProductos.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        codigoBtn = new javax.swing.JRadioButton();
        alfabeticoBtn = new javax.swing.JRadioButton();
        rubroSubRubroBtn = new javax.swing.JRadioButton();
        inactivosBtn = new javax.swing.JRadioButton();
        sinCodBarrasBtn = new javax.swing.JRadioButton();
        enCero = new javax.swing.JRadioButton();
        filtroTxt = new javax.swing.JTextField();
        obtenerBtn = new javax.swing.JButton();
        imprimirBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1021, 685));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Barras", "Nombre", "Precio", "Impuesto", "Sugerido", "Rubro", "Sub Rubro"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        codigoBtn.setText("Por Código");
        codigoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigoBtnMousePressed(evt);
            }
        });

        alfabeticoBtn.setText("Alfabético");
        alfabeticoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alfabeticoBtnMousePressed(evt);
            }
        });

        rubroSubRubroBtn.setText("Rubro y Sub Rubro");
        rubroSubRubroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rubroSubRubroBtnMousePressed(evt);
            }
        });

        inactivosBtn.setText("Inactivos");
        inactivosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inactivosBtnMousePressed(evt);
            }
        });

        sinCodBarrasBtn.setText("Sin C-Barras");
        sinCodBarrasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sinCodBarrasBtnMousePressed(evt);
            }
        });

        enCero.setText("Precio Cero");
        enCero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enCeroMousePressed(evt);
            }
        });

        filtroTxt.setText("FILTRO");

        obtenerBtn.setText("Obtener");
        obtenerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerBtnActionPerformed(evt);
            }
        });

        imprimirBtn.setText("Imprimir");
        imprimirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBtnActionPerformed(evt);
            }
        });

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alfabeticoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rubroSubRubroBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inactivosBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sinCodBarrasBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enCero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(obtenerBtn)
                .addGap(18, 18, 18)
                .addComponent(imprimirBtn)
                .addGap(18, 18, 18)
                .addComponent(salirBtn)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoBtn)
                    .addComponent(alfabeticoBtn)
                    .addComponent(rubroSubRubroBtn)
                    .addComponent(inactivosBtn)
                    .addComponent(sinCodBarrasBtn)
                    .addComponent(enCero)
                    .addComponent(filtroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obtenerBtn)
                    .addComponent(imprimirBtn)
                    .addComponent(salirBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alfabeticoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alfabeticoBtnMousePressed
        if (!alfabeticoBtn.isSelected()) {
            codigoBtn.setSelected(false);
            alfabeticoBtn.setSelected(true);
            rubroSubRubroBtn.setSelected(false);
            inactivosBtn.setSelected(false);
            enCero.setSelected(false);
            codigoBtn.setEnabled(true);
            alfabeticoBtn.setEnabled(false);
            rubroSubRubroBtn.setEnabled(true);
            inactivosBtn.setEnabled(true);
            enCero.setEnabled(true);
        }
    }//GEN-LAST:event_alfabeticoBtnMousePressed

    private void codigoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoBtnMousePressed
        if (!codigoBtn.isSelected()) {
            codigoBtn.setSelected(true);
            alfabeticoBtn.setSelected(false);
            rubroSubRubroBtn.setSelected(false);
            inactivosBtn.setSelected(false);
            enCero.setSelected(false);
            codigoBtn.setEnabled(false);
            alfabeticoBtn.setEnabled(true);
            rubroSubRubroBtn.setEnabled(true);
            inactivosBtn.setEnabled(true);
            enCero.setEnabled(true);
        }
    }//GEN-LAST:event_codigoBtnMousePressed

    private void obtenerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerBtnActionPerformed
        if (filtroTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Coloque --> * en FILTRO para ver todos");
        } else {
            obtenerProductos();
        }
    }//GEN-LAST:event_obtenerBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void imprimirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBtnActionPerformed
        imprimir();
    }//GEN-LAST:event_imprimirBtnActionPerformed

    private void rubroSubRubroBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rubroSubRubroBtnMousePressed
        if (!rubroSubRubroBtn.isSelected()) {
            codigoBtn.setSelected(false);
            alfabeticoBtn.setSelected(false);
            rubroSubRubroBtn.setSelected(true);
            inactivosBtn.setSelected(false);
            enCero.setSelected(false);
            codigoBtn.setEnabled(true);
            alfabeticoBtn.setEnabled(true);
            rubroSubRubroBtn.setEnabled(false);
            inactivosBtn.setEnabled(true);
            enCero.setEnabled(true);
        }
    }//GEN-LAST:event_rubroSubRubroBtnMousePressed

    private void inactivosBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inactivosBtnMousePressed
        if (!inactivosBtn.isSelected()) {
            codigoBtn.setSelected(false);
            alfabeticoBtn.setSelected(false);
            rubroSubRubroBtn.setSelected(false);
            inactivosBtn.setSelected(true);
            sinCodBarrasBtn.setSelected(false);
            enCero.setSelected(false);
            codigoBtn.setEnabled(true);
            alfabeticoBtn.setEnabled(true);
            rubroSubRubroBtn.setEnabled(true);
            inactivosBtn.setEnabled(false);
            sinCodBarrasBtn.setEnabled(true);
            enCero.setEnabled(true);
        }
    }//GEN-LAST:event_inactivosBtnMousePressed

    private void sinCodBarrasBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinCodBarrasBtnMousePressed
        if (!sinCodBarrasBtn.isSelected()) {
            codigoBtn.setSelected(false);
            alfabeticoBtn.setSelected(false);
            rubroSubRubroBtn.setSelected(false);
            inactivosBtn.setSelected(false);
            sinCodBarrasBtn.setSelected(true);
            enCero.setSelected(false);
            codigoBtn.setEnabled(true);
            alfabeticoBtn.setEnabled(true);
            rubroSubRubroBtn.setEnabled(true);
            inactivosBtn.setEnabled(true);
            sinCodBarrasBtn.setEnabled(false);
            enCero.setEnabled(true);
        }
    }//GEN-LAST:event_sinCodBarrasBtnMousePressed

    private void enCeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enCeroMousePressed
        if (!sinCodBarrasBtn.isSelected()) {
            codigoBtn.setSelected(false);
            alfabeticoBtn.setSelected(false);
            rubroSubRubroBtn.setSelected(false);
            inactivosBtn.setSelected(false);
            sinCodBarrasBtn.setSelected(false);
            enCero.setSelected(true);
            codigoBtn.setEnabled(true);
            alfabeticoBtn.setEnabled(true);
            rubroSubRubroBtn.setEnabled(true);
            inactivosBtn.setEnabled(true);
            sinCodBarrasBtn.setEnabled(true);
            enCero.setEnabled(false);
        }
    }//GEN-LAST:event_enCeroMousePressed

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
            java.util.logging.Logger.getLogger(VerProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerProductosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alfabeticoBtn;
    private javax.swing.JRadioButton codigoBtn;
    private javax.swing.JRadioButton enCero;
    private javax.swing.JTextField filtroTxt;
    private javax.swing.JButton imprimirBtn;
    private javax.swing.JRadioButton inactivosBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton obtenerBtn;
    private javax.swing.JRadioButton rubroSubRubroBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JRadioButton sinCodBarrasBtn;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        codigoBtn.setSelected(false);
        alfabeticoBtn.setSelected(true);
        rubroSubRubroBtn.setSelected(false);
        inactivosBtn.setSelected(false);
        sinCodBarrasBtn.setSelected(false);
        codigoBtn.setEnabled(true);
        alfabeticoBtn.setEnabled(false);
        rubroSubRubroBtn.setEnabled(true);
        inactivosBtn.setEnabled(true);
        sinCodBarrasBtn.setEnabled(true);
        filtroTxt.setText("*");
    }

    private void obtenerProductos() {
        String filtro = filtroTxt.getText();
        if (codigoBtn.isSelected()) {
            try {
                List<Producto> productos = new ProductoService().getAllProductosOrdenadoByCodigo(filtro);
                volcarATabla(productos);
            } catch (Exception ex) {
                Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (alfabeticoBtn.isSelected()) {
                try {
                    List<Producto> productos = new ProductoService().getAllProductosOrdenadoByNombre(filtro);
                    volcarATabla(productos);
                } catch (Exception ex) {
                    Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (rubroSubRubroBtn.isSelected()) {
                    try {
                        List<Producto> productos = new ProductoService().getAllProductosOrdenadoByRubro(filtro);
                        volcarATabla(productos);
                    } catch (Exception ex) {
                        Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (sinCodBarrasBtn.isSelected()) {
                        try {
                            List<Producto> productos = new ProductoService().getAllProductosSinCodigoBarras(filtro);
                            volcarATabla(productos);
                        } catch (Exception ex) {
                            Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        if (enCero.isSelected()) {
                            try {
                                List<Producto> productos = new ProductoService().getAllProductosEnCero(filtro);
                                volcarATabla(productos);
                            } catch (Exception ex) {
                                Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            if (inactivosBtn.isSelected()) {
                                filtroTxt.setText("*");
                                filtroTxt.setEnabled(false);
                                try {
                                    List<Producto> productos = new ProductoService().getAllProductosOrdenadoByNombreInactivo();
                                    volcarATablaInactivos(productos);
                                } catch (Exception ex) {
                                    Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                }
            }
        }
        obtenerBtn.setEnabled(false);
    }

    private void volcarATabla(List<Producto> productos) {
        // DefaultTableModel tabla = new DefaultTableModel();
        Object[] o = new Object[8];
        for (Producto prod : productos) {
            if (!prod.getInactivo()) {
                o[0] = prod.getCodigo();
                o[1] = prod.getCodigoBarras();
                o[2] = prod.getDetalle();
                o[3] = prod.getPrecio();
                o[4] = prod.getImpuesto();
                o[5] = prod.getSugerido();
                o[6] = prod.getRubro().getNombre();
                o[7] = prod.getSubRubro().getDetalle();
                tabla.addRow(o);
            }
        }
        tablaProductos.setModel(tabla);
    }

    private void imprimir() {
        try {
            tablaProductos.print();
        } catch (PrinterException ex) {
            Logger.getLogger(VerProductosFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void volcarATablaInactivos(List<Producto> productos) {
        Object[] o = new Object[8];
        for (Producto prod : productos) {
            if (prod.getInactivo()) {
                o[0] = prod.getCodigo();
                o[1] = prod.getCodigoBarras();
                o[2] = prod.getDetalle();
                o[3] = prod.getPrecio();
                o[4] = prod.getImpuesto();
                o[5] = prod.getSugerido();
                o[6] = prod.getRubro().getNombre();
                o[7] = prod.getSubRubro().getDetalle();
                tabla.addRow(o);
            }
        }
        tablaProductos.setModel(tabla);
    }
}
