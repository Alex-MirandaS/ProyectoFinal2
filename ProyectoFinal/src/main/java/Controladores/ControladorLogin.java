package Controladores;

import Programa.Principal;
import Usuarios.Administrador;
import Usuarios.Gerente;
import Usuarios.Pasajero;
import Usuarios.Usuario;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class ControladorLogin {

    private Principal prin;

    public ControladorLogin(Principal prin) {
        this.prin = prin;
    }

    /*Verifica el ingreso de datos, de los datos de usuario, contraseña, y la ubicación de donde buscar
   ya que de esta forma es mas facil buscar entre los usuarios pasajeros, y los miembros del personal */
    public void verificarIngreso(JTextField usuario, JTextField contraseña, String ubicación) {

        if (verificarCampos(usuario, contraseña)) {
            verificarUbicación(usuario, contraseña, ubicación);
        }

    }

    /*Verifica los campos de usuario y contraseña, para verificar que esten llenos los campos */
    private boolean verificarCampos(JTextField usuario, JTextField contraseña) {
        if (usuario.getText().length() == 0 || contraseña.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Usted no ha ingresado ningun dato en algún campo");
            return false;
        } else {
            return true;
        }
    }

    /*Se encarga de verificar y buscar al usuario, dependiendo si es un pasajero o un trabajador */
    private void verificarUbicación(JTextField usuario, JTextField contraseña, String ubicación) {
        try {
            if (ubicación.equalsIgnoreCase("Usuarios")) {
                verificarDatos(usuario, contraseña, prin.getLectorPasajeros().leerArchivos());
            } else {
                verificarDatos(usuario, contraseña, prin.getLectorPersonal().leerArchivos());
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }

    /*Al conocer la ubicación de donde se buscara el usuario, verificar Datos se encarga de buscar al usuario dentro
    de los archivos, y si en caso no se encuentra, lanza una alarma*/
    private void verificarDatos(JTextField usuario, JTextField contraseña, ArrayList arreglo) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.size(); i++) {
            if (usuario.getText().equals(((Usuario) arreglo.get(i)).getNombre()) && contraseña.getText().equals(((Usuario) arreglo.get(i)).getContraseña())) {
                acceso((Usuario) arreglo.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            usuario.setText("");
            contraseña.setText("");
        }
    }

    /*Es en encargado de dejar la entrada al usuario cuando este existe, dependiendo si se trata de un pasajero 
    o algun miembro del personal, este se encarga de redirigirlo a la ventana correspondiente de opciones*/
    private void acceso(Usuario user) {

        if (user instanceof Pasajero) {
            prin.accesoPasajero((Pasajero) user);
        } else {
            if (user instanceof Administrador) {
                prin.concederAcceso(user, 1);
            } else if (user instanceof Gerente) {
                //PARA EL GERENTE prin.getVentanaPersonal().getAdministrador().add(prin.getVentanaAdministrador());
                bloquear(1);
                prin.concederAcceso(user, 2);
            } else {
                bloquear(1);
                bloquear(2);
                prin.concederAcceso(user, 3);
            }
        }
    }
//Se encarga de bloquear las opciones de Administrador o Gerente, dependiendo del tipo de usuario que este queriendo acceder
    private void bloquear(int i) {
        Component[] componentes;
        if (i == 1) {
            componentes = ((JComponent) prin.getVentanaPersonal().getAdministrador()).getComponents();
        } else {
            componentes = ((JComponent) prin.getVentanaPersonal().getGerente()).getComponents();
        }

        for (int j = 0; j < componentes.length; j++) {
            componentes[j].setVisible(false);
        }
        prin.getVentanaPersonal().validate();
        prin.getVentanaPersonal().pack();
    }
}
