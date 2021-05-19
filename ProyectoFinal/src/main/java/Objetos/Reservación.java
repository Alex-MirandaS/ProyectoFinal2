/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;

/**
 *
 * @author Alexs
 */
public class Reservación implements Serializable {

    private String codigoVuelo, numTarjeta;
    private int numPasaporte, numAsientosComprados;

    public Reservación(int numPasaporte, String codigoVuelo, String numTarjeta, int numAsientosComprados) {
        this.codigoVuelo = codigoVuelo;
        this.numPasaporte = numPasaporte;
        this.numTarjeta = numTarjeta;
        this.numAsientosComprados = numAsientosComprados;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public int getNumAsientosComprados() {
        return numAsientosComprados;
    }

}
