package ex_04052024;

import java.util.Scanner;

public class Lab145_removeDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to remove duplicates:");
        String str=sc.next();
        //String str2="";
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i + 1);
            if (index == -1) {
                sb.append(ch);
            }
        }
        String duplicatesRemoved = sb.toString();
        System.out.println("String after duplicates removed : "
                + duplicatesRemoved);
        }
    }

