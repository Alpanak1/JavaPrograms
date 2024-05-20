package ex_18042024;

public class Lab035 {
    public static void main(String[] args) {

        // || - OR
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

    }
}
