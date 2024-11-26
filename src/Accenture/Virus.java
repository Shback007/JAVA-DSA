package Accenture;

import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            String str = sc.nextLine();
            if(checkVirus(str))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
    public static boolean checkVirus(String str){
        int len = str.length();
        for (int i = 0; i+4<len ; i+=2) {
            if(str.charAt(i)!=str.charAt(i+2)||str.charAt(i)!=str.charAt(i+4)) return false;
        }
        return true;
    }
}
