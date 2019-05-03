/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlAvion;
import Modelo.ClsAvion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class FrmAvion extends javax.swing.JFrame {

    ArrayList<ClsAvion> listaAvion = new ArrayList <ClsAvion>();
    CtlAvion controladorAvion;
    
    public FrmAvion() {
        initComponents();       
        controladorAvion = new CtlAvion();
        try {
            listaAvion = controladorAvion.cargarArchivo(listaAvion);
            listar();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lblSerialAvion = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        lblCodigoPiloto = new javax.swing.JLabel();
        lblNombrePiloto = new javax.swing.JLabel();
        lblCodigoAzafata = new javax.swing.JLabel();
        lblNombreAzafata = new javax.swing.JLabel();
        txtSerialAvion = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtCodigoPiloto = new javax.swing.JTextField();
        txtNombrePiloto = new javax.swing.JTextField();
        txtCodigoAzafata = new javax.swing.JTextField();
        txtNombreAzafata = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnElminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAvion = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSerialAvion.setText("Serial Avion:");

        lblCapacidad.setText("Capacidad:");

        lblCodigoPiloto.setText("Codigo Piloto:");

        lblNombrePiloto.setText("Nombre Piloto:");

        lblCodigoAzafata.setText("Codigo Azafata:");

        lblNombreAzafata.setText("Nombre Azafata:");

        txtSerialAvion.setEnabled(false);
        txtSerialAvion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialAvionKeyTyped(evt);
            }
        });

        txtCapacidad.setEnabled(false);
        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        txtCodigoPiloto.setEnabled(false);
        txtCodigoPiloto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPilotoKeyTyped(evt);
            }
        });

        txtNombrePiloto.setEnabled(false);
        txtNombrePiloto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePilotoKeyTyped(evt);
            }
        });

        txtCodigoAzafata.setEnabled(false);
        txtCodigoAzafata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoAzafataKeyTyped(evt);
            }
        });

        txtNombreAzafata.setEnabled(false);
        txtNombreAzafata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAzafataKeyTyped(evt);
            }
        });

        btnGuardar.setText("Registrar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnElminar.setText("Eliminar");
        btnElminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElminarActionPerformed(evt);
            }
        });

        jTableAvion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Serial Avion", "Capacidad", "Codigo Piloto", "Nombre Piloto", "Codigo Azafata", "Nombre Azafata"
            }
        ));
        jScrollPane1.setViewportView(jTableAvion);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreAzafata)
                    .addComponent(lblCodigoAzafata)
                    .addComponent(lblNombrePiloto)
                    .addComponent(lblCodigoPiloto)
                    .addComponent(lblCapacidad)
                    .addComponent(lblSerialAvion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSerialAvion)
                    .addComponent(txtNombreAzafata, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(txtCodigoAzafata)
                    .addComponent(txtNombrePiloto)
                    .addComponent(txtCodigoPiloto)
                    .addComponent(txtCapacidad))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnElminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSerialAvion)
                                    .addComponent(txtSerialAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCapacidad)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoPiloto)
                            .addComponent(txtCodigoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnBuscar)
                            .addComponent(btnModificar)
                            .addComponent(btnElminar)
                            .addComponent(btnNuevo))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePiloto)
                    .addComponent(txtNombrePiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAzafata)
                    .addComponent(txtCodigoAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreAzafata)
                    .addComponent(txtNombreAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       
        txtSerialAvion.setEnabled(true);
        txtCapacidad.setEnabled(true);
        txtCodigoPiloto.setEnabled(true);
        txtNombrePiloto.setEnabled(true);
        txtCodigoAzafata.setEnabled(true);
        txtNombreAzafata.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
        String serial = txtSerialAvion.getText();
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        String codigoPiloto = txtCodigoPiloto.getText();
        String nombrePiloto = txtNombrePiloto.getText();
        String codigoAzafata = txtCodigoAzafata.getText();
        String nombreAzafata = txtNombreAzafata.getText();
        listaAvion = controladorAvion.registrarAvion(listaAvion, serial, codigoPiloto, nombrePiloto, codigoAzafata, nombreAzafata, capacidad);
        String res = controladorAvion.guardarArchivo(listaAvion);
        listar();
        limpiar();
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
        String serial = JOptionPane.showInputDialog("Ingrese el serial del avion que desea buscar");
        txtSerialAvion.setEnabled(false);
        ClsAvion avion = null;
        avion = controladorAvion.buscarAvion(listaAvion, serial);
        if(avion == null){
         limpiar();   
        }else{
           txtSerialAvion.setText(avion.getSerial());
           txtCapacidad.setText(avion.getCapacidad()+"");
           txtCodigoPiloto.setText(avion.getCodigoPiloto());
           txtNombrePiloto.setText(avion.getNombrePiloto());
           txtCodigoAzafata.setText(avion.getCodigoAzafata());
           txtNombreAzafata.setText(avion.getNombreAzafata());
        }
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      
         String serial = txtSerialAvion.getText();
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        String codigoPiloto = txtCodigoPiloto.getText();
        String nombrePiloto = txtNombrePiloto.getText();
        String codigoAzafata = txtCodigoAzafata.getText();
        String nombreAzafata = txtNombreAzafata.getText(); 
        listaAvion = controladorAvion.modificarAvion(listaAvion, serial, codigoPiloto, nombrePiloto, codigoAzafata, nombreAzafata, capacidad);
        String res = controladorAvion.guardarArchivo(listaAvion);
        listar();
        limpiar();
 
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
        String serial = JOptionPane.showInputDialog("ingrese el serial del avion que desea eliminar");
        listaAvion = controladorAvion.EliminarAvion(listaAvion, serial);
        String res = controladorAvion.guardarArchivo(listaAvion);
        listar();     
    }//GEN-LAST:event_btnElminarActionPerformed

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void txtSerialAvionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialAvionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtSerialAvionKeyTyped

    private void txtCodigoPilotoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPilotoKeyTyped
       char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoPilotoKeyTyped

    private void txtCodigoAzafataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoAzafataKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoAzafataKeyTyped

    private void txtNombrePilotoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePilotoKeyTyped
        
                char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombrePilotoKeyTyped

    private void txtNombreAzafataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAzafataKeyTyped
                char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreAzafataKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmLogin login= new FrmLogin();
        login.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void limpiar(){
      
        txtSerialAvion.setText("");
        txtCapacidad.setText("");
        txtCodigoPiloto.setText("");
        txtNombrePiloto.setText("");
        txtCodigoAzafata.setText("");
        txtNombreAzafata.setText("");
    }
    
    public void listar(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = controladorAvion.listarElementos(listaAvion);
        jTableAvion.setModel(modelo);
                
    }
   
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
            java.util.logging.Logger.getLogger(FrmAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAvion;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCodigoAzafata;
    private javax.swing.JLabel lblCodigoPiloto;
    private javax.swing.JLabel lblNombreAzafata;
    private javax.swing.JLabel lblNombrePiloto;
    private javax.swing.JLabel lblSerialAvion;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCodigoAzafata;
    private javax.swing.JTextField txtCodigoPiloto;
    private javax.swing.JTextField txtNombreAzafata;
    private javax.swing.JTextField txtNombrePiloto;
    private javax.swing.JTextField txtSerialAvion;
    // End of variables declaration//GEN-END:variables
}
