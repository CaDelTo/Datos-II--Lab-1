
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
    String id, cateName;
    ArrayList<ProCategories> childs = new ArrayList<ProCategories>();
    
    public ProCategories(String id, String cateName){
        super(id);
        this.id = id;
        this.cateName = cateName;
        this.childs = null;

    }

    public String getId(){
        return this.id;
    }
    public String getCateName(){
        return this.cateName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public void setChilds(ArrayList<ProCategories> childs) {
        this.childs = childs;
    }
    
    
    
}

class Clients extends Node{
    String idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, perEmail, eduLevel, incomeRange, address;
    Boolean noEmail, noPhone, noSMS, noMail;
    ArrayList <Clients> childs = new ArrayList<Clients>();



    public Clients(String id, String idCat, String name, String lastName, String age, String birthDate, String gender, String civilState, String phoneNum, String perEmail, String eduLevel, String incomeRange, String Address
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
        this.perEmail = perEmail;
        this.eduLevel = eduLevel;
        this.incomeRange = incomeRange;
        this.address = Address;
        this.noEmail = noEmail;
        this.noPhone = noPhone;
        this.noSMS = noSMS;
        this.noMail = noMail;

    }



    public String getIdCat() {
        return idCat;
    }



    public String getName() {
        return name;
    }



    public String getLastName() {
        return lastName;
    }



    public String getAge() {
        return age;
    }



    public String getBirthDate() {
        return birthDate;
    }



    public String getGender() {
        return gender;
    }



    public String getCivilState() {
        return civilState;
    }



    public String getPhoneNum() {
        return phoneNum;
    }



    public String getPerEmail() {
        return perEmail;
    }



    public String getEduLevel() {
        return eduLevel;
    }



    public String getIncomeRange() {
        return incomeRange;
    }



    public String getAddress() {
        return address;
    }



    public Boolean getNoEmail() {
        return noEmail;
    }



    public Boolean getNoPhone() {
        return noPhone;
    }



    public Boolean getNoSMS() {
        return noSMS;
    }



    public Boolean getNoMail() {
        return noMail;
    }



    public ArrayList<Clients> getChilds() {
        return childs;
    }



    public void addChild(Clients A) {
        this.childs.add(A);
    }
    


}


class CliCategories extends Node{
    private ArrayList<CliCategories> childs = new ArrayList<CliCategories>();
}
