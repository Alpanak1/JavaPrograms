package ex_01052024;

public class Lab125 {
    public static void main(String [] args){

        int[]a=new int[4];
        // defaults = a [0,0,0,0]
        // JVM = |0,0,0,0|
        a[3]=66;
        a[1]=22;
        System.out.println(a[1]);
    }
}
