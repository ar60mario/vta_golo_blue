/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.frame;

import ar.com.gmeventas.entities.Cliente;
import ar.com.gmeventas.entities.IvaVentas;
import ar.com.gmeventas.main.MainFrame;
import ar.com.gmeventas.services.ClienteService;
import ar.com.gmeventas.services.IvaVentasService;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mario
 */
public class VerVentasXClienteFrame extends javax.swing.JFrame {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private DecimalFormat df1 = new DecimalFormat("0000");
    private DecimalFormat df2 = new DecimalFormat("00000000");
    private DecimalFormat df = new DecimalFormat("#0.00");
    private List<IvaVentas> facturas;
    /**
     * Creates new form VerVentasXClienteFrame
     */
    public VerVentasXClienteFrame() {
        initComponents();
        limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        buscarXCodigoBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        buscarXNombreBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cuitTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        imprimirBtn = new javax.swing.JButton();
        comboClientes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deTxt = new javax.swing.JTextField();
        aTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rsTxt = new javax.swing.JTextField();
        ncBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BUSCAR FACTURAS POR CLIENTE");

        jLabel1.setText("Código Cliente:");

        codigoTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codigoTxt.setText("COD");
        codigoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoTxtKeyPressed(evt);
            }
        });

        buscarXCodigoBtn.setText("Buscar");
        buscarXCodigoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarXCodigoBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar x:");

        nombreTxt.setText("NOMBRE");
        nombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreTxtKeyPressed(evt);
            }
        });

        buscarXNombreBtn.setText("Buscar");
        buscarXNombreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarXNombreBtnActionPerformed(evt);
            }
        });

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("C.U.I.T.:");

        cuitTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cuitTxt.setText("CUIT");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Tipo", "Número", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        imprimirBtn.setText("Imprimir");
        imprimirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBtnActionPerformed(evt);
            }
        });

        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Desde:");

        jLabel5.setText("Hasta:");

        deTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deTxt.setText("DESDE");
        deTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deTxtKeyPressed(evt);
            }
        });

        aTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aTxt.setText("HASTA");

        jLabel6.setText("Razón Social:");

        rsTxt.setText("RAZON SOCIAL");

        ncBtn.setText("NC");
        ncBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarXCodigoBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarXNombreBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imprimirBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volverBtn)
                            .addComponent(ncBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rsTxt)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cuitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarXCodigoBtn)
                    .addComponent(jLabel2)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarXNombreBtn)
                    .addComponent(volverBtn)
                    .addComponent(imprimirBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(deTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(aTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ncBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cuitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        volver();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void imprimirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBtnActionPerformed
        int row = tabla.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una para Imprimir");
            return;
        }
        imprimir();
    }//GEN-LAST:event_imprimirBtnActionPerformed

    private void codigoTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTxtKeyPressed
        if(evt.getKeyCode()==10){
            buscarCliPorCod();
        }
    }//GEN-LAST:event_codigoTxtKeyPressed

    private void buscarXCodigoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarXCodigoBtnActionPerformed
        buscarCliPorCod();
    }//GEN-LAST:event_buscarXCodigoBtnActionPerformed

    private void nombreTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyPressed
        if(evt.getKeyCode()==10){
            buscarCliPorFiltro();
        }
    }//GEN-LAST:event_nombreTxtKeyPressed

    private void buscarXNombreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarXNombreBtnActionPerformed
        buscarCliPorFiltro();
    }//GEN-LAST:event_buscarXNombreBtnActionPerformed

    private void deTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deTxtKeyPressed
        if(evt.getKeyCode()==10){
            aTxt.requestFocus();
        }
    }//GEN-LAST:event_deTxtKeyPressed

    private void ncBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncBtnActionPerformed
        int row = tabla.getSelectedRow();
        if(row <0){
            JOptionPane.showMessageDialog(this, "ELIJA UNA FC PARA GENERAR NOTA DE CREDITO");
            return;
        }
        IvaVentas fc = facturas.get(row);
        NotaCreditoWebDeFacturaFrame ncdff = new NotaCreditoWebDeFacturaFrame(fc);
        ncdff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ncBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerVentasXClienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aTxt;
    private javax.swing.JButton buscarXCodigoBtn;
    private javax.swing.JButton buscarXNombreBtn;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JTextField cuitTxt;
    private javax.swing.JTextField deTxt;
    private javax.swing.JButton imprimirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ncBtn;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField rsTxt;
    private javax.swing.JTable tabla;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void volver() {
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }

    private void limpiarCampos() {
        codigoTxt.setText("");
        nombreTxt.setText("");
        cuitTxt.setText("");
        deTxt.setText("");
        aTxt.setText("");
        rsTxt.setText("");
        limpiarCombo();
    }

    private void limpiarCombo() {
        comboClientes.removeAllItems();
        comboClientes.addItem("");
    }

    private void imprimir() {
        
    }

    private void buscarCliPorCod() {
        if(deTxt.getText().isEmpty()){
            deTxt.requestFocus();
            return;
        }
        if(aTxt.getText().isEmpty()){
            aTxt.requestFocus();
            return;
        }
        if(!codigoTxt.getText().isEmpty()){
            String cod = codigoTxt.getText();
            Cliente c = null;
            try {
                c = new ClienteService().getClienteByCodigo(cod);
            } catch (Exception ex) {
                Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(c!=null){
                nombreTxt.setText(c.getRazonSocial());
                cuitTxt.setText(c.getCuit());
                llenarTabla(c);
            }
        }
    }

    private void buscarCliPorFiltro() {
        
    }

    private void llenarTabla(Cliente c) {
        limpiarTabla();
        Date fechaDe = new Date();
        Date fechaA = new Date();
        try {
            fechaDe = sdf.parse(deTxt.getText());
            fechaA = sdf.parse(aTxt.getText());
        } catch (ParseException ex) {
            Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        facturas = null;
        try {
            facturas = new IvaVentasService().getFacturasByCliEntreFechas(c, fechaDe, fechaA);
        } catch (Exception ex) {
            Logger.getLogger(VerVentasXClienteFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(facturas != null && !facturas.isEmpty()){
            DefaultTableModel tbl = (DefaultTableModel) tabla.getModel();
            for(IvaVentas f:facturas){
                Object ob[] = new Object[4];
                ob[0]=sdf.format(f.getFecha());
                ob[1]="F";
                ob[2]=f.getLetra() + " " + df1.format(f.getNumeroSucursal()) + "-" + df2.format(f.getNumeroFactura());
                ob[3]=df.format(f.getTotal());
                tbl.addRow(ob);
            }
            tabla.setModel(tbl);
        }
    }

    private void limpiarTabla() {
        DefaultTableModel tbl = (DefaultTableModel) tabla.getModel();
        int rows = tbl.getRowCount();
        if(rows > 0){
            for(int i=0;i<rows;i++){
                tbl.removeRow(0);
            }
            tabla.setModel(tbl);
        }
        facturas = null;
    }
    
}
