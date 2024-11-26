package Accenture;

import java.util.Scanner;

public class Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char result = getConsonent(str,size);
        System.out.println(result);
    }
    public static char getConsonent(String str,int size){

        int conscount=0;
        for(int i=size-1;i>=0;i--){
            char ch = str.charAt(i);
            if(isConsonent(ch)){
                conscount++;
            }
            if (conscount==3){
                return ch;
            }
        }
        return '\0';
    }
    public static boolean isConsonent(char c){
        c=Character.toLowerCase(c);
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            if(vowels.charAt(i)==c){
                return false;
            }
        }
        return true;
    }
}
