/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication60;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elsup
 */
public class JavaApplication60 {


    public static void main(String[] args) {
        Nodo raiz = new Nodo("Raíz");

        String rutaPrincipal = "F:\\Proyectos\\Datos-II--Lab-1\\JavaApplication60\\src\\Genero";

        
        crearArbolNario(raiz, rutaPrincipal);

        
        imprimirArbol(raiz, "");
    }

    public static void crearArbolNario(Nodo nodoActual, String rutaActual) {
        File[] archivos = new File(rutaActual).listFiles();

        for (File archivo : archivos) {
            Nodo nuevoNodo = new Nodo(archivo.getName());

            if (archivo.isDirectory()) {
                nodoActual.agregarHijo(nuevoNodo);
                crearArbolNario(nuevoNodo, archivo.getPath());
            }
            
            else {
                
                nodoActual.agregarHijo(nuevoNodo);
            }
        }
    }

    public static void imprimirArbol(Nodo nodoActual, String indentacion) {
        System.out.println(indentacion + nodoActual.getNombre());

        for (Nodo hijo : nodoActual.getHijos()) {
            imprimirArbol(hijo, indentacion + "  ");
        }
    }
}

class Nodo {
    private String nombre;
    private List<Nodo> hijos;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarHijo(Nodo nodo) {
        hijos.add(nodo);
    }

    public List<Nodo> getHijos() {
        return hijos;
    }
}

