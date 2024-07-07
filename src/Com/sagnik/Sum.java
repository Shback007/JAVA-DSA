package Com.sagnik;

import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1=input.nextInt();
        System.out.print("Enter Second Number");
        int num2=input.nextInt();

        float num3 = (float)(num1+num2);

        System.out.println("The sum of "+num1+" and "+num2+" is "+num3);
    }
}