package ex_07052024;

public class Lab150 {
    public static void main(String[] args) {

        // No Return Type - Functions - define -> call
        // Return Something
        int result = sum_of_two_number();
        System.out.println(result);

        String revstr = rev();
        System.out.println("Reverse string is " + revstr);
    }

    static int sum_of_two_number() {
        return 5 + 6;

    }

    static String rev() {
        String str = "abcdefg";
        String revstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            revstr = ch + revstr;
          //  return revstr;

        }

        return revstr;
    }

}