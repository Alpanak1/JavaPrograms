package ex_04052024;

public class Lab139 {
    public static void main(String[] args){
        int[][] array1={
                {2,4},
                {5,6},
                {1,8}
        };
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.println(array1[i][j]);
            }
        }
    }
}
