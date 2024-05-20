package ex_2604;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {
        double a ,b,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input 1");
        a=sc.nextInt();
        System.out.println("Enter the input 2");
        b=sc.nextInt();
        char operator;
        System.out.println("Enter the operator +,-,*,/,%");
        operator=sc.next().charAt(0);

switch(operator)
        {
            case '+':
        result=a+b;
        System.out.println(a+"+"+b+" ="+result);
        break;
            case '-':
                result=a-b;
                System.out.println(a+"-"+b+" ="+result);
                break;
            case '*':
                result=a*b;
                System.out.println(a+"*"+b+" ="+result);
                break;
            case '/':
                result=a/b;
                System.out.println(a+"/"+b+" ="+result);
                break;
            default:
                System.out.println("Invalid ");
        }
        sc.close();

    }
}
