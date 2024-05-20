package ex_04052024;

import java.util.Scanner;
//program to reverse string using charAt
public class Lab144_reverseString {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str=sc.next();
        //String str="Alpana";
        String revstr="";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            revstr = ch + revstr ;
        }
        System.out.println("Original word: "+str);
        System.out.println("Reversed word: " + revstr);
    }
}
