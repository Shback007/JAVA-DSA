package Com.sagnik;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        long num = in.nextLong();
        long rev, temp;
        temp = num;
        rev = 0;

        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        if (num == rev)
            System.out.println("The number " + num + " is Palindrome");
        else
            System.out.println("The number " + num + "is not palindrome ");
    }
}
