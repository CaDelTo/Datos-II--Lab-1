
package datos.ii.lab.pkg1;
import java.util.ArrayList;

public class Node {
    private String data;
    private ArrayList<Node> childs = new ArrayList<Node>();
    
    public Node(String data){
        this.data = data;
        this.childs = new ArrayList<Node>();
    }
    public Node(){}

    public String getData(){
        return data;
    }

    public void addChild(String data) {
        this.childs.add(new Node(data));
    }

    public ArrayList<Node> getChilds() {
        return childs;
    }
    
    
    
}
class Products extends Node{
    private String id, shortDesc, longDesc, path;
    private ArrayList<Products> childs = new ArrayList<Products>();
    public Products(String data, String id, String shortDesc, String longDesc, String path){
        super(data);
        this.id = id;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.path = path;
        
    }
    
    
}

class ProCategories extends Node{
    private String id, cateName;
    private ArrayList<ProCategories> childs = new ArrayList<ProCategories>();
    
    public ProCategories(String data,String id, String cateName){
        super(data);
        this.id = id;
        this.cateName = cateName;
    }

    public String getId(){
        return this.id;
    }
    public String getCateName(){
        return this.cateName;
    }
    
    
}

class Clients extends Node{
    String id, idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, perEmail, eduLevel, incomeRange, address;
    Boolean noEmail, noPhone, noSMS, noMail;

}

class CliCategories extends Node{
    
}
