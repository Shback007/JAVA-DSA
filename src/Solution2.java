import Search.BinarySearch.OrderAgnostic;

public class Solution2 {
    public static void main(String[] args) {

    }

    int search(int []arr,int target){
        int peak=FindPeakMountain(arr);
        int firstTry=Bsearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return Bsearch(arr,target,peak+1,arr.length-1);
    }
    static int Bsearch(int[] arr,int target,int start,int end){

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
    static int FindPeakMountain(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        return end;
    }
}
