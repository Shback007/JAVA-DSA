package conditions_and_loops;


import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c= in.nextInt();

//        int max=Math.max(a,Math.max(b,c));
//        System.out.println(max);
        if(a>=b && a>=c)
            System.out.println(a + " is largest");
        else if(b>=a && b>=c)
            System.out.println(b+" is largest");
        else
            System.out.println(c+" is largest");

    }
}
