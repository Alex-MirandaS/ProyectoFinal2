/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministradorGUI;

import Controladores.ControladorCrearObjetos;

/**
 *
 * @author Alexs
 */
public class CrearAviónGUI2 extends javax.swing.JFrame {

    private ControladorCrearObjetos control;

    public CrearAviónGUI2(ControladorCrearObjetos control) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.control = control;
        this.setTitle("Crear Avión");
        control.llenadoInicialListas(listaAereolíneas, listaAereopuertoAereolinea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        listaAereolíneas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        listaAereopuertoAereolinea = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        codAvión = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cPasajeros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        capacidadGasolina = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        consumoGalones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" ");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("   ");
        getContentPane().add(jLabel2, java.awt.BorderLayout.LINE_END);

        jLabel3.setText("   ");
        getContentPane().add(jLabel3, java.awt.BorderLayout.LINE_START);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel2.add(aceptar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre de la Aereolínea");
        jPanel1.add(jLabel5);

        listaAereolíneas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaAereolíneasItemStateChanged(evt);
            }
        });
        jPanel1.add(listaAereolíneas);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre del Aereopuerto Actual");
        jPanel1.add(jLabel6);

        listaAereopuertoAereolinea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaAereopuertoAereolineaItemStateChanged(evt);
            }
        });
        jPanel1.add(listaAereopuertoAereolinea);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Código del Avión");
        jPanel1.add(jLabel11);
        jPanel1.add(codAvión);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Capacidad de Pasajeros");
        jPanel1.add(jLabel7);
        jPanel1.add(cPasajeros);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Capacidad de Gasolina");
        jPanel1.add(jLabel8);
        jPanel1.add(capacidadGasolina);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Consumo de galones por Milla");
        jPanel1.add(jLabel9);
        jPanel1.add(consumoGalones);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        control.verificarDatosCrearAvión((String) listaAereolíneas.getSelectedItem(), (String) listaAereopuertoAereolinea.getSelectedItem(), codAvión, cPasajeros, capacidadGasolina, consumoGalones);
    }//GEN-LAST:event_aceptarActionPerformed

    private void listaAereopuertoAereolineaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaAereopuertoAereolineaItemStateChanged

    }//GEN-LAST:event_listaAereopuertoAereolineaItemStateChanged

    private void listaAereolíneasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaAereolíneasItemStateChanged
        control.llenarListaAereopuertos(listaAereopuertoAereolinea, (String)listaAereolíneas.getSelectedItem());
    }//GEN-LAST:event_listaAereolíneasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField cPasajeros;
    private javax.swing.JTextField capacidadGasolina;
    private javax.swing.JTextField codAvión;
    private javax.swing.JTextField consumoGalones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listaAereolíneas;
    private javax.swing.JComboBox<String> listaAereopuertoAereolinea;
    // End of variables declaration//GEN-END:variables
}
