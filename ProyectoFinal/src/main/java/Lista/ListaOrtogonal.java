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
public class ListaOrtogonal<T> implements Serializable {

    private NodoDoble<T> primerNodo;
    private NodoDoble<T> ultimoNodo;
    private int ultimoIndice;

    public void add(T contendio) {
        ultimoIndice++;

        if (esVacia()) {
            primerNodo = ultimoNodo = new NodoDoble<>(contendio);
        } else {
            ultimoNodo = new NodoDoble<>(contendio, null, ultimoNodo);
            ultimoNodo.getAnterior().setSiguiente(ultimoNodo);
        }
    }
    
        public void addFirst(T contendio) {
        ultimoIndice++;

        if (esVacia()) {
            primerNodo = ultimoNodo = new NodoDoble<>(contendio);
        } else {
            primerNodo = new NodoDoble<>(contendio, primerNodo, null);
            primerNodo.getSiguiente().setAnterior(primerNodo);
        }
    }

    public boolean esIndiceValido(int indice) {
        return !(indice < 0 || indice >= ultimoIndice);
    }

    public void insertar(T contenido, int indice) {
        if (!esIndiceValido(indice)) {
            System.out.println("indiceChueco " + indice + "tamañoDeLista: " + ultimoIndice);
        }
        if (indice == 0) {
            addFirst(contenido);
        } else if (indice == (ultimoIndice - 1)) {
            add(contenido);
        } else {
            NodoDoble<T> anterior = obtenerPorIndice(indice - 1);
            NodoDoble<T> actual = obtenerPorIndice(indice);
            NodoDoble<T> temporal = new NodoDoble<>(contenido, actual, anterior);
            anterior.setSiguiente(temporal);
            ultimoIndice++;
        }
    }

    public void eliminarUltimo() {
        if (esVacia()) {

        }
        if (primerNodo.equals(ultimoNodo)) {
            primerNodo = null;
            ultimoNodo = null;
        } else {
            NodoDoble<T> penultimo = obtenerPorIndice(ultimoIndice - 2);
            penultimo.setSiguiente(null);
            ultimoNodo = penultimo;
        }
        ultimoIndice--;
    }

    public void eliminarPrimero() {
        if (esVacia()) {

        }
        if (primerNodo.equals(ultimoNodo)) {
            primerNodo = null;
            ultimoNodo = null;
        } else {
            primerNodo = primerNodo.getSiguiente();
        }
        ultimoIndice--;
    }

    public int getSize() {
        return ultimoIndice;
    }

    public boolean esVacia() {
        return primerNodo == null;
    }

    public NodoDoble<T> obtenerPorIndice(int indice) {
        if (esIndiceValido(indice) == false) {

        }
        NodoDoble<T> buscado = primerNodo;
        for (int i = 0; i < indice; i++) {
            buscado = buscado.getSiguiente();
        }
        return buscado;
    }

    public void eliminar(int indice) {
        if (esVacia() || esIndiceValido(indice) == false) {
        } else if (indice == 0) {
            eliminarPrimero();
        } else if (indice == (ultimoIndice - 1)) {
            eliminarUltimo();
        } else {
            NodoDoble<T> nodoAnterior = obtenerPorIndice(indice - 1);
            NodoDoble<T> nodoActual = obtenerPorIndice(indice);
            NodoDoble<T> nodoSiguiente = nodoActual.getSiguiente();
            nodoActual = null;
            nodoAnterior.setSiguiente(nodoSiguiente);
            ultimoIndice--;
        }
    }

    public T get(int indice) {
        if (esIndiceValido(indice) == false) {

        }
        NodoDoble<T> buscado = primerNodo;
        for (int i = 0; i < indice; i++) {
            buscado = buscado.getSiguiente();
        }
        return buscado.getContenido();
    }

    public void modifica(T contenido, int indice) {
        if (esVacia() || esIndiceValido(indice) == false) {
        } else {

            obtenerPorIndice(indice).setContenido(contenido);

        }
    }

    public boolean existe(T contenido) {
        if (esVacia()) {
            return false;
        } else {
            NodoDoble<T> temporal = primerNodo;
            while (temporal != null) {
                if (contenido == temporal.getContenido()) {
                    return true;
                }
                temporal = temporal.getSiguiente();
            }

        }
        return false;
    }

    public int indexOf(T contenido) {
        if (esVacia()) {
            return -1;
        } else {
            NodoDoble<T> temporal = primerNodo;
            int contador = 0;
            while (temporal != null) {
                if (contenido == temporal.getContenido()) {
                    return contador;
                }
                contador++;
                temporal = temporal.getSiguiente();
            }

        }
        return -1;
    }

//        public void asignaIndices() {
//            Nodo<T> buscado = primerNodo;
//            buscado.setIndiceNodo(0);
//            for (int i = 0; i < ultimoIndice; i++) {
//                buscado = buscado.getSiguiente();
//                buscado.setIndiceNodo(i + 1);
//            }
//        }
    public NodoDoble<T> getPrimerNodo() {
        return primerNodo;
    }

    public T getFirst() {
        return primerNodo.getContenido();
    }

    public T getLast() {
        return ultimoNodo.getContenido();
    }

    public void setFirst(T content) {
        primerNodo.setContenido(content);
    }

    public void setLast(T content) {
        ultimoNodo.setContenido(content);
    }

    public void setPrimerNodo(NodoDoble<T> primerNodo) {
        this.primerNodo = primerNodo;
    }

    public NodoDoble<T> getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(NodoDoble<T> ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

}
