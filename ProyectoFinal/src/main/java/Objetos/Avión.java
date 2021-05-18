/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Lista.ListaOrtogonal;
import Otros.estructuraAvión;
import java.io.Serializable;

/**
 *
 * @author Alexs
 */
public class Avión implements Serializable {

    private String nombreAereolínea, nombreAereopuertoActual, codigoAvión;
    private int capacidadPasajeros, capacidadGasolina, consumoMilla;
    private estructuraAvión estructura = new estructuraAvión(2, 20, new ListaOrtogonal<>());

    public Avión(String nombreAereolínea, String nombreAereopuertoActual, String codigoAvión, int capacidadPasajeros, int capacidadGasolina, int consumoMilla) {
        this.nombreAereolínea = nombreAereolínea;
        this.nombreAereopuertoActual = nombreAereopuertoActual;
        this.codigoAvión = codigoAvión;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadGasolina = capacidadGasolina;
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

    public void setEstructura(estructuraAvión estructura) {
        this.estructura = estructura;
    }

    public estructuraAvión getEstructura() {
        return estructura;
    }


}
