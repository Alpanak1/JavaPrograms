package ex_28052024;

import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
    // Shopping List
    // Milk, Bread, Butter, Cheese.
    // 4 elements
    // Collection Framework -> How you can store the elements
    // 1. List (Interface) ->ArrayList, LinkedList, Vector, Stack
        List shoppingList= List.of("Milk", "Bread", "Butter", "Cheese");

        System.out.println(shoppingList);
        // length
        System.out.println(shoppingList.size());
        List fruits=List.of("Mango", "Banana", "Orange");
        System.out.println(fruits);
        System.out.println("size of List"+fruits.size());
        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("Banana"));
        System.out.printf(String.valueOf(fruits.isEmpty()));


        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll


        fruits.add("grapes");
        System.out.println(fruits);
    }
}
