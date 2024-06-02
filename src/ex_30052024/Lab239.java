package ex_30052024;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class Lab239 {
    public static void main(String[] args) {
        List ttacourselist=new ArrayList();
        ttacourselist.add("Java");
        ttacourselist.add("JDBC");
        ttacourselist.add("JSP");
        ttacourselist.add(123);
        ttacourselist.add(true);
        ttacourselist.add(3.14f);
      //  Iterator iterator = ttacourseList.iterator();
//        while (iterator.hasNext()) {
//            ttacourseList.add("pramod");
//            System.out.println(iterator.next());
//        }

//        for (Object course :ttacourseList){
//            System.out.println(course);
//        }
//
//        for (int i = 0; i < ttacourseList.size() ; i++) {
//            System.out.println(ttacourseList.get(i));
//        }
//
//        // List - ArrayList, LinkedList
//        ListIterator lt = ttacourseList.listIterator();
//        while(lt.hasNext()){
//            lt.add("Gen AI");
//            System.out.println(lt.next());
//        }

        // ATB, MTB, PyATB, LAPIT, SDET Blueprint
        ListIterator lt1=ttacourselist.listIterator(ttacourselist.size());
    while(lt1.hasNext()) {
        lt1.add("Gen AI");
        //System.out.println(lt2.hasPrevious());
    }

        System.out.println(ttacourselist);
    }}

