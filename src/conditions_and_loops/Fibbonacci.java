package conditions_and_loops;
import java.util.Scanner;
public class Fibbonacci {
        static int fib(int n){
            if(n<=1)
                return n;
            else
               return fib(n-1)+fib(n-2);
        }

    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter the term you want to print fibbonacci series: ");
            int n=in.nextInt();
            for(int i=0;i<=n;i++) {
                int a = fib(i);
                System.out.print(a+" ");
            }

    }
}
