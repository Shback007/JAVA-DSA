package Accenture;

import java.util.Scanner;

public class RatFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int unit = sc.nextInt();
        int n=sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans= countFood(n,arr,unit,r);
        System.out.println(ans);
    }
    static int countFood(int n,int []arr,int unit,int r){
        int req_food = r*unit;
        int i=0;
        int avail_food=0;
        if(n==0)
            return -1;
        while(req_food>=avail_food){
            if(i>n-1)
                return 0;
            avail_food+=arr[i];
            i++;
        }

        return i;
    }
}
