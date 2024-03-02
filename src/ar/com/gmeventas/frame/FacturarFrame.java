/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.gmeventas.frame;

import ar.com.gmeventas.main.MainFrame;

/**
 *
 * @author Mario
 */
public class FacturarFrame extends javax.swing.JFrame {

    /**
     * Creates new form FacturarFrame
     */
    public FacturarFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        facturarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        facturacionMostradorBtn = new javax.swing.JRadioButton();
        facturacionPedidosBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        facturarBtn.setText("Facturar");
        facturarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarBtnActionPerformed(evt);
            }
        });

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        facturacionMostradorBtn.setSelected(true);
        facturacionMostradorBtn.setText("Facturacion Mostrador");
        facturacionMostradorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionMostradorBtnActionPerformed(evt);
            }
        });

        facturacionPedidosBtn.setText("Facturacion Pedidos");
        facturacionPedidosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionPedidosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(facturacionMostradorBtn)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(facturarBtn)
                        .addGap(32, 32, 32)
                        .addComponent(volverBtn)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(facturacionPedidosBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(facturacionMostradorBtn)
                .addGap(18, 18, 18)
                .addComponent(facturacionPedidosBtn)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facturarBtn)
                    .addComponent(volverBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarBtnActionPerformed
        if (facturacionMostradorBtn.isSelected()){
            FacturaWebFrame ff = new FacturaWebFrame();
            ff.setVisible(true);
            this.dispose();            
        }else{
            if (facturacionPedidosBtn.isSelected()){
//                PedidosPendientes pp = new PedidosPendientes();
//                pp.setVisible(true);
//                this.dispose();
            }
        }

    }//GEN-LAST:event_facturarBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void facturacionPedidosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionPedidosBtnActionPerformed
        if (facturacionPedidosBtn.isSelected()){
            facturacionMostradorBtn.setSelected(false);
        }
    }//GEN-LAST:event_facturacionPedidosBtnActionPerformed

    private void facturacionMostradorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionMostradorBtnActionPerformed
        if (facturacionMostradorBtn.isSelected()){
            facturacionPedidosBtn.setSelected(false);
        }
    }//GEN-LAST:event_facturacionMostradorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FacturarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton facturacionMostradorBtn;
    private javax.swing.JRadioButton facturacionPedidosBtn;
    private javax.swing.JButton facturarBtn;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}