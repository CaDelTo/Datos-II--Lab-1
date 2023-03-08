/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos.ii.lab.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Elsup
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Window w1 = new Window();
        w1.setVisible(true);
    }

    public void insertClient(ArrayList list){
        int lastPosition = list.size();
        System.out.println(lastPosition);
    }

    
}

