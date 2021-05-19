package Controladores;

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
import Usuarios.Administrador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexs
 */
public class ControladorAdministrador {

    private Administrador admin;
    private Principal prin;

    public ControladorAdministrador(Administrador admin, Principal prin) {
        this.admin = admin;
        this.prin = prin;
    }

    public void crearObjeto(String text) {
        if (text.equalsIgnoreCase("Avion")) {
            prin.getControlCrearObjetos().crearAvión();
        }
        if (text.equalsIgnoreCase("Aeropuerto")) {
            prin.getControlCrearObjetos().crearAeropuerto();
        }
    }

    public void cargarObjeto(String text) {
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(prin.getVentanaPersonal());

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //aqui selecciono y guardo el FILE que va a utilizar el FileReader
            File fichero = fileChosser.getSelectedFile();
            try {
                if (text.equalsIgnoreCase("Vuelo")) {
                    ArrayList<Vuelo> objetos;
                    objetos = prin.getLectorVuelosTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorVuelos().guardarObjeto(objetos.get(i), objetos.get(i).getCodigoVuelo());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Aeropuerto")) {
                    ArrayList<Aereopuerto> objetos;
                    objetos = prin.getLectorAereopuertosTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorAereopuertos().guardarObjeto(objetos.get(i), objetos.get(i).getNombre());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Aereolínea")) {
                    ArrayList<Aereolínea> objetos;
                    objetos = prin.getLectorAereolineasTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorAereolineas().guardarObjeto(objetos.get(i), objetos.get(i).toString());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Avion")) {
                    ArrayList<Avión> objetos;
                    objetos = prin.getLectorAvionesTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorAviones().guardarObjeto(objetos.get(i), objetos.get(i).getCodigoAvión());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Pasaporte")) {
                    ArrayList<Pasaporte> objetos;
                    objetos = prin.getLectorPasaportesTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorPasaportes().guardarObjeto(objetos.get(i), "" + objetos.get(i).getNumPasaporte());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Tarjeta")) {
                    ArrayList<Tarjeta> objetos;
                    objetos = prin.getLectorTarjetasTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorTarjetas().guardarObjeto(objetos.get(i), "" + objetos.get(i).getNumTarjeta());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Reservación")) {
                    ArrayList<Reservación> objetos;
                    objetos = prin.getLectorReservaciónTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorReservación().guardarObjeto(objetos.get(i), objetos.get(i).toString());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else if (text.equalsIgnoreCase("Distancia")) {
                    ArrayList<Distancia> objetos;
                    objetos = prin.getLectorDistanciaTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorDistancia().guardarObjeto(objetos.get(i), objetos.get(i).toString());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                } else {
                    ArrayList<RenovaciónPasaporte> objetos;
                    objetos = prin.getLectorRenovaciónPasaporteTexto().leerFichero(fichero, text);
                    for (int i = 0; i < objetos.size(); i++) {
                        prin.getEscritorRenovaciónPasaporte().guardarObjeto(objetos.get(i), objetos.get(i).toString());
                    }
                    JOptionPane.showMessageDialog(null, "OBJETOS ENCONTRADOS Y CARGADOS");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo");
                ex.printStackTrace();
            }
        }
    }
}
