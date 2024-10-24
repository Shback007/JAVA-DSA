package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String a="";
        System.out.println(palindrome(a));
        System.out.println(isPalindrome(a));
    }
    static boolean palindrome(String a){
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.reverse();
        return a.contentEquals(builder);
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
}
