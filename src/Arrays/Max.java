package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,78,18};
        System.out.println(maxRange(arr,2,4));
    }

    static int maxRange(int[] arr,int start,int end) {
        int max=arr[0];
        for(int i = start;i<end;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

     static int max(int[] arr) {
        if(arr.length==0)
            return -1;
         int max=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }


}
