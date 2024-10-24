package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sagnik";
        String b = "Sagnik";

        System.out.println(a == b);

        String c = new String("Sagnik");
        String d = new String("Sagnik");

        System.out.println(c==d);

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        System.out.println(c.charAt(3));
    }
}
