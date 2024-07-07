package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Store a Roll Number
//        int a=19;
//        //store 5 Roll Number
//        int rno1=23;
//        int rno2=55;
//        int rno3=18;

        //syntax
        //datatype[] vaiable_name=new datatype[size];
//        int[] rnos= new int[5];
//        //or directly
//        int[] rnos2={23,12,45,32,15};
//
//        System.out.println(rnos2[2]);
//
//        String[] arr=new String[4];
//        System.out.println(arr[0]);
        Scanner in = new Scanner(System.in);
//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=233;
//        arr[3]=458;
//        arr[4]=54;
//
//        for(int i=0;i<arr.length;i++)
//            arr[i]=in.nextInt();
//
//        for(int i=0;i<5;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//        System.out.println(Arrays.toString(arr));
//
        //array of objects
        String[] str=new String[4];
        for(int i=0;i< str.length;i++){
            str[i]=in.next();
        }
        str[1]="Sagnik";
        System.out.println(Arrays.toString(str));
    }
}
