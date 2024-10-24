import java.util.Arrays;

public class Solution3 {
    public static int[] moveZeros(int n, int []arr) {
        // Write your code here.
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                Swap(arr,i,j);
                j++;
            }
        }
        return arr;
    }

    public static void Swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int []arr={1,0,2,0,3,0,4,0};
        int len= arr.length;
        int []result = moveZeros(len,arr);
        System.out.println(Arrays.toString(result));

    }
}
