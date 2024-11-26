package Recursion;

public class RevNum {
    public static void main(String[] args) {
        System.out.println(reverse(789,0));
    }

    public static int reverse(int n,int reversed){
        if (n==0)
            return reversed;
        int digit = n%10;
        reversed = reversed*10+digit;
        return reverse(n/10,reversed);
    }
}
