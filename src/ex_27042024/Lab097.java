package ex_27042024;
import java.util.Scanner;
public class Lab097 {
    public static void main(String[] args) {


        //  Leap Year Program - 2024
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("it is leap year");
        }else {
            System.out.println("no leap year");
        }
    }
}
