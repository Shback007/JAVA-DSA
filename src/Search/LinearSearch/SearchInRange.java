package Search.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int start=1;
        int end=4;
        int target=3;
        int [] arr={18,12,-7,3,14,28};
        int ans=search(arr,start,end,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
