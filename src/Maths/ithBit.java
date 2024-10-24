package Maths;

public class ithBit {
    public static void main(String[] args) {
        int num = 10;
        int i = 2;
        System.out.println((findIthBit(num,i)));
    }
    static int findIthBit(int num, int i) {
        // Create a mask by shifting 1 left by (i-1) positions
        int mask = 1 << (i - 1);

        // Perform bitwise AND and check if the result is non-zero
        return (num & mask) != 0 ? 1 : 0;
    }
}
