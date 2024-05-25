package ex_23042024;
import java.util.Scanner;
public class Lab074 {
    public static void main(String[] args) {
// Taking an input from the user.
        // Scanner Class -
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+"It is even number");
        }
        else{
            System.out.println(num+"it is odd");
        }
    }
}
