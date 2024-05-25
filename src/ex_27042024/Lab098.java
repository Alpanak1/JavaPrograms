package ex_27042024;
import java.util.Scanner;
public class Lab098 {
    public static void main(String[] args) {
        // Program to Check if a Number is Prime or Not
        // Loop also -  from 1 to 100 - Loop
        checkPrime(1);
        checkPrime(3);
        checkPrime(17);

    }

    static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }

    }
}

