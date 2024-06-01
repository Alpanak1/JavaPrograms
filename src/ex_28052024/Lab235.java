package ex_28052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab235 {
    public static void main(String[] args) {
        ArrayList mylist1=new ArrayList();
        List mylist2=new ArrayList();
        SequencedCollection mylist3=new ArrayList();
        Collection mylist4=new ArrayList();
        // ArrayList - Behind the scen it users, Dynamic Array
        // Size filled around 90, it double the size automatically

        // Size is Dynamic
        // Duplicate is allowed
        // Insertion Order is preserved
        // Heterogeneous Objects are allowed
        // Null insertion is possible
        mylist2.add("Pramod");
        mylist2.add("Anusha");
        mylist2.add("Kiran");
        System.out.println(mylist2);

        mylist2.add("Pramod");
        mylist2.add("Pramod");
        mylist2.add("Pramod");
        mylist2.add(null);
        mylist2.add(null);
        System.out.println(mylist2);

        System.out.println(mylist2.size());
        mylist2.remove("Pramod");
        System.out.println(mylist2);
    }
}
