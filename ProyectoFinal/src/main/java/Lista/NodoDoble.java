/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.io.Serializable;

/**
 *
 * @author alex
 */
public class NodoDoble<T> implements Serializable {

    int indiceNodo;
    private T contenido;
    private NodoDoble<T> siguiente, anterior;

    public NodoDoble(T contenido) {
        this.contenido = contenido;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoDoble(T contenido, NodoDoble<T> siguiente, NodoDoble anterior) {
        this.contenido = contenido;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public int getIndiceNodo() {
        return indiceNodo;
    }

    public void setIndiceNodo(int indiceNodo) {
        this.indiceNodo = indiceNodo;
    }

}
