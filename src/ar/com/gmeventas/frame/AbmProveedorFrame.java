/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.gmeventas.frame;

import ar.com.gmeventas.entities.Domicilio;
import ar.com.gmeventas.entities.Proveedor;
import ar.com.gmeventas.main.MainFrame;
import ar.com.gmeventas.services.ProveedorService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supervisor
 */
public class AbmProveedorFrame extends javax.swing.JFrame {
    private List<Proveedor> listadoProveedor = new ArrayList();
    /*
    private List<Cliente> listadoCliente = null;
    */
    /**
     * Creates new form AbmProveedorFrame
     */
    public AbmProveedorFrame() {
        initComponents();
        this.llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        volverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        modificarBtn = new javax.swing.JButton();
        nuevoBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        proveedorMenu = new javax.swing.JMenuBar();
        archivoProveedorMenu = new javax.swing.JMenu();
        nuevoMenuBtn = new javax.swing.JMenuItem();
        modificarMenuBtn = new javax.swing.JMenuItem();
        eliminarMenuBtn = new javax.swing.JMenuItem();
        salirMenuBtn = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volverBtn.setText("Vovler");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Razón Social", "Domicilio", "Cuit", "Categoría iva", "Telefono", "Celular", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProveedor);

        modificarBtn.setText("Modificar");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        nuevoBtn.setText("Nuevo");
        nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtnActionPerformed(evt);
            }
        });

        borrarBtn.setText("Borrar");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });

        archivoProveedorMenu.setText("Archivo");

        nuevoMenuBtn.setText("Nuevo");
        nuevoMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoMenuBtnActionPerformed(evt);
            }
        });
        archivoProveedorMenu.add(nuevoMenuBtn);

        modificarMenuBtn.setText("Modificar");
        archivoProveedorMenu.add(modificarMenuBtn);

        eliminarMenuBtn.setText("Eliminar");
        eliminarMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuBtnActionPerformed(evt);
            }
        });
        archivoProveedorMenu.add(eliminarMenuBtn);

        proveedorMenu.add(archivoProveedorMenu);

        salirMenuBtn.setText("Volver");
        proveedorMenu.add(salirMenuBtn);

        setJMenuBar(proveedorMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nuevoBtn)
                        .addGap(79, 79, 79)
                        .addComponent(modificarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrarBtn)
                        .addGap(75, 75, 75)
                        .addComponent(volverBtn)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverBtn)
                    .addComponent(modificarBtn)
                    .addComponent(nuevoBtn)
                    .addComponent(borrarBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        this.dispose();
        MainFrame mainframe = new MainFrame();
        mainframe.setVisible(true);
    }//GEN-LAST:event_volverBtnActionPerformed

    private void nuevoMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoMenuBtnActionPerformed
        this.dispose();
        NuevoProveedorFrame nuevoProveedorFrame = new NuevoProveedorFrame();
        nuevoProveedorFrame.setVisible(true);
    }//GEN-LAST:event_nuevoMenuBtnActionPerformed

    private void eliminarMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuBtnActionPerformed
        borrar();
    }//GEN-LAST:event_eliminarMenuBtnActionPerformed

    private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        NuevoProveedorFrame nuevoProveedorFrame = new NuevoProveedorFrame();
        nuevoProveedorFrame.setVisible(true);
    }//GEN-LAST:event_nuevoBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        Proveedor proveedor = this.getProveedorSeleccionado();
        ModificarProveedorFrame mpf = new ModificarProveedorFrame(proveedor);
        this.dispose();
        mpf.setVisible(true);
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        borrarProveedor();
    }//GEN-LAST:event_borrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AbmProveedorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbmProveedorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbmProveedorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbmProveedorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbmProveedorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivoProveedorMenu;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JMenuItem eliminarMenuBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JMenuItem modificarMenuBtn;
    private javax.swing.JButton nuevoBtn;
    private javax.swing.JMenuItem nuevoMenuBtn;
    private javax.swing.JMenuBar proveedorMenu;
    private javax.swing.JMenu salirMenuBtn;
    private javax.swing.JTable tablaProveedor;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void borrar() {
        Proveedor proveedor = new Proveedor();
        proveedor.setCategoriaIva(null);
        proveedor.setCelular(null);
        proveedor.setCuit(null);
//      proveedor.setDomicilio(null);
        proveedor.setId(null);
        proveedor.setMail(null);
        proveedor.setObservaciones(null);
        proveedor.setRazonSocial(null);
//      proveedor.setRubro(null);
        proveedor.setTelefono(null);
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(null);
        domicilio.setCodigoPostal(null);
        domicilio.setDepartamento(null);
        domicilio.setId(null);
        domicilio.setLocalidad(null);
        domicilio.setNumero(null);
        domicilio.setPiso(null);
        domicilio.setProvincia(null);
    }

    private void llenarTabla() {
        
        try{
            ProveedorService proveedorService = new ProveedorService();
            listadoProveedor = proveedorService.getAllProveedores();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error con la base de datos");
       }
        DefaultTableModel model =new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("RAZON SOCIAL");
        model.addColumn("CUIT");

        if( listadoProveedor!=null && !listadoProveedor.isEmpty() ){
            for(Proveedor proveedor : listadoProveedor){
                Object[] fila = new Object[3];
                fila[0] = proveedor.getCodigo();
                fila[1] = proveedor.getRazonSocial();
                fila[2] = proveedor.getCuit();
                model.addRow(fila);
            }
            
         tablaProveedor.setModel(model);
        }
                
    }

    private Proveedor getProveedorSeleccionado() {
        Proveedor proveedor = null;
        int filaSeleccionada = tablaProveedor.getSelectedRow();
        if(filaSeleccionada != -1 && listadoProveedor != null && !listadoProveedor.isEmpty() ){
            proveedor = listadoProveedor.get(filaSeleccionada);            
        }
        else{
        JOptionPane.showMessageDialog(this, "Proveedor - Seleccione un proveedor de la lista");
        }
        return proveedor;
    }

    private void borrarProveedor() {
        int filaSeleccionada = tablaProveedor.getSelectedRow();
        if (filaSeleccionada != -1){

            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Desea eliminar al Proveedor?",
                    "Borrar - Proveedor",
                    JOptionPane.OK_CANCEL_OPTION);
            if (confirm == JOptionPane.OK_OPTION){
                Proveedor proveedorABorrar = getProveedorSeleccionado();
                try{
                    new ProveedorService().deleteProveedor(proveedorABorrar);
                    listadoProveedor.remove(filaSeleccionada);
                    llenarTabla();
                    //setearTabla();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, 
                            "Ha ocurrido un error eliminando al Proveedor",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }            
            }

        }else{
            JOptionPane.showMessageDialog(this, 
                        "Debe seleccionar un Proveedor para eliminarlo.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
