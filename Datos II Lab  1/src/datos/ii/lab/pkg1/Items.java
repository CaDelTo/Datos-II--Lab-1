package datos.ii.lab.pkg1;

import java.util.ArrayList;

public class Items {
    public ArrayList<Products> ProductsList = new ArrayList<Products>();

    public Items(){
        this.ProductsList = null;
    }

    public void insertClient(String idCat, String name, String shortDesc, String longDesc, String path){
        int lastPosition = this.ProductsList.size();
        if(lastPosition!=0){
            String lastId = this.ProductsList.get(lastPosition).data;
            int actualId = Integer.parseInt(lastId) + 1;
            Products Node = new Products(idCat +Integer.toString(actualId), idCat, name, shortDesc, longDesc, path);
            this.ProductsList.add(Node);
        }else{
            Products Node = new Products(idCat + "01", idCat, name, shortDesc, longDesc, path);
            this.ProductsList.add(Node);
        }
        
    }

    public static Products searchProduct(ArrayList<Products> list, String target, String tarData){
        int size = list.size();
        if (size != 0){
            int i = 0;
            Boolean found = false;
            while (i<size  || found != false){
                if (tarData == "Id"){
                    if (list.get(i).data == target){
                        found = true;
                    }
                }else if (tarData == "Name"){
                    if (list.get(i).name == target){
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

    public void modifyProduct(ArrayList<Products> list, String tarProduct, String tarSearchProductData, String newValue, String tarModifyData){
        Products Node = searchProduct(list, tarProduct, tarSearchProductData);
        if (Node != null){
            if (tarModifyData == "Name"){
                Node.name = newValue;
            }else if(tarModifyData == "Short Desc"){
                Node.shortDesc = newValue;
            }else if (tarModifyData == "Long Desc"){
                Node.longDesc = newValue;
            }else if (tarModifyData == "Image"){
                Node.path = newValue;
            }
        }else{
            return;
        }
        
    }

    public static ArrayList<Products> showProducts(ArrayList<Products>list , String catId){
        int size = list.size();
        ArrayList<Products> a = new ArrayList<Products>(); 
        for (int i = 0; i<size ; i++){
            if(list.get(i).idCat == catId){
                a.add(list.get(i));
            }
        }
        return a;
    }

    public static int quantityProducts(ArrayList<Products> a, String catId){
        return showProducts(a, catId).size();
    }

}



