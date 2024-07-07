package Com.sagnik;

import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check for prime:");
        int num=in.nextInt();
        if(num<=1){
            System.out.println("Neither Prime nor Composite");
            return;
        }

        int c=2,flag=1;
        while (c*c<=num){
            if(num%c==0){
                flag=0;
                break;
            }
            c++;
        }
        if(flag==1)
            System.out.println("Prime");
        else System.out.println("Non-Prime");
    }
}
