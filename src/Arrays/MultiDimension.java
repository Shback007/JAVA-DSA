package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //2d array
        int[][] arr=new int[3][3];

//        int[][] arr={
//                {1,2,3},//0th index
//                {4,5,6},//1st index
//                {7,8,9}//2nd index
//        };
//        System.out.println(Arrays.toString(arr[1]));
        //input
        for(int i=0;i< arr.length;i++){
            //for each column
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int[]a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
