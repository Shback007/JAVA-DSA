package Search.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr={3,5,7,9,10,90,100,130,140,160,170,200,210,220,240};
        int target=5;
        try {
            System.out.println(ans(arr, target));
        }
        catch (Exception e){
            System.out.println("The target may be the last element or the target is not present in the Array");
        }
    }
    static int ans(int[] arr,int target){
        //find the range
        //first start with a box of size 2

        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp=end+1;//new start
            //double the box value
            //end=previous end +sizeofbox*2
            end=end+(end-start)*2;
            start=temp;
        }
        return Bsearch(arr,target,start,end);
    }

    static int Bsearch(int[]arr,int target,int start,int end) {
        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2;
            // Might be possible start+end exceeds range of
            // java
            int mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if (target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
