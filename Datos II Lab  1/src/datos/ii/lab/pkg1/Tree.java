/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos.ii.lab.pkg1;

import javax.crypto.spec.RC2ParameterSpec;

/**
 *
 * @author Elsup
 */
public class Tree {
        
}

class cliCatTree extends Tree{

    CliCategories root;
    public cliCatTree(){
        this.root = null;
    }

    public void addChild(String name, CliCategories tarNode){
        if (root == null){
            root = new CliCategories("01", name);
        }else{
            
            String id = Integer.toString(Integer.parseInt(currentId(searchNodo(root, name)) + 1));
            CliCategories a = searchNodo(root, name);
            a.childs.add(new CliCategories(a.id + id, name));

        }
    }
    public String currentId(CliCategories node){
        int size = node.childs.size();
        if (size != 0){
            return node.childs.get(size-1).id;
        }else{
            return "00";
        }
        
    }

    public CliCategories searchNodo(CliCategories root, String Value){
        if (root == null){
            return null;
        }else if ( root.data == Value){
            return root;
        }else if (root.id == Value){
            return root;
        }
        for (CliCategories child : root.childs){
            CliCategories node = searchNodo(child, Value);
            if (node != null){
                return node;
            }   
        }
        return null;
    }
}

class catProTree extends Tree{
    ProCategories root;
    public catProTree(){
        this.root = null;
    }

    public void addChild(String name, catProTree tarNode){
        if (root == null){
            root = new ProCategories("01", name);
        }else{
            
            String id = Integer.toString(Integer.parseInt(currentId(searchNodo(root, name)) + 1));
            ProCategories a = searchNodo(root, name);
            a.childs.add(new ProCategories(a.id + id, name));

        }
    }
    public String currentId(ProCategories node){
        int size = node.childs.size();
        if (size != 0){
            return node.childs.get(size-1).id;
        }else{
            return "00";
        }
        
    }

    public ProCategories searchNodo(ProCategories root, String Value){
        if (root == null){
            return null;
        }else if ( root.data == Value){
            return root;
        }else if (root.id == Value){
            return root;
        }
        for (ProCategories child : root.childs){
            ProCategories node = searchNodo(child, Value);
            if (node != null){
                return node;
            }   
        }
        return null;
    }
}