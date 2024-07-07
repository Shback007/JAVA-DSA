package Methods;

import java.util.Scanner;

public class Armstrong {
     static int sum=0;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        sum=arm(n);
        if(n==sum){
            System.out.println("Armstrong");
        }
        else System.out.println("Not Armstrong");
    }

    static int arm(int n){
        while(n>0){
            int rem=n%10;
            int ans=rem*rem*rem;
            sum+=ans;
            n=n/10;
        }
        return sum;
    }
}
