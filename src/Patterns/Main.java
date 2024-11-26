package Patterns;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=0;i <2*n;i++){
            int totalColsInRow=i>n ? 2*n-i:i;
            for(int col=0; col < totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int i=0;i <2*n;i++){
            int totalColsInRow=i>n ? 2*n-i:i;

            int noOfSpaces = n-totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for(int col=0; col < totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=n; row++) {

            for (int space = 0; space <n-row ; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <=2*n; row++) {

            int c= row>n ? 2*n-row:row;

            for (int space = 0; space <n-c ; space++) {
                System.out.print(" ");
            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=c ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int OriginalN = n;
        n=2*n-2;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <=n; col++) {
                int atEveryIndex =OriginalN-Math.min(row,Math.min(col,Math.min(n-row,n-col)));
                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();
        }
    }
}
