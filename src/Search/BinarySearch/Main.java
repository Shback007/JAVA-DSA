package Search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[]arr={-18,-12,-7,0,1,2,3,4,5,6,7,8,9,10,45,356};
        int ans=Bsearch(arr,4);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it doesnt exist
    static int Bsearch(int[]arr,int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2;
            // Might be possible start+end exceeds range ofjava
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
