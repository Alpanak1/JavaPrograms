package ex_07052024;

public class Lab157 {
    public static void main(String[] args) {
        f1();
        String[] names={"Alps","Kadam"};
        String []name2= new String[2];
        name2[0]="Sagar";
        name2[1]="Bagal";
        f1(names);
        // Parameter -  any data type
        // Primitive - byte, short, long, float, int, boolean
        // Non-Primitive - String, Arrays
    }
    static void f1(String[] a){
     for (int i=0;i<a.length;i++){
         System.out.println(a[i]);
     }
    }
    static void f1(){
        f2();
        System.out.println("f1");
    }
    static void f2(){
        System.out.println("f2");
    }

}
