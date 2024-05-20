package ex_04052024;

public class Lab136 {
    public static void main(String[] args){
        int [] arr={10,11,5};
        int[] arr2=new int[3];

        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i]*2;
        }
    System.out.println("Printing arrays");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr2[i]);
        }

    }
}
