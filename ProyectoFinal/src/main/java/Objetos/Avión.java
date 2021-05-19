/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import AdministradorGUI.Asiento;
import Lista.ListaOrtogonal;
import java.awt.GridLayout;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alexs
 */
public class Avión implements Serializable {

    private String nombreAereolínea, nombreAereopuertoActual, codigoAvión;
    private int capacidadPasajeros, capacidadGasolina, consumoMilla;
    private int filas = 50, columnas = 2, limites[] = {2, 2};
    private Lista.ListaOrtogonal<Asiento> asientosAvión;

    public Avión(String nombreAereolínea, String nombreAereopuertoActual, String codigoAvión, int capacidadPasajeros, int capacidadGasolina, int consumoMilla) {
        this.nombreAereolínea = nombreAereolínea;
        this.nombreAereopuertoActual = nombreAereopuertoActual;
        this.codigoAvión = codigoAvión;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadGasolina = capacidadGasolina;
        this.consumoMilla = consumoMilla;
        this.asientosAvión = new ListaOrtogonal<>();
        llenarAsientos();
    }

    public String getNombreAereolínea() {
        return nombreAereolínea;
    }

    public String getNombreAereopuertoActual() {
        return nombreAereopuertoActual;
    }

    public String getCodigoAvión() {
        return codigoAvión;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getCapacidadGasolina() {
        return capacidadGasolina;
    }

    public int getConsumoMilla() {
        return consumoMilla;
    }

    public void setNombreAereopuertoActual(String nombreAereopuertoActual) {
        this.nombreAereopuertoActual = nombreAereopuertoActual;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void setLimites(int[] limites) {
        this.limites = limites;
    }

    public void setAsientosAvión(ListaOrtogonal<Asiento> asientosAvión) {
        this.asientosAvión = asientosAvión;
    }

    private void llenarTablaAsientos(JPanel panel, boolean AsientosBloqueados) {

        int limcolumna = columnas - 1;
        for (int i = 0; i < limites.length; i++) {
            limcolumna += limites[i];
        }

        panel.setLayout(new GridLayout(filas, limcolumna));
        int contador = 0;
        int limite = 0;
        int contadorLista = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < limcolumna; j++) {
                if (limite > limites.length) {
                    limite = 0;
                }
                if (contador == limites[limite]) {
                    panel.add(new JLabel("Pasillo"));
                    contador = 0;
                    limite++;
                } else {
                    asientosAvión.get(contadorLista).setEnabled(AsientosBloqueados);
                    panel.add(asientosAvión.get(contadorLista));
                    contador++;
                    contadorLista++;
                }

            }
            contador = 0;
            limite = 0;
        }
    }

    private void llenarAsientos() {
        int x = 0;
        for (int i = 0; i < limites.length; i++) {
            x += limites[i];
        }
        for (int i = 0; i < x * filas; i++) {
            asientosAvión.add(new Asiento());
        }
    }

}
