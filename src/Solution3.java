public class Solution3 {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2,3};
//        int b=search(arr,5);
//        System.out.println(b);
        int a=pivot(arr);
        System.out.println(a+1);
    }
    static int search(int[] arr, int target) {
        int pivot=pivot(arr);
        if(pivot==-1){
            return Bsearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return Bsearch(arr,target,0,pivot-1);
        }

        return Bsearch(arr,target,pivot+1,arr.length-1);

    }

    static int Bsearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }

//    static int pivot(int [] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if( mid<end && arr[mid]>arr[mid+1])
//                return mid;
//            if(mid>start && arr[mid]<arr[mid-1])
//                return mid-1;
//            if(arr[mid]<=arr[start]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//
//        }
//        return -1;
//    }

    static int pivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            //if elements at middle, start are equal just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                if(arr[start]>arr[start+1])
                    return start;

                //What if the elements at start and end were pivot??
                start++;
                //check wheather end is pivot or not
                if(arr[end]<arr[end-1])
                    return end-1;
                end--;
            }
            //left side is sorted,so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
}

