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
        
}

class cliTree extends Tree{

    Clients root;
    
    public cliTree(){
        this.root = null;
    }
    public static Clients searchNode(Clients root, String Target){
        if (root.getData() == Target || root.getName() + root.getLastName() == Target){
            return root;
        }
        for (Clients child : root.getChilds()){
            Clients result = searchNode(child, Target);
            if (result != null){
                return result;
            }

        }
        return null;
    }

    public void insertClient (Clients Root, String ida, String idCat, String name, String lastName, String age, String birthDate, String gender, String civilState, String phoneNum, String perEmail, String eduLevel, String incomeRange, String address, Boolean noEmail, Boolean noPhone, Boolean noSMS, Boolean noMail , Clients tarNode){
        
        Clients A = new Clients(ida, idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, perEmail, eduLevel, incomeRange, address, noEmail, noPhone, noSMS, noMail);
        
        if(this.root == null){
            this.root = A;
        }else{
            if (root.data == tarNode.data){
                Root.addChild(A);
                return;
            }
            
            for(Clients child : Root.getChilds()){
                insertClient(child, ida, idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, perEmail, eduLevel, incomeRange, address, noEmail, noPhone, noSMS, noMail, tarNode);
            }
        }
    }
    public void modifyClient(Clients tarClient, String tarData, String newValue){
    //Ahorita se me ocurre
    }
    public Clients getRoot() {
        return root;
    }

    
}

class catProtree extends Tree{
    
}