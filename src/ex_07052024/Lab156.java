package ex_07052024;

public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Start of the program:");
        System.out.println("End of the program:");
       main(10);
       main("Alpana");
        String[] a = {"arg1", "arg2"};
        String b = "parameter";
        String result = main(a, b);
        System.out.println(result);
    }

    static void main(int a) {
        System.out.println(a);
    }

    static void main(String a) {
        System.out.println(a);
    }

    static String main(String[] a, String b) {
        System.out.println(a);
        return "Hello";
    }
}