/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministradorGUI;

import Controladores.ControladorCrearObjetos;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class CrearAviónGUI extends javax.swing.JFrame {

    private ControladorCrearObjetos control;

    public CrearAviónGUI(ControladorCrearObjetos control) {
        initComponents();
        this.control = control;
        this.setTitle("Creación de Aviones");
        control.invisibleInicial(columnas, false, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        filasYColumnas = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cColumnas = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cFilas = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        validarCFilasColumnas = new javax.swing.JButton();
        columnas = new javax.swing.JPanel();
        panelValidarNumcasillas = new javax.swing.JPanel();
        validarAsientosPorColumna = new javax.swing.JButton();
        cFilasPorColumnas = new javax.swing.JPanel();
        visualizarAsientos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Aceptar");
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setText(" ");
        jPanel2.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel4.setText("   ");
        jPanel2.add(jLabel4, java.awt.BorderLayout.LINE_END);

        jLabel5.setText("   ");
        jPanel2.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        filasYColumnas.setLayout(new java.awt.GridLayout(3, 1));

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setText("Cantidad de Columnas");
        jPanel8.add(jLabel1);
        jPanel8.add(cColumnas);

        filasYColumnas.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        jLabel2.setText("Cantidad de Filas");
        jPanel9.add(jLabel2);
        jPanel9.add(cFilas);

        filasYColumnas.add(jPanel9);

        validarCFilasColumnas.setText("VALIDAR");
        validarCFilasColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarCFilasColumnasActionPerformed(evt);
            }
        });
        jPanel10.add(validarCFilasColumnas);

        filasYColumnas.add(jPanel10);

        jPanel4.add(filasYColumnas);

        columnas.setLayout(new java.awt.BorderLayout());

        validarAsientosPorColumna.setText("Validar");
        validarAsientosPorColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarAsientosPorColumnaActionPerformed(evt);
            }
        });
        panelValidarNumcasillas.add(validarAsientosPorColumna);

        columnas.add(panelValidarNumcasillas, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout cFilasPorColumnasLayout = new javax.swing.GroupLayout(cFilasPorColumnas);
        cFilasPorColumnas.setLayout(cFilasPorColumnasLayout);
        cFilasPorColumnasLayout.setHorizontalGroup(
            cFilasPorColumnasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        cFilasPorColumnasLayout.setVerticalGroup(
            cFilasPorColumnasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        columnas.add(cFilasPorColumnas, java.awt.BorderLayout.CENTER);

        jPanel4.add(columnas);

        jPanel3.add(jPanel4);

        javax.swing.GroupLayout visualizarAsientosLayout = new javax.swing.GroupLayout(visualizarAsientos);
        visualizarAsientos.setLayout(visualizarAsientosLayout);
        visualizarAsientosLayout.setHorizontalGroup(
            visualizarAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        visualizarAsientosLayout.setVerticalGroup(
            visualizarAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        jPanel3.add(visualizarAsientos);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarCFilasColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarCFilasColumnasActionPerformed
        control.validarCFilasColumnasAvión(cColumnas, cFilas);
    }//GEN-LAST:event_validarCFilasColumnasActionPerformed

    private void validarAsientosPorColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarAsientosPorColumnaActionPerformed
        control.validarAsientoPorColumna(Integer.parseInt(cColumnas.getText()));
    }//GEN-LAST:event_validarAsientosPorColumnaActionPerformed

    public JPanel getcFilasPorColumnas() {
        return cFilasPorColumnas;
    }

    public JPanel getFilasYColumnas() {
        return filasYColumnas;
    }

    public JTextField getcColumnas() {
        return cColumnas;
    }

    public JTextField getcFilas() {
        return cFilas;
    }

    public JPanel getVisualizarAsientos() {
        return visualizarAsientos;
    }

    public JPanel getColumnas() {
        return columnas;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cColumnas;
    private javax.swing.JTextField cFilas;
    private javax.swing.JPanel cFilasPorColumnas;
    private javax.swing.JPanel columnas;
    private javax.swing.JPanel filasYColumnas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelValidarNumcasillas;
    private javax.swing.JButton validarAsientosPorColumna;
    private javax.swing.JButton validarCFilasColumnas;
    private javax.swing.JPanel visualizarAsientos;
    // End of variables declaration//GEN-END:variables
}
