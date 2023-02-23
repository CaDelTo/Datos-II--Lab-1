/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication60;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elsup
 */
public class PruebaIterarArchivos {


    public static void main(String[] args) {
        Node root = new Node("Raíz");

        String rutaPrincipal = "src\\Genero";

        
        Fill(root, rutaPrincipal);

        
        imprimirArbol(root, "");
        // Obtener los valores de los nodos hoja
        List<String> valoresHoja = obtenerValoresHoja(root);

        // Imprimir los valores de los nodos hoja
        for (String valor : valoresHoja) {
            System.out.println(valor);
        }
    }

    public static void Fill(Node actNode, String actPath) {
        File[] archivos = new File(actPath).listFiles();

        for (File archivo : archivos) {
            Node newNode = new Node(archivo.getName());

            if (archivo.isDirectory()) {
                actNode.addChild(newNode);
                Fill(newNode, archivo.getPath());
            }
            
            else {
                
                actNode.addChild(newNode);
            }
        }
    }

    public static void imprimirArbol(Node actNode, String indentacion) {
        System.out.println(indentacion + actNode.getData());

        for (Node hijo : actNode.getChilds()) {
            imprimirArbol(hijo, indentacion + "  ");
        }
    }
    public static List<String> obtenerValoresHoja(Node nodoActual) {
        List<String> valoresHoja = new ArrayList<>();

        // Si el nodo actual es hoja (no tiene hijos)
        if (nodoActual.getChilds().isEmpty()) {
            // Obtener el contenido del archivo con el nombre del nodo
            String contenido = obtenerContenidoArchivo(nodoActual.getData());
            // Si el contenido no es nulo, agregarlo a la lista de valores hoja
            if (contenido != null) {
                valoresHoja.add(contenido);
            }
        }
        // Si el nodo actual tiene hijos
        else {
            // Para cada hijo del nodo actual
            for (Node hijo : nodoActual.getChilds()) {
                // Llamar al método recursivamente para obtener los valores hoja del subárbol
                valoresHoja.addAll(obtenerValoresHoja(hijo));
            }
        }

        return valoresHoja;
    }

    // Método para obtener el contenido de un archivo
    public static String obtenerContenidoArchivo(String nombreArchivo) {
        String contenido = null;

        try {
            // Crear un objeto File con el nombre del archivo
            File archivo = new File(nombreArchivo);
            // Crear un objeto FileReader con el archivo
            FileReader fr = new FileReader(archivo);
            // Crear un objeto BufferedReader con el FileReader
            BufferedReader br = new BufferedReader(fr);
            String linea;
        StringBuilder sb = new StringBuilder();

        // Leer cada línea del archivo y agregarla al StringBuilder
        while ((linea = br.readLine()) != null) {
            sb.append(linea);
            sb.append(System.lineSeparator());
        }

        // Cerrar el BufferedReader y el FileReader
        br.close();
        fr.close();

        // Asignar el contenido del StringBuilder a la variable de contenido
        contenido = sb.toString();
    } catch (Exception e) {
        // Si ocurre algún error al leer el archivo, imprimir el mensaje de error
        System.err.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
    }

    return contenido;
    }
}

class Node {
    private String data;
    private List<Node> childs;

    public Node(String data) {
        this.data = data;
        this.childs = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void addChild(Node nodo) {
        childs.add(nodo);
    }

    public List<Node> getChilds() {
        return childs;
    }
}

