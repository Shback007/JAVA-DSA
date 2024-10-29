package Accenture;

public class ReplaceChar {
    public static void main(String[] args) {
        replaceChar("apples",'a','p')   ;
    }
    public static void replaceChar(String str,char a,char b){
        String res ="";
            for (int i=0;i<str.length();i++) {
                if (str.charAt(i) == a)
                    res = res + b;
                else if (str.charAt(i) == b)
                    res = res + a;
                else
                    res= res+ str.charAt(i);
            }
        System.out.println(res);
    }
}
