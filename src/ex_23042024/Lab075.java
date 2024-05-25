package ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1=sc.nextInt();

        System.out.println("Enter num 2");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+ "is NAX number");
        }
        else{
            System.out.println(num2+"  is MAX num");
        }
        sc.close();
    }
}
