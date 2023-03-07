package datos.ii.lab.pkg1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        cliTree A = new cliTree();
        A.insertClient(null, "a", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        A.insertClient(A.root, "B", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, A.root);
        ArrayList<Clients> B = new ArrayList<Clients>();
        B = A.root.childs;

        System.out.println(B.get(0).data);

    }


}
