
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

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCelPhoneNumber() {
        return celPhoneNumber;
    }

    public void setCelPhoneNumber(String celPhoneNumber) {
        this.celPhoneNumber = celPhoneNumber;
    }

    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public void setIncomeRange(String incomeRange) {
        this.incomeRange = incomeRange;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNoEmail(Boolean noEmail) {
        this.noEmail = noEmail;
    }

    public void setNoPhone(Boolean noPhone) {
        this.noPhone = noPhone;
    }

    public void setNoSMS(Boolean noSMS) {
        this.noSMS = noSMS;
    }

    public void setNoMail(Boolean noMail) {
        this.noMail = noMail;
    }

    public void setChilds(ArrayList<Clients> childs) {
        this.childs = childs;
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
