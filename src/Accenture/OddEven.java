package Accenture;

import java.util.*;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Arrays to store even-indexed and odd-indexed elements
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Input elements of the matrix
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at " + i + " index: ");
            int element = sc.nextInt();

            // Separate elements into even-indexed and odd-indexed arrays
            if (i % 2 == 0) {
                even.add(element);
            } else {
                odd.add(element);
            }
        }

        // Sort both arrays
        Collections.sort(even);
        Collections.sort(odd);

        // Output sorted arrays
        System.out.print("Sorted even array: ");
        for (int e : even) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.print("Sorted odd array: ");
        for (int o : odd) {
            System.out.print(o + " ");
        }
        System.out.println();

        // Find the second-largest element from both sorted arrays
        int secondLargestEven = (even.size() >= 2) ? even.get(even.size() - 2) : even.get(0);
        int secondLargestOdd = (odd.size() >= 2) ? odd.get(odd.size() - 2) : odd.get(0);

        // Calculate the sum of second-largest elements
        int sum = secondLargestEven + secondLargestOdd;

        // Output the result
        System.out.println(sum);
    }
}

