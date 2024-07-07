package Arrays;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
