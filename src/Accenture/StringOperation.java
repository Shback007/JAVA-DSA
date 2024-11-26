package Accenture;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++){
            String name=sc.nextLine();
            int ans=karleBhai(name);
            System.out.println(ans);
        }
    }

    static int karleBhai(String str){
        int len=str.length();
        double sum=0;
        double mask = Math.pow(10,len-1);
        for(int i=0;i<len;i++){
            int c=str.charAt(i);
            sum=mask*c+sum;
            mask/=10;
        }
        return (int)sum;
    }
}
