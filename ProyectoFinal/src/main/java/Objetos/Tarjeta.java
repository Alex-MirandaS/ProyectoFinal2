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
public class Tarjeta implements Serializable {

    private String numTarjeta;
    private int numPasaporte, codigoCVC;
    private double dineroActual;

    public Tarjeta(String numTarjeta, int numPasaporte, double dineroActual, int codigoCVC) {
        this.numTarjeta = numTarjeta;
        this.numPasaporte = numPasaporte;
        this.codigoCVC = codigoCVC;
        this.dineroActual = dineroActual;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public int getCodigoCVC() {
        return codigoCVC;
    }

    public double getDineroActual() {
        return dineroActual;
    }

}
