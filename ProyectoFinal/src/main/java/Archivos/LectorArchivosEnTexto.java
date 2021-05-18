/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Programa.Principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author richard
 */
public class LectorArchivosEnTexto<T> {

    private Principal prin;

    public LectorArchivosEnTexto(Principal prin) {
        this.prin = prin;
    }

//File=archivo
    //FileReader necesita a un archivo para poder leerlo
    //BufferedReader lee el texto del archivo
    public ArrayList<T> leerFichero(File archivo, String tipo) throws FileNotFoundException, IOException {
        ArrayList<T> objetos = new ArrayList<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            String[] campos = separarCampos(linea, tipo.toUpperCase()+"(");
            //pasamos el texto a objeto
            T objeto = (T) prin.getControlCrearObjetos().crearObjetos(tipo,campos);
            if (objeto != null) {
                objetos.add(objeto);
            }
            
        }
        fr.close();
        return objetos;
    }

    private String[] separarCampos(String linea, String inicio) {
        String lineaDeCampos = linea.substring(inicio.length(), linea.length() - 2);
       // System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
}
