/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Objetos.Pasaporte;
import Objetos.Tarjeta;
import Programa.Principal;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class ControladorBuscarDatos {

    private Principal principal;

    public ControladorBuscarDatos(Principal principal) {
        this.principal = principal;
    }

    public String buscarCiudades(String nombre) {
        try {
            for (int i = 0; i < principal.getLectorAereopuertos().leerArchivos().size(); i++) {
                String temp = principal.getLectorAereopuertos().leerArchivos().get(i).getNombre();
                if (temp.equalsIgnoreCase(nombre)) {
                    return principal.getLectorAereopuertos().leerArchivos().get(i).getCiudad();
                }
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return null;
    }

    public Pasaporte buscarPasaporte(JTextField verificarDatos) {
        Pasaporte temp = null;
        try {
            for (int i = 0; i < principal.getLectorPasaportes().leerArchivos().size(); i++) {
                temp = principal.getLectorPasaportes().leerArchivos().get(i);
                if (Integer.parseInt(verificarDatos.getText()) == temp.getNumPasaporte()) {
                    return temp;
                }
            }
            JOptionPane.showMessageDialog(null, "El Pasaporte No existe");
            verificarDatos.setText("");
            return null;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CARACTER INVALIDO, SOLO SE ACEPTAN NUMERO, VUELVA A INTENTARLO");
            verificarDatos.setText("");
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        } finally {
            return temp;
        }
    }

    public Tarjeta buscarTarjeta(JTextField codTarjeta, JTextField cvc) {
        Tarjeta temp = null;
        try {
            for (int i = 0; i < principal.getLectorTarjetas().leerArchivos().size(); i++) {
                temp = principal.getLectorTarjetas().leerArchivos().get(i);
                if (Integer.parseInt(codTarjeta.getText()) == temp.getNumTarjeta() && Integer.parseInt(cvc.getText()) == temp.getCodigoCVC()) {
                    return temp;
                }
            }
            JOptionPane.showMessageDialog(null, "La Tarjeta No existe");
            codTarjeta.setText("");
            return null;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CARACTER INVALIDO, SOLO SE ACEPTAN NUMEROS, VUELVA A INTENTARLO");
            codTarjeta.setText("");
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        } finally {
            return temp;
        }
    }
}
