package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i <26;i++){
//            char ch = (char)('a'+i);
//            series+=ch+" ";
            series+=(char)('a'+i)+" ";
        }
        System.out.println(series);
        System.out.println(Character.isUpperCase('A'));
    }

}
