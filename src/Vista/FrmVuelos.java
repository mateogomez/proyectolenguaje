/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtVuelos;
import Controlador.CtlAvion;
import Controlador.CtlRuta;
import Modelo.ClsAvion;
import Modelo.ClsRuta;
import Modelo.ClsVuelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class FrmVuelos extends javax.swing.JFrame {

    DateFormat formato = DateFormat.getDateInstance();
    ArrayList<ClsAvion> listaAvion = new ArrayList<ClsAvion>();
    ArrayList<ClsRuta> listaRuta = new ArrayList<ClsRuta>();
    ArrayList<ClsVuelo> listaVuelos = new ArrayList<ClsVuelo>();
    CtlAvion controladorAvion;
    CtlRuta controladorRuta;
    CtVuelos controladorVuelos;

    public FrmVuelos() {
        initComponents();
        controladorAvion = new CtlAvion();
        controladorRuta = new CtlRuta();
        controladorVuelos = new CtVuelos();
        try {
            listaAvion = controladorAvion.cargarArchivo(listaAvion);
            listaRuta = controladorRuta.cargarArchivo(listaRuta);
            listaVuelos = controladorVuelos.cargarArchivo(listaVuelos);
            listarcomboxavion();
            listarcomboxdestino();
            listarcomboxorigen();
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

        lblVuelo = new javax.swing.JLabel();
        lblAvion = new javax.swing.JLabel();
        lblNumerovuelo = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        CbxAvion = new javax.swing.JComboBox<>();
        txtNumeroVuelo = new javax.swing.JTextField();
        CbxOrigen = new javax.swing.JComboBox<>();
        lblDestino = new javax.swing.JLabel();
        CbxDestino = new javax.swing.JComboBox<>();
        lblHorasalida = new javax.swing.JLabel();
        lblHorallegada = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        JcalendarFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtVuelos = new javax.swing.JTable();
        BtnRegistrar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        CbxHorasalida = new javax.swing.JComboBox<>();
        CbxHorallegada = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVuelo.setText("Vuelos");

        lblAvion.setText("Avion");

        lblNumerovuelo.setText("Numero vuelo");

        lblOrigen.setText("Origen");

        lblDestino.setText("Destino");

        lblHorasalida.setText("Hora salida");

        lblHorallegada.setText("Hora llegada");

        lblFecha.setText("Fecha");

        JtVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Numero vuelo", "Avion", "Origen", "Destino", "Hora salida", "Hora llegada", "Estado"
            }
        ));
        jScrollPane1.setViewportView(JtVuelos);

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado");

        CbxHorasalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche" }));

        CbxHorallegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAvion)
                            .addComponent(lblOrigen)
                            .addComponent(lblHorasalida)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CbxAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CbxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JcalendarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(CbxHorasalida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumerovuelo)
                            .addComponent(lblDestino)
                            .addComponent(lblHorallegada)
                            .addComponent(lblEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CbxDestino, 0, 160, Short.MAX_VALUE)
                            .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbxHorallegada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(BtnBuscar)
                        .addGap(70, 70, 70)
                        .addComponent(BtnModificar)
                        .addGap(65, 65, 65)
                        .addComponent(BtnEliminar)
                        .addGap(80, 80, 80)
                        .addComponent(BtnRegresar)
                        .addGap(10, 10, 10)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(lblVuelo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVuelo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvion)
                    .addComponent(lblNumerovuelo)
                    .addComponent(CbxAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(CbxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino)
                    .addComponent(CbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasalida)
                    .addComponent(lblHorallegada)
                    .addComponent(CbxHorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxHorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstado)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegresar)
                            .addComponent(BtnRegistrar)
                            .addComponent(BtnBuscar)
                            .addComponent(BtnModificar)
                            .addComponent(BtnEliminar))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JcalendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed

        String serial = CbxAvion.getSelectedItem().toString();
        String numeroVuelo = txtNumeroVuelo.getText();
        String origen = CbxOrigen.getSelectedItem().toString();
        String destino = CbxDestino.getSelectedItem().toString();
        String horaSalida = CbxHorasalida.getSelectedItem().toString();
        String horaLlegada = CbxHorallegada.getSelectedItem().toString();
        String fecha = formato.format(JcalendarFecha.getDate());
        String estado = txtEstado.getText();
        listaVuelos = controladorVuelos.registrarVuelo(listaVuelos, fecha, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial);
        String res = controladorVuelos.guardarArchivo(listaVuelos);
        limpiar();
        listar();
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String numeroVuelo = JOptionPane.showInputDialog("Ingrese el numero de vuelo");
        limpiar();
        ClsVuelo vuelo = null;
        vuelo = controladorVuelos.buscarVuelo(listaVuelos, numeroVuelo);
        if (vuelo == null) {
            limpiar();
        } else {
            Date fecha = convertirString(vuelo.getFecha());
            JcalendarFecha.setDate(fecha);
            CbxAvion.setSelectedItem(vuelo.getSerial());
            txtNumeroVuelo.setText(vuelo.getNumeroVuelo());
            CbxOrigen.setSelectedItem(vuelo.getOrigen());
            CbxDestino.setSelectedItem(vuelo.getDestino());
            CbxHorasalida.setSelectedItem(vuelo.getHoraSalida());
            CbxHorallegada.setSelectedItem(vuelo.getHoraLlegada());
            txtEstado.setText(vuelo.getEstado());
            BtnModificar.setEnabled(true);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        String serial = CbxAvion.getSelectedItem().toString();
        String numeroVuelo = txtNumeroVuelo.getText();
        String origen = CbxOrigen.getSelectedItem().toString();
        String destino = CbxDestino.getSelectedItem().toString();
        String horaSalida = CbxHorasalida.getSelectedItem().toString();
        String horaLlegada = CbxHorallegada.getSelectedItem().toString();
        String fecha = formato.format(JcalendarFecha.getDate());
        String estado = txtEstado.getText();
        listaVuelos = controladorVuelos.modificarVuelo(listaVuelos, fecha, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial);
        String res = controladorVuelos.guardarArchivo(listaVuelos);
        limpiar();
        BtnModificar.setEnabled(false);
        listar();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        String numeroVuelo = JOptionPane.showInputDialog("Ingrese el numero de vuelo");
        listaVuelos = controladorVuelos.eliminarVuelo(listaVuelos, numeroVuelo);
        String res=controladorVuelos.guardarArchivo(listaVuelos);
        listar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
       FrmAdministrador administrador = new FrmAdministrador();
       administrador.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed
    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = controladorVuelos.listarElementos(listaVuelos);
        JtVuelos.setModel(modelo);
    }

    public void limpiar() {
        Date vacio = null;
        JcalendarFecha.setDate(vacio);
        JcalendarFecha.setCalendar(null);
        txtNumeroVuelo.setText("");
        txtEstado.setText("");
    }

    public Date convertirString(String fecha) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = format.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    private void listarcomboxavion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaAvion.size(); i++) {
            modelo.addElement(listaAvion.get(i).getSerial());
        }
        CbxAvion.setModel(modelo);

    }

    private void listarcomboxorigen() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaRuta.size(); i++) {
            modelo.addElement(listaRuta.get(i).getOrigen());
        }
        CbxOrigen.setModel(modelo);

    }

    private void listarcomboxdestino() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaRuta.size(); i++) {
            modelo.addElement(listaRuta.get(i).getDestino());
        }
        CbxDestino.setModel(modelo);

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
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CbxAvion;
    private javax.swing.JComboBox<String> CbxDestino;
    private javax.swing.JComboBox<String> CbxHorallegada;
    private javax.swing.JComboBox<String> CbxHorasalida;
    private javax.swing.JComboBox<String> CbxOrigen;
    private com.toedter.calendar.JDateChooser JcalendarFecha;
    private javax.swing.JTable JtVuelos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvion;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorallegada;
    private javax.swing.JLabel lblHorasalida;
    private javax.swing.JLabel lblNumerovuelo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblVuelo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
