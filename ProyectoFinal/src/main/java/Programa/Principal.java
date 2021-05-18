package Programa;

import Archivos.EscritorArchivosBinarios;
import Archivos.LectorArchivosBinarios;
import Controladores.ControladorBuscarDatos;
import Controladores.ControladorCompraBoletos;
import Controladores.ControladorLogin;
import Controladores.ControladorOperadorVuelo;
import Controladores.ControladorVentanaPersonal;
import ComprarBoletosGUI.CompraBoletosGUI;
import GUI.Login;
import GUI.PrincipalGUI;
import ComprarBoletosGUI.VuelosGUI;
import ComprarBoletosGUI.LlenadoPasaporte;
import ComprarBoletosGUI.PedirTarjeta;
import Controladores.ControladorAdministrador;
import Controladores.ControladorCrearObjetos;
import GUI.ventanaPersonal;
import Objetos.Aereolínea;
import Objetos.Aereopuerto;
import Objetos.Avión;
import Objetos.Distancia;
import Objetos.Pasaporte;
import Objetos.RenovaciónPasaporte;
import Objetos.Reservación;
import Objetos.Tarjeta;
import Objetos.Vuelo;
import Usuarios.Administrador;
import Usuarios.OperadorVuelo;
import Usuarios.Pasajero;
import Usuarios.Usuario;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Alexs
 */
public class Principal {
//mientras
    //Objetos
    //Controladores

    private ControladorCompraBoletos controlCBoletos;
    private ControladorLogin controlLogin;
    private ControladorBuscarDatos buscarDatos;
    private ControladorCrearObjetos crearObjetos;
    private ControladorOperadorVuelo controlOperadorVuelo;
    private ControladorAdministrador controlAdministrador;
    private ControladorVentanaPersonal controlVentanaPersonal;
    private ControladorCrearObjetos controlCrearObjetos;
    //Lectores de Archivos
    private LectorArchivosBinarios<Aereolínea> lectorAereolineas;
    private LectorArchivosBinarios<Aereopuerto> lectorAereopuertos;
    private LectorArchivosBinarios<Avión> lectorAviones;
    private LectorArchivosBinarios<Distancia> lectorDistancia;
    private LectorArchivosBinarios<Pasaporte> lectorPasaportes;
    private LectorArchivosBinarios<RenovaciónPasaporte> lectorRenovaciónPasaporte;
    private LectorArchivosBinarios<Reservación> lectorReservación;
    private LectorArchivosBinarios<Tarjeta> lectorTarjetas;
    private LectorArchivosBinarios<Vuelo> lectorVuelos;
    private LectorArchivosBinarios<OperadorVuelo> lectorPersonal;
    private LectorArchivosBinarios<Pasajero> lectorPasajeros;
    //Escritores de Archivos
    private EscritorArchivosBinarios<Aereolínea> escritorAereolineas;
    private EscritorArchivosBinarios<Aereopuerto> escritorAereopuertos;
    private EscritorArchivosBinarios<Avión> escritorAviones;
    private EscritorArchivosBinarios<Distancia> escritorDistancia;
    private EscritorArchivosBinarios<Pasaporte> escritorPasaportes;
    private EscritorArchivosBinarios<RenovaciónPasaporte> escritorRenovaciónPasaporte;
    private EscritorArchivosBinarios<Reservación> escritorReservación;
    private EscritorArchivosBinarios<Tarjeta> escritorTarjetas;
    private EscritorArchivosBinarios<Vuelo> escritorVuelos;
    private EscritorArchivosBinarios<OperadorVuelo> escritorPersonal;
    private EscritorArchivosBinarios<Pasajero> escritorPasajeros;
    //GUI
    private PrincipalGUI ventanaPrincipal;
    private CompraBoletosGUI ventanaCompraBoletos;
    private VuelosGUI verificarDatosBoletos;
    private Login login;
    private VuelosGUI tablaVuelos;
    private LlenadoPasaporte llenado;
    private PedirTarjeta pedirTarjeta;
    private ventanaPersonal ventanaPersonal;

    public Principal() throws IOException {
//Lectores de Archivos
        lectorAereolineas = new LectorArchivosBinarios<>("Aereolineas");
        lectorAereopuertos = new LectorArchivosBinarios<>("Aereopuertos");
        lectorAviones = new LectorArchivosBinarios<>("Aviones");
        lectorDistancia = new LectorArchivosBinarios<>("Distancia");
        lectorPasaportes = new LectorArchivosBinarios<>("Pasaportes");
        lectorRenovaciónPasaporte = new LectorArchivosBinarios<>("RenovacionesPasaporte");
        lectorReservación = new LectorArchivosBinarios<>("Reservaciones");
        lectorTarjetas = new LectorArchivosBinarios<>("Tarjetas");
        lectorVuelos = new LectorArchivosBinarios<>("Vuelos");
        lectorPersonal = new LectorArchivosBinarios<>("Personal");
        lectorPasajeros = new LectorArchivosBinarios<>("Usuarios");
//Escritores de Archivos
        escritorAereolineas = new EscritorArchivosBinarios<>("Aereolineas");
        escritorAereopuertos = new EscritorArchivosBinarios<>("Aereopuertos");
        escritorAviones = new EscritorArchivosBinarios<>("Aviones");
        escritorDistancia = new EscritorArchivosBinarios<>("Distancia");
        escritorPasaportes = new EscritorArchivosBinarios<>("Pasaportes");
        escritorRenovaciónPasaporte = new EscritorArchivosBinarios<>("RenovacionesPasaporte");
        escritorReservación = new EscritorArchivosBinarios<>("Reservaciones");
        escritorTarjetas = new EscritorArchivosBinarios<>("Tarjetas");
        escritorVuelos = new EscritorArchivosBinarios<>("Vuelos");
        escritorPersonal = new EscritorArchivosBinarios<>("Personal");
        escritorPasajeros = new EscritorArchivosBinarios<>("Usuarios");

        buscarDatos = new ControladorBuscarDatos(this);
        crearObjetos = new ControladorCrearObjetos(this);
        //GUI
        controlVentanaPersonal = new ControladorVentanaPersonal(this);
        ventanaPersonal = new ventanaPersonal(this);
        controlCrearObjetos = new ControladorCrearObjetos(this);

        //mientras 
        //escri = new EscritorArchivosBinarios("Personal");
        //escriA = new EscritorArchivosBinarios("Vuelos");
        //escri.guardarObjeto(new OperadorVuelo("Pedro", "123"), "Operador1");
        //escriA.guardarObjeto(new Vuelo("256", "165", "Aereopuerto1", "Aereopuerto777", 50, LocalDate.MIN), "vuelo1");
        //escritorPersonal.guardarObjeto(new Administrador("pepe", "123"), "admin1");
    }

    public void iniciar() {
        ventanaPrincipal = new PrincipalGUI(this);
        ventanaPrincipal.setVisible(true);
    }

    public void comprarBoletos() {
        controlCBoletos = new ControladorCompraBoletos(this);
        ventanaCompraBoletos = new CompraBoletosGUI(this);
        tablaVuelos = new VuelosGUI(this);
        llenado = new LlenadoPasaporte(this);
        pedirTarjeta = new PedirTarjeta(this);

        ventanaPrincipal.setEnabled(false);
        ventanaCompraBoletos.setVisible(true);
        //desbloquearPantallaPrincipal
    }

    public void ingresoPersonal() {
        controlLogin = new ControladorLogin(this);
        login = new Login(this);
        ventanaPrincipal.setEnabled(false);
//      ventanaCompraBoletos.setVisible(false);
        login.setVisible(true);
    }

    public void concederAcceso(Usuario user, int opcion) {

        if (opcion == 1) {//admin
            controlOperadorVuelo = new ControladorOperadorVuelo((OperadorVuelo) user);
            controlAdministrador = new ControladorAdministrador((Administrador)user, this);
        }
        if (opcion == 2) {
            controlOperadorVuelo = new ControladorOperadorVuelo((OperadorVuelo) user);
        } else {
            controlOperadorVuelo = new ControladorOperadorVuelo((OperadorVuelo) user);
        }

        ventanaPersonal.setVisible(true);
    }

    public void accesoPasajero(Pasajero user) {

    }

    public void llenarDatosPersonal() {

    }

    public ControladorCompraBoletos getControlCBoletos() {
        return controlCBoletos;
    }

    public ControladorLogin getControlLogin() {
        return controlLogin;
    }

    public ControladorCrearObjetos getControlCrearObjetos() {
        return controlCrearObjetos;
    }

    public ControladorAdministrador getControlAdministrador() {
        return controlAdministrador;
    }

    public LectorArchivosBinarios<Pasaporte> getLectorPasaportes() {
        return lectorPasaportes;
    }

    public LectorArchivosBinarios<Vuelo> getLectorVuelos() {
        return lectorVuelos;
    }

    public LectorArchivosBinarios<Avión> getLectorAviones() {
        return lectorAviones;
    }

    public LectorArchivosBinarios<OperadorVuelo> getLectorPersonal() {
        return lectorPersonal;
    }

    public LectorArchivosBinarios<Tarjeta> getLectorTarjetas() {
        return lectorTarjetas;
    }

    public LectorArchivosBinarios<Pasajero> getLectorPasajeros() {
        return lectorPasajeros;
    }

    public LectorArchivosBinarios<Aereopuerto> getLectorAereopuertos() {
        return lectorAereopuertos;
    }

    public LectorArchivosBinarios<Aereolínea> getLectorAereolineas() {
        return lectorAereolineas;
    }

    public void setLectorAereolineas(LectorArchivosBinarios<Aereolínea> lectorAereolineas) {
        this.lectorAereolineas = lectorAereolineas;
    }

    public LectorArchivosBinarios<Distancia> getLectorDistancia() {
        return lectorDistancia;
    }

    public void setLectorDistancia(LectorArchivosBinarios<Distancia> lectorDistancia) {
        this.lectorDistancia = lectorDistancia;
    }

    public LectorArchivosBinarios<RenovaciónPasaporte> getLectorRenovaciónPasaporte() {
        return lectorRenovaciónPasaporte;
    }

    public void setLectorRenovaciónPasaporte(LectorArchivosBinarios<RenovaciónPasaporte> lectorRenovaciónPasaporte) {
        this.lectorRenovaciónPasaporte = lectorRenovaciónPasaporte;
    }

    public LectorArchivosBinarios<Reservación> getLectorReservación() {
        return lectorReservación;
    }

    public void setLectorReservación(LectorArchivosBinarios<Reservación> lectorReservación) {
        this.lectorReservación = lectorReservación;
    }

    public EscritorArchivosBinarios<Aereolínea> getEscritorAereolineas() {
        return escritorAereolineas;
    }

    public void setEscritorAereolineas(EscritorArchivosBinarios<Aereolínea> escritorAereolineas) {
        this.escritorAereolineas = escritorAereolineas;
    }

    public EscritorArchivosBinarios<Aereopuerto> getEscritorAereopuertos() {
        return escritorAereopuertos;
    }

    public void setEscritorAereopuertos(EscritorArchivosBinarios<Aereopuerto> escritorAereopuertos) {
        this.escritorAereopuertos = escritorAereopuertos;
    }

    public EscritorArchivosBinarios<Avión> getEscritorAviones() {
        return escritorAviones;
    }

    public void setEscritorAviones(EscritorArchivosBinarios<Avión> escritorAviones) {
        this.escritorAviones = escritorAviones;
    }

    public EscritorArchivosBinarios<Distancia> getEscritorDistancia() {
        return escritorDistancia;
    }

    public void setEscritorDistancia(EscritorArchivosBinarios<Distancia> escritorDistancia) {
        this.escritorDistancia = escritorDistancia;
    }

    public EscritorArchivosBinarios<Pasaporte> getEscritorPasaportes() {
        return escritorPasaportes;
    }

    public void setEscritorPasaportes(EscritorArchivosBinarios<Pasaporte> escritorPasaportes) {
        this.escritorPasaportes = escritorPasaportes;
    }

    public EscritorArchivosBinarios<RenovaciónPasaporte> getEscritorRenovaciónPasaporte() {
        return escritorRenovaciónPasaporte;
    }

    public void setEscritorRenovaciónPasaporte(EscritorArchivosBinarios<RenovaciónPasaporte> escritorRenovaciónPasaporte) {
        this.escritorRenovaciónPasaporte = escritorRenovaciónPasaporte;
    }

    public EscritorArchivosBinarios<Reservación> getEscritorReservación() {
        return escritorReservación;
    }

    public void setEscritorReservación(EscritorArchivosBinarios<Reservación> escritorReservación) {
        this.escritorReservación = escritorReservación;
    }

    public EscritorArchivosBinarios<Tarjeta> getEscritorTarjetas() {
        return escritorTarjetas;
    }

    public void setEscritorTarjetas(EscritorArchivosBinarios<Tarjeta> escritorTarjetas) {
        this.escritorTarjetas = escritorTarjetas;
    }

    public EscritorArchivosBinarios<Vuelo> getEscritorVuelos() {
        return escritorVuelos;
    }

    public void setEscritorVuelos(EscritorArchivosBinarios<Vuelo> escritorVuelos) {
        this.escritorVuelos = escritorVuelos;
    }

    public EscritorArchivosBinarios<OperadorVuelo> getEscritorPersonal() {
        return escritorPersonal;
    }

    public void setEscritorPersonal(EscritorArchivosBinarios<OperadorVuelo> escritorPersonal) {
        this.escritorPersonal = escritorPersonal;
    }

    public EscritorArchivosBinarios<Pasajero> getEscritorPasajeros() {
        return escritorPasajeros;
    }

    public void setEscritorPasajeros(EscritorArchivosBinarios<Pasajero> escritorPasajeros) {
        this.escritorPasajeros = escritorPasajeros;
    }

    public ControladorBuscarDatos getBuscarDatos() {
        return buscarDatos;
    }

    public ControladorVentanaPersonal getControlVentanaPersonal() {
        return controlVentanaPersonal;
    }

    public ControladorOperadorVuelo getControlOperadorVuelo() {
        return controlOperadorVuelo;
    }

    public VuelosGUI getTablaVuelos() {
        return tablaVuelos;
    }

    public LlenadoPasaporte getLlenado() {
        return llenado;
    }

    public PedirTarjeta getPedirTarjeta() {
        return pedirTarjeta;
    }

    public ventanaPersonal getVentanaPersonal() {
        return ventanaPersonal;
    }

    public CompraBoletosGUI getVentanaCompraBoletos() {
        return ventanaCompraBoletos;
    }
}
