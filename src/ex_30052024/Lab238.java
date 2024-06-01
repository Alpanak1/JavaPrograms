package ex_30052024;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {
    public static void main(String[] args) {
        // List - ArrayList, LinkedList, Vector,Stack
        // Set - HashSet, LinkedHashSet, TreeSet
        // Map - HashMap, LinkedHashMap, TreeMap
        // Queue - PriorityQueue, LinkedList
        // Hashtable, Properties
        List<String> courselist=new ArrayList<>();
        courselist.add("Java");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LAPIB");
        courselist.add("SDET Blueprint");

        List numlist=new ArrayList();
        numlist.add(10);
        numlist.add(20);
        numlist.add(30);

        courselist.addAll(numlist);
        System.out.println(courselist);
    }
}
