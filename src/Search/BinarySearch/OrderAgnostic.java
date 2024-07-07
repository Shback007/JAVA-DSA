package Search.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={345,78,45,21,14,2,1,0};
        System.out.println(ogbs(arr,21));
    }

    static int ogbs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc= arr[start] < arr[end];


        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2;
            // Might be possible start+end exceeds range ofjava
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;



    }
}
