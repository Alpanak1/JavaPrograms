package ex_27042024;
import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int f=1;
        for(int i=1;i<=num;i++) {
            f = f * i;
        }
        System.out.println(f);
        sc.close();
    }
}
