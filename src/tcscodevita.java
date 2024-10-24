import java.util.*;

public class tcscodevita{
    public static  void sortWithFewerSwaps(int[] arr) {
        int n = arr.length;
        int[] copyArr = arr.clone(); // Make a copy of the original array

        int ascendingSwaps = 0;
        int descendingSwaps = 0;
        boolean ascendingSwapped, descendingSwapped;

        for (int i = 0; i < n - 1; i++) {
            ascendingSwapped = false;
            descendingSwapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Check for ascending sort
                if (arr[j] > arr[j + 1]) {
                    // Swap for ascending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    ascendingSwaps++;
                    ascendingSwapped = true;
                }
                // Check for descending sort
                if (copyArr[j] < copyArr[j + 1]) {
                    // Swap for descending order
                    int temp = copyArr[j];
                    copyArr[j] = copyArr[j + 1];
                    copyArr[j + 1] = temp;
                    descendingSwaps++;
                    descendingSwapped = true;
                }
            }

            // If no swaps were made, both arrays are sorted early
            if (!ascendingSwapped && !descendingSwapped) break;
        }

        // Return the result based on fewer swaps
        if (ascendingSwaps <= descendingSwaps) {
            System.out.println(ascendingSwaps);
        } else {
            System.out.println(descendingSwaps);
        }
    }
    public static void inputSpaceSeparated() {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt(); // Read the number of elements
        scanner.nextLine(); // Consume the newline character

        String input = scanner.nextLine();
        String[] strArr = input.split("\\s+");

        // Ensure the number of elements matches the input
        if (strArr.length != numElements) {
            System.out.println("Error: The number of elements entered does not match the input.");
            return;
        }

        int[] arr = new int[numElements];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        sortWithFewerSwaps(arr);
    }
    public static void main(String[] args){
        inputSpaceSeparated();
    }


}