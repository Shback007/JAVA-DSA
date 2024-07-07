package Methods;

import java.util.Scanner;

public class Main {

    //return the value
    static int sum(int a,int b){
        return a+b;
    }
    //prints the sum
  static void sum(){
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the first no:");
      int num1=in.nextInt();
      System.out.print("Enter the Second number:");
      int num2= in.nextInt();
      System.out.println("The sum is:"+(num1+num2));
  }

    public static void main(String[] args) {
//        sum();
        // Q: take input of 2 numbers and print the sum

        int ans=sum(20,30);
        System.out.println("The sum is:"+ans);
    }
}


