package Accenture;

public class SmallestPairProduct {
    public static void main(String[] args) {
        int sum=9;
        int []arr = {5,2,4,3,9,7,1};
        int ans= productsmallestpair(sum,arr);
        System.out.println(ans);
    }
    static int  productsmallestpair(int sum,int[]arr){
        if(arr.length < 2)
            return 0;
        int firstMin=Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<firstMin){
                secondMin=firstMin;
                firstMin=arr[i];
            } else if(arr[i]<secondMin){
                secondMin=arr[i];
            }
        }
        if(firstMin+secondMin<=sum){
            return firstMin*secondMin;
        }
        return 0;
    }
}
