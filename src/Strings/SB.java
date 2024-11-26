package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(5);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        revString("Hello");
    }

    public static void revString(String str){
        StringBuilder sb= new StringBuilder(str);
        for (int i = 0; i < sb.length()/2; i++) {
            int back = sb.length() -1 -i;
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);
            sb.setCharAt(i,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
