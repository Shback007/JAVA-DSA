package Accenture;

public class AbsDiff {
    public static void main(String[] args) {
        int []arr = {12,3,14,56,77,13};
        int num=13;
        int diff = 0;
        int ans = findCount(arr,num,diff);
        System.out.println(ans);
    }
    static int findCount(int []arr,int num,int diff){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(num-arr[i])<=diff)
                count++;
        }
        return count > 0 ? count : -1;
    }
}
