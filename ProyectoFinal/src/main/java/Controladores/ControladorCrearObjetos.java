/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import AdministradorGUI.Asiento;
import AdministradorGUI.CantidadAsientosPorFila;
import AdministradorGUI.CrearAviónGUI;
import Programa.Principal;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class ControladorCrearObjetos {

    private Principal prin;
    private CrearAviónGUI crearAvión;

    public ControladorCrearObjetos(Principal prin) {
        this.prin = prin;
        crearAvión = new CrearAviónGUI(this);
    }

    public void crearAvión() {
        crearAvión.setVisible(true);
    }

    public void validarCFilasColumnasAvión(JTextField cColumnas, JTextField cFilas) {
        if (validarNum(cFilas) == true && validarNum(cColumnas) == true) {
            visibleInvisible(crearAvión.getColumnas(), true);
            llenarColumnasAvión(Integer.parseInt(cColumnas.getText()));
            visibleInvisible(crearAvión.getcFilasPorColumnas(), true);
            bloqueoDesbloqueo(crearAvión.getFilasYColumnas(), false);
        }
    }

    private void llenarColumnasAvión(int i) {
        crearAvión.getcFilasPorColumnas().setLayout(new GridLayout(i, 3));
        CantidadAsientosPorFila cantidad;
        for (int j = 0; j < i; j++) {
            cantidad = new CantidadAsientosPorFila();
            cantidad.getNumColumna().setText("No. de Asientos Columna" + (j + 1));
            crearAvión.getcFilasPorColumnas().add(cantidad);
            cantidad.setVisible(true);
        }
    }

    public void validarAsientoPorColumna(int cantidadColumnas) {
        Component[] componentes = ((JComponent) crearAvión.getcFilasPorColumnas()).getComponents();
        int[] limites = new int[cantidadColumnas];
        int contador = 0;
        for (int i = 0; i < componentes.length; i++) {
            if (validarNum(((CantidadAsientosPorFila) componentes[i]).getcAsientosPorColumna())) {
                limites[contador] = Integer.parseInt(((CantidadAsientosPorFila) componentes[i]).getcAsientosPorColumna().getText());
                contador++;
            }
        }
        if (limites[cantidadColumnas - 1] != 0) {
            llenarTablaAsientos(limites);
        } else {
            JOptionPane.showMessageDialog(null, "HAY DATOS NO VALIDOS DENTRO DE LA CANTIDAD DE ASIENTOS DE LA FILA POR CADA COLUMNA ");
        }
    }

    private void llenarTablaAsientos(int[] limites) {

        int filas = Integer.parseInt(crearAvión.getcFilas().getText());
        int columnas = (Integer.parseInt(crearAvión.getcColumnas().getText())) - 1;
        for (int i = 0; i < limites.length; i++) {
            columnas += limites[i];
        }

        crearAvión.getVisualizarAsientos().setLayout(new GridLayout(filas, columnas));
        int contador = 0;
        int limite = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (limite > limites.length) {
                    limite = 0;
                }
                if (contador == limites[limite]) {
                    crearAvión.getVisualizarAsientos().add(new JLabel("Pasillo"));
                    contador = 0;
                    limite++;
                } else {
                    crearAvión.getVisualizarAsientos().add(new Asiento());
                    contador++;
                }

            }
            contador = 0;
            limite = 0;
        }
    }

    private boolean validarNum(JTextField num) {
        try {
            if (Integer.parseInt(num.getText()) < 1) {
                JOptionPane.showMessageDialog(null, "CANTIDAD INVALIDA, VUELVA A INTENTAR");
                num.setText("");
                return false;
            } else if (num.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "NO HAY NINGUN VALOR EN EL CAMPO");
                num.setText("");
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CARACTER INVALIDO, SOLO SE ACEPTAN NUMERO, VUELVA A INTENTARLO");
            num.setText("");
        }
        return false;
    }

    public void visibleInvisible(JPanel panel, boolean visible) {
        Component[] componentes = ((JComponent) panel).getComponents();

        for (int j = 0; j < componentes.length; j++) {
            componentes[j].setVisible(visible);
        }
        //crearAvión.validate();
        crearAvión.pack();
    }

    public void bloqueoDesbloqueo(JPanel panel, boolean desbloqueo) {
        Component[] componentes = ((JComponent) panel).getComponents();

        for (int j = 0; j < componentes.length; j++) {
            componentes[j].setEnabled(desbloqueo);
        }
        crearAvión.validate();
        crearAvión.pack();
    }

    public void invisibleInicial(JPanel columnas, boolean b, CrearAviónGUI crearAvión) {
        Component[] componentes = ((JComponent) columnas).getComponents();

        for (int j = 0; j < componentes.length; j++) {
            componentes[j].setVisible(b);
        }
        crearAvión.validate();
        crearAvión.pack();
    }

}
