/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos.ii.lab.pkg1;

/**
 *
 * @author Elsup
 */
public class Tree {
    private Node root;
    
    public Tree(){
        this.root = null;
    }
    
    public void insert(Node Root, String tarNode){
        if(root == null){
            root = Root;
        }else{
            if (root.getData() == tarNode){
                Root.addChild(tarNode);
                return;
            }
            
            for(Node child : Root.getChilds()){
                insert(child, tarNode);
            }
        }
    }
    
}

class cTree extends Tree{
    
}
