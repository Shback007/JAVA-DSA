package Search.LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxMinWealth {
    public static void main(String[] args) {
        int[][]chodu={
                {1,2,3},
                {4,5,6},
                {3,20,6}};
        System.out.println(maximumWealth(chodu));
    }
     static int maximumWealth(int[][] accounts) {
        int temp=0,ans;
        for(int i=0;i<accounts.length;i++){
            ans=Sum(accounts[i]);
            if(temp<ans){
                temp = ans;
            }
        }
        return temp;
    }
    static int Sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

