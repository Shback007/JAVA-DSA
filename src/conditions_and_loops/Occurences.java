package conditions_and_loops;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int a=138393;
        int count=0,n;
        n=in.nextInt();
        while(a>0){
            int rem=(a%10);
            if (rem==n) {
                count++;
            }
            a/=10;
        }
        System.out.println(count);
    }
}
