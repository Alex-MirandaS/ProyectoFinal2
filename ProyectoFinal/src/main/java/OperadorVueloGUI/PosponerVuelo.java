/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadorVueloGUI;

import Controladores.ControladorOperadorVuelo;
import Objetos.Vuelo;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexs
 */
public class PosponerVuelo extends javax.swing.JPanel {

    private ControladorOperadorVuelo control;
    private Vuelo vuelo;

    public PosponerVuelo(ControladorOperadorVuelo control, Vuelo vuelo) {
        initComponents();
        this.control = control;
        this.vuelo = vuelo;
        this.fechaActual.setText("" + vuelo.getFechaSalida());
        control.llenarDatosFecha(dias, meses);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaActual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        meses = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        dias = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FECHA ACTUAL:");
        jPanel1.add(jLabel1);

        fechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fechaActual);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel2.add(aceptar);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel8.setText("NUEVA FECHA");
        jPanel5.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jLabel13.setText("   ");
        jPanel5.add(jLabel13, java.awt.BorderLayout.LINE_START);

        jPanel9.setLayout(new java.awt.GridLayout(1, 4));

        jLabel4.setText("Mes");
        jPanel9.add(jLabel4);

        meses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mesesItemStateChanged(evt);
            }
        });
        jPanel9.add(meses);

        jLabel14.setText("D??a");
        jPanel9.add(jLabel14);

        jPanel9.add(dias);

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void mesesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mesesItemStateChanged
        control.refrescarFecha(dias, meses);
    }//GEN-LAST:event_mesesItemStateChanged

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        try {
            control.posponerVuelo(vuelo, LocalDate.of(2021, meses.getSelectedIndex(), (int) dias.getSelectedItem()));
            this.fechaActual.setText("" + vuelo.getFechaSalida());
        } catch (IOException ex) {
            Logger.getLogger(PosponerVuelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PosponerVuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JComboBox<String> dias;
    private javax.swing.JLabel fechaActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> meses;
    // End of variables declaration//GEN-END:variables
}
