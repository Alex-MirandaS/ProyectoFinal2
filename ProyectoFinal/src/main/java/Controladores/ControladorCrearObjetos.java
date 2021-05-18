package Controladores;

import AdministradorGUI.Asiento;
import AdministradorGUI.CantidadAsientosPorFila;
import AdministradorGUI.CrearAviónGUI;
import Objetos.Aereolínea;
import Objetos.Aereopuerto;
import Objetos.Avión;
import Objetos.Distancia;
import Objetos.Pasaporte;
import Objetos.RenovaciónPasaporte;
import Objetos.Reservación;
import Objetos.Tarjeta;
import Objetos.Vuelo;
import Programa.Principal;
import java.awt.Component;
import java.awt.GridLayout;
import java.time.LocalDate;
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
    
    public Object crearObjetos(String tipo, String[] campos) {
        if (tipo.equalsIgnoreCase("Vuelo")) {
            return new Vuelo(campos[0], campos[1], campos[2], campos[3], Double.parseDouble(campos[4]), darFormatoAFecha(campos[5]));
        } else if (tipo.equalsIgnoreCase("Aereopuerto")) {
            return new Aereopuerto(campos[0], campos[1], campos[2]);
        } else if (tipo.equalsIgnoreCase("Aereolínea")) {
            return new Aereolínea(campos[0], campos[1]);
        } else if (tipo.equalsIgnoreCase("Avión")) {
            return new Avión(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]), Integer.parseInt(campos[4]), Integer.parseInt(campos[5]));
        } else if (tipo.equalsIgnoreCase("Pasaporte")) {
            return new Pasaporte(Integer.parseInt(campos[0]), campos[1], darFormatoAFecha(campos[2]), campos[3], campos[4], campos[5], campos[6], campos[7], darFormatoAFecha(campos[8]), darFormatoAFecha(campos[9]), campos[10], Integer.parseInt(campos[11]));
        } else if (tipo.equalsIgnoreCase("Tarjeta")) {
            return new Tarjeta(Integer.parseInt(campos[0]), Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), Integer.parseInt(campos[3]));
        }else if (tipo.equalsIgnoreCase("Reservación")) {
            return new Reservación(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[1]), Integer.parseInt(campos[2]));
        } else{
            return new RenovaciónPasaporte(Integer.parseInt(campos[0]), darFormatoAFecha(campos[1]));
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
    
    public static LocalDate darFormatoAFecha(String fechaCadena) {
        String[] fechaDividida = fechaCadena.split("/");
        int dia = Integer.valueOf(fechaDividida[0]);
        int mes = Integer.valueOf(fechaDividida[1]);
        int anio = Integer.valueOf(fechaDividida[2]);
        return LocalDate.of(anio, mes, dia);
    }
    
}
