package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sagnik Hore";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('g'));
        System.out.println("             Sagnik        ".strip());
    }
}
