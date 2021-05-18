/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Archivos.LectorArchivosBinarios;
import Objetos.Avión;
import Objetos.Pasaporte;
import Objetos.Vuelo;
import OperadorVueloGUI.PosponerVuelo;
import Programa.Principal;
import Usuarios.OperadorVuelo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Alexs
 */
public class ControladorOperadorVuelo {

    private OperadorVuelo operador;

    public ControladorOperadorVuelo(OperadorVuelo operador) {
        this.operador = operador;

    }

    public void iniciarVuelo(Vuelo vuelo, LectorArchivosBinarios<Avión> aviones, JTable tabla, int fila) throws IOException, FileNotFoundException, ClassNotFoundException {
        if (vuelo.getEstado().equalsIgnoreCase("En Espera")) {
            //aplicar hilo
            for (int i = 0; i < aviones.leerArchivos().size(); i++) {
                if (vuelo.getCodigoAvión().equalsIgnoreCase(aviones.leerArchivos().get(i).getCodigoAvión())) {
                    aviones.leerArchivos().get(i).setNombreAereopuertoActual(vuelo.getNombreAereopuertoDestino());
                    cambiarLugarPasajeros(vuelo.getPasaportesVuelo(), vuelo.getNombreAereopuertoDestino());
                    vuelo.setEstado("COMPLETADO");
                    cambiarDatosTabla(tabla, vuelo.getEstado(), fila, 1);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "ES IMPOSIBLE INICIAR ESTE VUELO");
        }
    }

    public void cancelarVuelo(Principal prin, Vuelo vuelo, JTable tabla, int fila) throws IOException {
        if (vuelo.getEstado().equalsIgnoreCase("En Espera")) {
            vuelo.setEstado("CANCELADO");
            prin.getEscritorVuelos().guardarObjeto(vuelo, "vuelo1");
            cambiarDatosTabla(tabla, vuelo.getEstado(), fila, 1);
        } else {
            JOptionPane.showMessageDialog(null, "ES IMPOSIBLE CANCELAR ESTE VUELO");
        }
    }

    public void iniciarPosponerVuelo(Vuelo vuelo) {
        PosponerVuelo posponerVuelo = new PosponerVuelo(this, vuelo);
        posponerVuelo.setVisible(true);
    }

    public void posponerVuelo(Vuelo vuelo, LocalDate nuevaFecha) throws IOException, FileNotFoundException, ClassNotFoundException {

        if (vuelo != null) {

            if (nuevaFecha.compareTo(vuelo.getFechaSalida()) < 0) {
                JOptionPane.showMessageDialog(null, "LA FECHA ES INCORRECTA, YA QUE NO SE PUEDE PONER UNA FECHA ANTES");
            } else {
                vuelo.setFechaSalida(nuevaFecha);
            }

        } else {
            JOptionPane.showMessageDialog(null, "ESTE VUELO YA FUE EFECTUADO");
        }
    }

    private void cambiarLugarPasajeros(ArrayList<Pasaporte> pasaportes, String país) {
        for (int i = 0; i < pasaportes.size(); i++) {
            pasaportes.get(i).setPaisActual(país);
        }

    }

    private void cambiarDatosTabla(JTable tabla, String texto, int fila, int columna) {
        tabla.setValueAt(texto, fila, columna);
    }

    public void refrescarFecha(JComboBox dias, JComboBox meses) {
        dias.removeAllItems();
        int diasTemp;
        if (meses.getSelectedIndex() == 1) {
            diasTemp = 28;
        } else if (meses.getSelectedIndex() == 3 || meses.getSelectedIndex() == 5 || meses.getSelectedIndex() == 8
                || meses.getSelectedIndex() == 10) {
            diasTemp = 30;
        } else {
            diasTemp = 31;
        }

        for (int i = 0; i < diasTemp; i++) {
            dias.addItem(i + 1);
        }
    }

    public void llenarDatosFecha(JComboBox dias, JComboBox meses) {
        for (int i = 0; i < ControladorConstantes.MESES.length; i++) {
            meses.addItem(ControladorConstantes.MESES[i]);
        }
        for (int i = 0; i < 32; i++) {
            dias.addItem(i + 1);
        }

    }

    private boolean verificarFecha(LocalDate vuelo, LocalDate fechaSalida) {

        if (vuelo.compareTo(fechaSalida) < 0) {
            return false;
        } else {
            return true;
        }
    }

}
