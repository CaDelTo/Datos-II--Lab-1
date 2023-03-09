
package datos.ii.lab.pkg1;
import java.util.ArrayList;

public class Node {
    String data;
    
    public Node(String data){
        this.data = data;
    }
    public Node(){}

    public String getData(){
        return data;
    }
    
}
class Products extends Node{
    String idCat, name, shortDesc, longDesc, path;
    public Products(String data, String idCat,String name, String shortDesc, String longDesc, String path){
        super(data);
        this.name = name;
        this.idCat = idCat;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.path = path;
        
    }
    public String getIdCat() {
        return idCat;
    }
    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }
    public String getShortDesc() {
        return shortDesc;
    }
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
    public String getLongDesc() {
        return longDesc;
    }
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    
    
    
}

class ProCategories extends Node{
    String id, cateName;
    ArrayList<ProCategories> childs = new ArrayList<ProCategories>();
    
    public ProCategories(String id, String cateName){
        super(id);
        this.cateName = cateName;
        this.childs = null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    
    
    
}

class Clients extends Node{
    String idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, celPhoneNumber, perEmail, eduLevel, incomeRange, address;
    Boolean noEmail, noPhone, noSMS, noMail;
    ArrayList <Clients> childs = new ArrayList<Clients>();

    public Clients(String id, String idCat, String name, String lastName, String age, String birthDate, String gender, String civilState, String phoneNum, String celPhoneNumber, String perEmail, String eduLevel, String incomeRange, String Address
    ,Boolean noEmail, Boolean noPhone, Boolean noSMS, Boolean noMail){
        super(id);
        this.idCat = idCat;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
        this.gender = gender; 
        this.civilState = civilState;
        this.phoneNum = phoneNum;
        this.celPhoneNumber = celPhoneNumber;
        this.perEmail = perEmail;
        this.eduLevel = eduLevel;
        this.incomeRange = incomeRange;
        this.address = Address;
        this.noEmail = noEmail;
        this.noPhone = noPhone;
        this.noSMS = noSMS;
        this.noMail = noMail;

    }
}

class CliCategories extends Node{
    ArrayList<CliCategories> childs = new ArrayList<CliCategories>();
    String id;
    public CliCategories(String id, String name){
        super(name);
        this.id = id;
        this.childs = null;
    }
}
