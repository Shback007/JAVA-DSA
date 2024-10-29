package Strings;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(KarleBhai2(s));


    }
    public static String KarleBhai(String str) {
        StringBuilder word = new StringBuilder();
        word.append(toggleCase(str.charAt(0)));

        for(int i=1;i< str.length();i++){
            char c = str.charAt(i);

            if(Character.isUpperCase(c)){
                System.out.println(word);
                word = new StringBuilder();
                word.append(toggleCase(c));
            }else{
                word.append(toggleCase(c));
            }
        }
        return word.toString();

    }
    public static char toggleCase(char c){
        if(Character.isUpperCase(c)){
            return Character.toLowerCase(c);
        }
        else{
            return  Character.toUpperCase(c);
        }
    }
    public static String KarleBhai2(String str) {
        StringBuilder word= new StringBuilder();
        word.append(toggleCase(str.charAt(0)));

        for(int i=1;i< str.length();i++){
            char c = str.charAt(i);

            if(Character.isUpperCase(c)){
                System.out.println(word);
                word = new StringBuilder();
            }
            word.append(toggleCase(c));
        }
        return word.toString();
        }
}
