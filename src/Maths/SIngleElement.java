package Maths;

public class SIngleElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,5,4,3,1,2,8};
        System.out.println(Single(arr));
    }

    static int Single(int [] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
}
