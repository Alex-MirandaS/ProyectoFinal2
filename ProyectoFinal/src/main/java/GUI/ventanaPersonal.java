/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AdministradorGUI.OpcionesAvanzadas;
import Programa.Principal;
import javax.swing.JPanel;

/**
 *
 * @author Alexs
 */
public class ventanaPersonal extends javax.swing.JFrame {

    private Principal prin;

    public ventanaPersonal(Principal prin) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.prin = prin;
        prin.getControlVentanaPersonal().llenarTablaVuelos(tablaVuelos, listaVuelos);
        prin.getControlVentanaPersonal().cambiarDatos(listaVuelos, codigoAvión1, estado1, aereopuertoActual1, aereoDestino1, cPasajeros1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        operadorVuelo = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tipoOrdenamiento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        listaVuelos = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        añadirVuelo1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        estado1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aereopuertoActual1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        aereoDestino1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        codigoAvión1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cPasajeros1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        iniciarVuelo = new javax.swing.JButton();
        cancelarVuelo = new javax.swing.JButton();
        posponerVuelo = new javax.swing.JButton();
        distribuciónAvión = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVuelos = new javax.swing.JTable();
        gerente = new javax.swing.JPanel();
        administrador = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        aereolíneaOpciones = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        aereopuertoOpciones = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        avionOpciones = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        distanciaOpciones = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pasaporteOpciones = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        renovacionPasaporteOpciones = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        reservacionOpciones = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tarjetaOpciones = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        vueloOpciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel9.setText(" ");
        jPanel5.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jLabel10.setText(" ");
        jPanel5.add(jLabel10, java.awt.BorderLayout.PAGE_END);

        jLabel11.setText("   ");
        jPanel5.add(jLabel11, java.awt.BorderLayout.LINE_END);

        jLabel12.setText("   ");
        jPanel5.add(jLabel12, java.awt.BorderLayout.LINE_START);

        jPanel6.setLayout(new java.awt.GridLayout(1, 3));
        jPanel6.add(jLabel13);
        jPanel6.add(jLabel14);

        salir.setText("Salir");
        jPanel6.add(salir);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        operadorVuelo.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridLayout(4, 0));

        jPanel13.setLayout(new java.awt.GridLayout(1, 5));

        jLabel25.setText("Ordenado: ");
        jPanel13.add(jLabel25);

        tipoOrdenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoOrdenamientoActionPerformed(evt);
            }
        });
        jPanel13.add(tipoOrdenamiento);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vuelo: ");
        jPanel13.add(jLabel7);

        listaVuelos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaVuelosItemStateChanged(evt);
            }
        });
        jPanel13.add(listaVuelos);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel15.setText(" ");
        jPanel14.add(jLabel15, java.awt.BorderLayout.LINE_START);

        añadirVuelo1.setText("Añadir Vuelo");
        jPanel14.add(añadirVuelo1, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14);

        jPanel12.add(jPanel13);

        jPanel15.setLayout(new java.awt.GridLayout(1, 6));

        jLabel16.setText("Estado:");
        jPanel15.add(jLabel16);
        jPanel15.add(estado1);

        jLabel17.setText("Aereo. Actual:");
        jPanel15.add(jLabel17);
        jPanel15.add(aereopuertoActual1);

        jLabel18.setText("Aereo. Destino:");
        jPanel15.add(jLabel18);
        jPanel15.add(aereoDestino1);

        jPanel12.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 4));

        jLabel19.setText("Código Avión:");
        jPanel16.add(jLabel19);
        jPanel16.add(codigoAvión1);

        jLabel20.setText("Cantidad Pasajeros:");
        jPanel16.add(jLabel20);
        jPanel16.add(cPasajeros1);

        jPanel12.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(1, 4));

        iniciarVuelo.setText("Iniciar Vuelo");
        iniciarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarVueloActionPerformed(evt);
            }
        });
        jPanel17.add(iniciarVuelo);

        cancelarVuelo.setText("Cancelar Vuelo");
        cancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVueloActionPerformed(evt);
            }
        });
        jPanel17.add(cancelarVuelo);

        posponerVuelo.setText("Posponer Vuelo");
        posponerVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posponerVueloActionPerformed(evt);
            }
        });
        jPanel17.add(posponerVuelo);

        distribuciónAvión.setText("Distribución Avión");
        jPanel17.add(distribuciónAvión);

        jPanel12.add(jPanel17);

        operadorVuelo.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel18.setLayout(new java.awt.BorderLayout());

        tablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaVuelos);

        jPanel18.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        operadorVuelo.add(jPanel18, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("Operador Vuelos", operadorVuelo);

        javax.swing.GroupLayout gerenteLayout = new javax.swing.GroupLayout(gerente);
        gerente.setLayout(gerenteLayout);
        gerenteLayout.setHorizontalGroup(
            gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        gerenteLayout.setVerticalGroup(
            gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Gerente", gerente);

        administrador.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel24.setText("Creación de Usuarios");
        jPanel2.add(jLabel24, java.awt.BorderLayout.PAGE_START);

        jPanel24.setLayout(new java.awt.GridLayout(1, 4));

        jButton1.setText("Crear Administrador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton1);

        jButton2.setText("Crear Gerente");
        jPanel24.add(jButton2);

        jButton3.setText("Crear Operador de Vuelo");
        jPanel24.add(jButton3);

        jButton4.setText("Crear Usuario");
        jPanel24.add(jButton4);

        jPanel2.add(jPanel24, java.awt.BorderLayout.CENTER);

        administrador.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Control");
        jPanel3.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.GridLayout(3, 3));

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aereolínea");
        jPanel8.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        aereolíneaOpciones.setText("Opciones Avanzadas");
        aereolíneaOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aereolíneaOpcionesActionPerformed(evt);
            }
        });
        jPanel8.add(aereolíneaOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aeropuerto");
        jPanel9.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        aereopuertoOpciones.setText("Opciones Avanzadas");
        aereopuertoOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aereopuertoOpcionesActionPerformed(evt);
            }
        });
        jPanel9.add(aereopuertoOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Avión");
        jPanel10.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        avionOpciones.setText("Opciones Avanzadas");
        avionOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionOpcionesActionPerformed(evt);
            }
        });
        jPanel10.add(avionOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Distancia");
        jPanel11.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        distanciaOpciones.setText("Opciones Avanzadas");
        distanciaOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaOpcionesActionPerformed(evt);
            }
        });
        jPanel11.add(distanciaOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel11);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pasaporte");
        jPanel19.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        pasaporteOpciones.setText("Opciones Avanzadas");
        pasaporteOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasaporteOpcionesActionPerformed(evt);
            }
        });
        jPanel19.add(pasaporteOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Renovación de Pasaporte");
        jPanel20.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        renovacionPasaporteOpciones.setText("Opciones Avanzadas");
        renovacionPasaporteOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renovacionPasaporteOpcionesActionPerformed(evt);
            }
        });
        jPanel20.add(renovacionPasaporteOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Reservación");
        jPanel21.add(jLabel21, java.awt.BorderLayout.PAGE_START);

        reservacionOpciones.setText("Opciones Avanzadas");
        reservacionOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservacionOpcionesActionPerformed(evt);
            }
        });
        jPanel21.add(reservacionOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel21);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tarjeta");
        jPanel22.add(jLabel22, java.awt.BorderLayout.PAGE_START);

        tarjetaOpciones.setText("Opciones Avanzadas");
        tarjetaOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaOpcionesActionPerformed(evt);
            }
        });
        jPanel22.add(tarjetaOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Vuelo");
        jPanel23.add(jLabel23, java.awt.BorderLayout.PAGE_START);

        vueloOpciones.setText("Opciones Avanzadas");
        vueloOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vueloOpcionesActionPerformed(evt);
            }
        });
        jPanel23.add(vueloOpciones, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel23);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        administrador.add(jPanel3, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("Administrador", administrador);

        jPanel1.add(jTabbedPane2, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aereolíneaOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aereolíneaOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Aereolínea");
        opciones.setVisible(true);
    }//GEN-LAST:event_aereolíneaOpcionesActionPerformed

    private void posponerVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posponerVueloActionPerformed

        try {
            prin.getControlOperadorVuelo().iniciarPosponerVuelo(prin.getLectorVuelos().leerArchivos().get(listaVuelos.getSelectedIndex()));
        } catch (Exception ex) {

            System.out.println("error");
        }
    }//GEN-LAST:event_posponerVueloActionPerformed

    private void cancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVueloActionPerformed
        try {
            prin.getControlOperadorVuelo().cancelarVuelo(prin, prin.getLectorVuelos().leerArchivos().get(listaVuelos.getSelectedIndex()), tablaVuelos, listaVuelos.getSelectedIndex());
        } catch (Exception e) {

        } finally {
            prin.getControlVentanaPersonal().cambiarDatos(listaVuelos, codigoAvión1, estado1, aereopuertoActual1, aereoDestino1, cPasajeros1);
        }
    }//GEN-LAST:event_cancelarVueloActionPerformed

    private void iniciarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarVueloActionPerformed
        try {
            prin.getControlOperadorVuelo().iniciarVuelo(prin.getLectorVuelos().leerArchivos().get(listaVuelos.getSelectedIndex()), prin.getLectorAviones(), tablaVuelos, listaVuelos.getSelectedIndex());
        } catch (Exception e) {

        } finally {
            prin.getControlVentanaPersonal().cambiarDatos(listaVuelos, codigoAvión1, estado1, aereopuertoActual1, aereoDestino1, cPasajeros1);
        }
    }//GEN-LAST:event_iniciarVueloActionPerformed

    private void listaVuelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaVuelosItemStateChanged
        prin.getControlVentanaPersonal().cambiarDatos(listaVuelos, codigoAvión1, estado1, aereopuertoActual1, aereoDestino1, cPasajeros1);
    }//GEN-LAST:event_listaVuelosItemStateChanged

    private void tipoOrdenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoOrdenamientoActionPerformed

    }//GEN-LAST:event_tipoOrdenamientoActionPerformed

    private void aereopuertoOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aereopuertoOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Aeropuerto");
        opciones.setVisible(true);
    }//GEN-LAST:event_aereopuertoOpcionesActionPerformed

    private void avionOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Avion");
        opciones.setVisible(true);
    }//GEN-LAST:event_avionOpcionesActionPerformed

    private void distanciaOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Distancia");
        opciones.setVisible(true);
    }//GEN-LAST:event_distanciaOpcionesActionPerformed

    private void pasaporteOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasaporteOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Pasaporte");
        opciones.setVisible(true);
    }//GEN-LAST:event_pasaporteOpcionesActionPerformed

    private void renovacionPasaporteOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renovacionPasaporteOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Renovación de Pasaporte");
        opciones.setVisible(true);
    }//GEN-LAST:event_renovacionPasaporteOpcionesActionPerformed

    private void reservacionOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservacionOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Reservación");
        opciones.setVisible(true);
    }//GEN-LAST:event_reservacionOpcionesActionPerformed

    private void tarjetaOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Tarjeta");
        opciones.setVisible(true);
    }//GEN-LAST:event_tarjetaOpcionesActionPerformed

    private void vueloOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vueloOpcionesActionPerformed
        OpcionesAvanzadas opciones = new OpcionesAvanzadas(prin.getControlAdministrador(), "Vuelo");
        opciones.setVisible(true);
    }//GEN-LAST:event_vueloOpcionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    public JPanel getAdministrador() {
        return administrador;
    }

    public JPanel getGerente() {
        return gerente;
    }

    public JPanel getOperadorVuelo() {
        return operadorVuelo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel administrador;
    private javax.swing.JLabel aereoDestino1;
    private javax.swing.JButton aereolíneaOpciones;
    private javax.swing.JLabel aereopuertoActual1;
    private javax.swing.JButton aereopuertoOpciones;
    private javax.swing.JButton avionOpciones;
    private javax.swing.JButton añadirVuelo1;
    private javax.swing.JLabel cPasajeros1;
    private javax.swing.JButton cancelarVuelo;
    private javax.swing.JLabel codigoAvión1;
    private javax.swing.JButton distanciaOpciones;
    private javax.swing.JButton distribuciónAvión;
    private javax.swing.JLabel estado1;
    private javax.swing.JPanel gerente;
    private javax.swing.JButton iniciarVuelo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox<String> listaVuelos;
    private javax.swing.JPanel operadorVuelo;
    private javax.swing.JButton pasaporteOpciones;
    private javax.swing.JButton posponerVuelo;
    private javax.swing.JButton renovacionPasaporteOpciones;
    private javax.swing.JButton reservacionOpciones;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaVuelos;
    private javax.swing.JButton tarjetaOpciones;
    private javax.swing.JComboBox<String> tipoOrdenamiento;
    private javax.swing.JButton vueloOpciones;
    // End of variables declaration//GEN-END:variables
}
