/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos.ii.lab.pkg1;
import java.util.ArrayList;
/**
 *
 * @author Elsup
 */
public class Node {
    private int data;
    private ArrayList<Node> childs = new ArrayList<Node>();
    
    Node(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    



}
