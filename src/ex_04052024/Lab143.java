package ex_04052024;
import  java.util.Scanner;
//program to reverse string using StringBuilder and reverse function
public class Lab143 {
    public static void main(String[] args) {

        // Palindrome - String
        // naman -> reverse  -> naman
        // 1331 -> 1331
        // Malaylam - Palindrome
        // Madam  true, mom
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to check palindrom");
       String user_input=sc.next();

       StringBuilder sb=new StringBuilder(user_input);
      String rev_input= sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_input)){
          System.out.println("It is Palindrom:"+ user_input);
      }
      else{
          System.out.println("Nope!");
      }
    }
}
