package Maths;

public class EvenOdd {
    public static void main(String[] args) {
        int num=45;
        System.out.println(evenOdd(num));
    }
    static boolean evenOdd(int num){
        return ((num & 1) == 1);
    }
}
