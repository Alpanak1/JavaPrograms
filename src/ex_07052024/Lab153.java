package ex_07052024;

public class Lab153 {
    public static void main(String[] args) {
        // Non Return with no parameter
        saySomethingPlease();
        // Non return with parameter

        sayHelloToYou();

        // Return with no parameter
        sumOfTwoBad(3, 4);
        // Return with parameter
        int result = sumOfTwoGood(3, 4);
        System.out.println(result);
    }

    static int sumOfTwoGood(int i, int i1) {
        return i+i1;
    }

    static void sumOfTwoBad(int a, int b) {
        System.out.println(a + b);
    }

    static String sayHelloToYou() {
        String name = "Alpana";
        System.out.println("Hello, " + name);
        return name;
    }

    static void saySomethingPlease() {
        System.out.println("Non Return with no parameter");
}}