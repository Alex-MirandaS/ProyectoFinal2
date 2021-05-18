package Controladores;

import AdministradorGUI.CrearAviónGUI;
import Programa.Principal;
import Usuarios.Administrador;

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
        if (text.equalsIgnoreCase("Avión")) {
            prin.getControlCrearObjetos().crearAvión();
        }
    }

    public void cargarObjeto(String text) {

    }

}
