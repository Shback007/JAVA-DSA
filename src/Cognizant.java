import java.util.Scanner;

public class Cognizant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of cuts: ");
        int n = sc.nextInt();
        int a = findMaxPieces(n);
        System.out.println(a);
    }
    static int findMaxPieces(int n){
        int x = n/2;
        return ((x+1) * (n-x+1));
    }
}
