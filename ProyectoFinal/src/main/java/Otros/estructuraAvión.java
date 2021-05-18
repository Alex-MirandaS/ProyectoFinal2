package Otros;

import AdministradorGUI.Asiento;
import Lista.ListaOrtogonal;

/**
 * 
 * @author Alexs
 */
public class estructuraAvión {
private int cColumnas;
private int cFilas;
private ListaOrtogonal <Asiento> listaAsientos;

    public estructuraAvión(int cColumnas, int cFilas, ListaOrtogonal<Asiento> listaAsientos) {
        this.cColumnas = cColumnas;
        this.cFilas = cFilas;
        this.listaAsientos = listaAsientos;
    }

    public int getcColumnas() {
        return cColumnas;
    }

    public void setcColumnas(int cColumnas) {
        this.cColumnas = cColumnas;
    }

    public int getcFilas() {
        return cFilas;
    }

    public void setcFilas(int cFilas) {
        this.cFilas = cFilas;
    }

    public ListaOrtogonal<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(ListaOrtogonal<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }
        
}
