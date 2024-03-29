/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.frame;

import ar.com.gmeventas.entities.IvaVentas;
import ar.com.gmeventas.entities.RenglonFactura;
import ar.com.gmeventas.main.MainFrame;
import ar.com.gmeventas.services.IvaVentasService;
import ar.com.gmeventas.services.RenglonFacturaService;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.rint;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Mario
 */
public class VerIvaVentasFrame extends javax.swing.JFrame {

    private Date fecha;
    private Date desde;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private DecimalFormat df = new DecimalFormat("#0.00");
    private List<IvaVentas> facturas = null;

    /**
     * Creates new form VerIvaVentasFrame
     */
    public VerIvaVentasFrame() {
        initComponents();
        limpiarCampos();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desdeFechaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hastaFechaTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIva = new javax.swing.JTable();
        imprimirBtn = new javax.swing.JButton();
        exportarExcelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LIBRO IVA VENTAS");

        desdeFechaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        desdeFechaTxt.setText("DESDE");

        jLabel1.setText("Desde:");

        jLabel2.setText("Hasta:");

        hastaFechaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hastaFechaTxt.setText("HASTA");

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        tablaIva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Núm.Comprob.", "CUIT", "Código", "Cliente", "Gravado Vs.", "Gravado Cig.", "Impuesto", "Iva", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaIva);

        imprimirBtn.setText("Imprimir");
        imprimirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBtnActionPerformed(evt);
            }
        });

        exportarExcelBtn.setText("Exportar a Excel");
        exportarExcelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarExcelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desdeFechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hastaFechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(imprimirBtn)
                        .addGap(18, 18, 18)
                        .addComponent(exportarExcelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(desdeFechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(hastaFechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn)
                    .addComponent(volverBtn)
                    .addComponent(imprimirBtn)
                    .addComponent(exportarExcelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        llenarTabla();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void exportarExcelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarExcelBtnActionPerformed
        String rutaArchivo = "c:/exceliva/iva.xls";
        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        WritableWorkbook libro = null;
        try {
            libro = Workbook.createWorkbook(archivo);
        } catch (IOException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        WritableSheet hoja1 = libro.createSheet("libro Iva", 0);
        try {
            hoja1.addCell(new jxl.write.Label(0, 0, "Golosol Libro Iva Ventas"));
            hoja1.addCell(new jxl.write.Label(0, 1, "Fecha"));
            hoja1.addCell(new jxl.write.Label(1, 1, "Tipo Cbte."));
            hoja1.addCell(new jxl.write.Label(2, 1, "Núm.Cbte"));
            hoja1.addCell(new jxl.write.Label(3, 1, "C.U.I.T."));
            hoja1.addCell(new jxl.write.Label(4, 1, "Codigo"));
            hoja1.addCell(new jxl.write.Label(5, 1, "Cliente"));
            hoja1.addCell(new jxl.write.Label(6, 1, "Cat.Iva"));
            hoja1.addCell(new jxl.write.Label(7, 1, "Gravado Vs."));
            hoja1.addCell(new jxl.write.Label(8, 1, "Gravado Cig."));
            hoja1.addCell(new jxl.write.Label(9, 1, "Impuesto"));
            hoja1.addCell(new jxl.write.Label(10, 1, "Iva"));
            hoja1.addCell(new jxl.write.Label(11, 1, "Total"));
            int y = 2;
            for (IvaVentas fc : facturas) {
                hoja1.addCell(new jxl.write.Label(0, y, sdf.format(fc.getFecha())));
                String cpbte = fc.getLetra();
                String sucu = "0000";
                String nrof = "00000000";
                sucu = sucu + String.valueOf(fc.getNumeroSucursal());
                nrof = nrof + String.valueOf(fc.getNumeroFactura());
                int largoSucu = sucu.length();
                int largoNrof = nrof.length();
                sucu = sucu.substring(largoSucu - 4, largoSucu);
                nrof = nrof.substring(largoNrof - 8, largoNrof);
                cpbte = cpbte + " " + sucu + "-" + nrof;
                String tipo = "Fc";
                if (fc.getTotal() < 0.00) {
                    tipo = "Nc";
                }
                hoja1.addCell(new jxl.write.Label(1, y, tipo));
                hoja1.addCell(new jxl.write.Label(2, y, cpbte));
                hoja1.addCell(new jxl.write.Label(3, y, fc.getCliente().getCuit()));
                hoja1.addCell(new jxl.write.Label(4, y, fc.getCliente().getCodigo()));
                hoja1.addCell(new jxl.write.Label(5, y, fc.getCliente().getRazonSocial()));
                int ci = fc.getCliente().getCategoriaDeIva();
                if (ci == 1) {
                    hoja1.addCell(new jxl.write.Label(6, y, "RI"));
                }
                if (ci == 2) {
                    hoja1.addCell(new jxl.write.Label(6, y, "MO"));
                }
                if (ci == 4) {
                    hoja1.addCell(new jxl.write.Label(6, y, "CF"));
                }
                Double grvCig = 0.00;
                List<RenglonFactura> rf = null;
                try {
                    rf = new RenglonFacturaService().getAllRenglonFacturaFromIvaVentas(fc);
                } catch (Exception ex) {
                    Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (rf != null && !rf.isEmpty()) {
                    for (RenglonFactura renglon : rf) {
                        if (renglon.getImpuesto() != 0.00) {
                            grvCig += renglon.getGravado();
                        }
                    }
                }
                Double redondeo = rint(fc.getGravado() * 100) / 100;
                Double totalNC = fc.getTotal();
                redondeo -= grvCig;
                if (totalNC < 0) {
                    if (redondeo > 0) {
                        redondeo = redondeo * - 1;
                    }
                } else {
                    if (redondeo < 0) {
                        redondeo = redondeo * - 1;
                    }
                }
                hoja1.addCell(new jxl.write.Number(7, y, redondeo));
                redondeo = rint(grvCig * 100) / 100;
                hoja1.addCell(new jxl.write.Number(8, y, redondeo));
                redondeo = rint(fc.getImpuesto() * 100) / 100;
                hoja1.addCell(new jxl.write.Number(9, y, redondeo));
                redondeo = rint(fc.getIva() * 100) / 100;
                hoja1.addCell(new jxl.write.Number(10, y, redondeo));
                redondeo = rint(fc.getTotal() * 100) / 100;
                hoja1.addCell(new jxl.write.Number(11, y, redondeo));
                y += 1;
            }
        } catch (WriteException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error configurando Excel");
        }
        try {
            libro.write();
            libro.close();
        } catch (IOException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: 263");
        } catch (WriteException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: 264");
        }
        JOptionPane.showMessageDialog(this, "Libro Iva creado correctamente");
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exportarExcelBtnActionPerformed

    private void imprimirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBtnActionPerformed
        try {
            tablaIva.print();
        } catch (PrinterException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imprimirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VerIvaVentasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerIvaVentasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerIvaVentasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerIvaVentasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerIvaVentasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField desdeFechaTxt;
    private javax.swing.JButton exportarExcelBtn;
    private javax.swing.JTextField hastaFechaTxt;
    private javax.swing.JButton imprimirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaIva;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        fecha = new Date();
        desde = new Date();
        desdeFechaTxt.setText(sdf.format(desde));
        hastaFechaTxt.setText(sdf.format(fecha));
        borrarTabla();
    }

    private void borrarTabla() {
        int rows = tablaIva.getRowCount();
        if (rows > 0) {
            DefaultTableModel tbl = (DefaultTableModel) tablaIva.getModel();
            for (int i = 0; i < rows; i++) {
                tbl.removeRow(0);
            }
            tablaIva.setModel(tbl);
        }
    }

    private void llenarTabla() {
        borrarTabla();
        facturas = null;
        try {
            desde = sdf.parse(desdeFechaTxt.getText());
            fecha = sdf.parse(hastaFechaTxt.getText());
        } catch (ParseException ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en las fechas");
            desdeFechaTxt.requestFocus();
            return;
        }
        try {
            facturas = new IvaVentasService().getFacturasEntreFechas(desde, fecha);
        } catch (Exception ex) {
            Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(facturas);
        //System.exit(0);
        if (facturas != null && !facturas.isEmpty()) {
            Double totalGravado = 0.00;
            Double totalIva = 0.00;
            Double totalImpuesto = 0.00;
            Double totalTotal = 0.00;
            Double totalGravCig = 0.00;
            DefaultTableModel tbl = (DefaultTableModel) tablaIva.getModel();
            for (IvaVentas fc : facturas) {
                Object ob[] = new Object[10];
                ob[0] = sdf.format(fc.getFecha());
                int largo = 0;
                largo = fc.getNumeroSucursal().toString().length();
                String sucursal = "0000" + fc.getNumeroSucursal().toString();
                sucursal = sucursal.substring(largo, 4 + largo);
                largo = fc.getNumeroFactura().toString().length();
                String numFac = "00000000" + fc.getNumeroFactura().toString();
                numFac = numFac.substring(largo, 8 + largo);
                ob[1] = fc.getLetra() + " " + sucursal + "-" + numFac;
                ob[2] = fc.getCliente().getCuit();
                ob[3] = fc.getCliente().getCodigo();
                ob[4] = fc.getCliente().getRazonSocial();
                Double totalGravadoCigarrillos = 0.00;
                List<RenglonFactura> rf = null;
                try {
                    rf = new RenglonFacturaService().getAllRenglonFacturaFromIvaVentas(fc);
                } catch (Exception ex) {
                    Logger.getLogger(VerIvaVentasFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (rf != null && !rf.isEmpty()) {
                    for (RenglonFactura renglon : rf) {
                        if (renglon.getImpuesto() != 0.00) {
                            totalGravadoCigarrillos += renglon.getGravado();
                        }
                    }
                }
                ob[6] = df.format(totalGravadoCigarrillos);
                Double gravadoVarios = fc.getGravado() - totalGravadoCigarrillos;
                if (gravadoVarios >= 0.00) {
                    ob[5] = df.format(gravadoVarios);
                    totalGravado += gravadoVarios;
                } else {
                    if (fc.getTotal() > 0.00) {
                        ob[5] = df.format(gravadoVarios * -1);
                        totalGravado += gravadoVarios * -1;
                    } else {
                        ob[5] = df.format(gravadoVarios);
                        totalGravado += gravadoVarios;
                    }
                }
                ob[7] = df.format(fc.getImpuesto());
                ob[8] = df.format(fc.getIva());
                ob[9] = df.format(fc.getTotal());

                totalIva += fc.getIva();
                totalImpuesto += fc.getImpuesto();
                totalTotal += fc.getTotal();
                totalGravCig += totalGravadoCigarrillos;
                tbl.addRow(ob);
            }
            Object ob[] = new Object[10];
            ob[0] = "";
            tbl.addRow(ob);
            ob[1] = "TOTALES";
            ob[5] = df.format(totalGravado);
            ob[6] = df.format(totalGravCig);
            ob[7] = df.format(totalImpuesto);
            ob[8] = df.format(totalIva);
            ob[9] = df.format(totalTotal);
            tbl.addRow(ob);
            tablaIva.setModel(tbl);
        }
    }
}
