
package ex_28052024;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab236 {
    public static void main(String[] args) {
        List mylist1=new ArrayList();
         mylist1.add("Sri");
         mylist1.add("Nivas");
         mylist1.add(123);
        System.out.println(mylist1);

        Vector v=new Vector();
        v.add("Pramod"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran"); // t1
        v.remove("Kiran"); // t1

        // can you guess the o/p?

        System.out.println(v);
    }
}
