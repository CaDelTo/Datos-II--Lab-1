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
        Node root = new Node("Root");

        Fill(root, "Datos-II--Lab-1\\JavaApplication60\\src\\Genero");
        
        imprimirArbol(root, "");
        List<String> valoresHoja = obtenerValoresHoja(root);
        for (String valor : valoresHoja) {
            System.out.println(valor);
        }
    }

    public static void Fill(Node actNode, String actPath) {
        File[] archivos = new File(actPath).listFiles();
        for (File archivoActual : archivos) {
            Node newNode = new Node(archivoActual.getName());

            if (archivoActual.isDirectory()) {
                actNode.addChild(newNode);
                Fill(newNode, archivoActual.getPath());
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
        if (nodoActual.getChilds().isEmpty()) {
            String contenido = obtenerContenidoArchivo(nodoActual.getData());
            if (contenido != null) {
                valoresHoja.add(contenido);
            }
        }
        else {
            for (Node hijo : nodoActual.getChilds()) {
                valoresHoja.addAll(obtenerValoresHoja(hijo));
            }
        }

        return valoresHoja;
    }

    public static String obtenerContenidoArchivo(String nombreArchivo) {
        String contenido = null;

        try {
            //Aca debo buscar la ruta del archivo mas bien
            //Da error pq no encuentra el archivo en si, debo guardar la ruta primero
            File archivo = new File(nombreArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
        StringBuilder sb = new StringBuilder();

        while ((linea = br.readLine()) != null) {
            sb.append(linea);
            sb.append(System.lineSeparator());
        }

        br.close();
        fr.close();

        contenido = sb.toString();
    } catch (Exception e) {
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

