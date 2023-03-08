package datos.ii.lab.pkg1;

import java.util.ArrayList;

public class Users {
    public ArrayList<Clients> ClientsList = new ArrayList<Clients>();

    public Users(){
        this.ClientsList = null;
    }

    public void insertClient(String ida, String idCat, String name, String lastName, String age, String birthDate, String gender, String civilState, String phoneNum, String celPhoneNumber, String perEmail, String eduLevel, String incomeRange, String address, Boolean noEmail, Boolean noPhone, Boolean noSMS, Boolean noMail){
        int lastPosition = this.ClientsList.size();
        if (lastPosition != 0){
            String lastId = this.ClientsList.get(lastPosition).data;
            int actualId = Integer.parseInt(lastId) + 1;
            Clients Node = new Clients(idCat + Integer.toString(actualId), idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, celPhoneNumber, perEmail, eduLevel, incomeRange, address, noEmail, noPhone, noSMS, noMail);
            this.ClientsList.add(Node);
        }else{
            Clients Node = new Clients(idCat + "01", idCat, name, lastName, age, birthDate, gender, civilState, phoneNum, celPhoneNumber, perEmail, eduLevel, incomeRange, address, noEmail, noPhone, noSMS, noMail);
            this.ClientsList.add(Node);
        }
        
    }

    public static Clients searchClient(ArrayList<Clients> list, String target, String tarData){
        int size = list.size();
        if(size != 0){
            int i = 0;
            Boolean found = false;
            while (i<size  || found != false){
                if (tarData == "Id"){
                    if (list.get(i).data == target){
                        found = true;
                    }
                }else if (tarData == "Cell Phone Number"){
                    if (list.get(i).celPhoneNumber == target){
                        found = true;
                    }
                }else if (tarData == "Phone Number"){
                    if (list.get(i).phoneNum == target){
                        found = true;
                    }
                }else if (tarData == "Email"){
                    if (list.get(i).perEmail == target){
                        found = true;
                    }
                }
                i++;
            }
            return list.get(i);
        }else{
            return null;
        }
        
    }

    public void modifyClient(ArrayList<Clients> list, String tarClient, String tarSearchClientData, String newValue, String tarModifyData){
        Clients Node = searchClient(list, tarClient, tarSearchClientData);
        if (Node != null){
            if (tarModifyData == "Name"){
                Node.name = newValue;
            }else if(tarModifyData == "Last Name"){
                Node.lastName = newValue;
            }else if (tarModifyData == "Age"){
                Node.age = newValue;
            }else if (tarModifyData == "Birth Date"){
                Node.birthDate = newValue;
            }else if (tarModifyData == "Gender"){
                Node.gender = newValue;
            }else if (tarModifyData == "Civil State"){
                Node.civilState = newValue;
            }else if (tarModifyData == "Phone Number"){
                Node.phoneNum = newValue;
            }else if (tarModifyData == "Cell Phone Number"){
                Node.celPhoneNumber = newValue;
            }else if (tarModifyData == "Personal Email"){
                Node.perEmail = newValue;
            }else if (tarModifyData == "Educational Level"){
                Node.eduLevel = newValue;
            }else if (tarModifyData == "Income Range"){
                Node.incomeRange = newValue;
            }else if (tarModifyData == "Address"){
                Node.address = newValue;
            }else if (tarModifyData == "No Email Contact"){
                Node.noEmail = Boolean.parseBoolean(newValue);
            }else if (tarModifyData == "No Phone Contact"){
                Node.noPhone = Boolean.parseBoolean(newValue);
            }else if (tarModifyData== "No SMS Contact"){
                Node.noSMS= Boolean.parseBoolean(newValue);
            }else if (tarModifyData == "No Mail Contact"){
                Node.noMail = Boolean.parseBoolean(newValue);
            }
        }else{
            return;
        }
        
    }

    public static ArrayList<Clients> showClients(ArrayList<Clients>list , String catId){
        int size = list.size();
        ArrayList<Clients> a = new ArrayList<Clients>(); 
        for (int i = 0; i<size ; i++){
            if(list.get(i).idCat == catId){
                a.add(list.get(i));
            }
        }
        return a;
    }

    public static int quantityClients(ArrayList<Clients> a, String catId){
        return showClients(a, catId).size();
    }

}
