package Search.BinarySearch;
//leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1163272379/
public class CelingArray {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j' };
        char ans = nextGreatestLetter(arr, 'x');
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start%arr.length];
//        if (start == arr.length)
//            return arr[0];
//        else
//            return arr[start];
    }
}
