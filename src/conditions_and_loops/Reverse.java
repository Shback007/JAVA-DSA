package conditions_and_loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int rem=0;
        while(n!=0){
            rem=rem*10+n%10;
            n/=10;
        }
        System.out.println(rem);
    }
}
