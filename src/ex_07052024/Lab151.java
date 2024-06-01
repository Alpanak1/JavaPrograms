package ex_07052024;

public class Lab151 {
    public static void main(String[] args) {
        int result=sumOfTwo(2,6);
        System.out.println("sum of number is:" +result);
        String concat=sumOfString("alp","ana");
        System.out.println("sum of string is:" +concat);

    }

    static int sumOfTwo(int a,int b){
        return a+b;
    }
    static String sumOfString(String a,String b){
        return a+b;
    }
}
