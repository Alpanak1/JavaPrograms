package ex_28052024;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
        // List mylist1 = new List();
        // List is an interface , can you create object of List interface?
        // List mylist2 = new ArrayList();
        // List is an interface , can you create object of ArrayList class?
        List mylist = new ArrayList();
        ArrayList mylist1 = new ArrayList();
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll
        mylist.add("Sri");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pramod"); // Duplicate
        mylist.add("Pramod");
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove(2);
        // Removes the first occurrence of the specified element from this list,
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pramod"); // Duplicate
        mylist.add("Pramod");
        System.out.println(mylist);
        mylist.add("Dutta");
        System.out.println(mylist);
        System.out.println(mylist.contains("Dutta"));

        // How to print ?
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        // for each
        for (Object obj : mylist) {
            System.out.println(obj);
        }
    }
}
