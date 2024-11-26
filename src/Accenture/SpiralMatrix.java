package Accenture;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        System.out.println(karleBhai(matrix,5,4));
    }
    public static ArrayList<Integer> karleBhai(int[][] matrix,int n,int m){
        ArrayList<Integer> ans = new ArrayList<>(m*n);
        int count=0;
        int startcol=0;
        int startrow=0;
        int endcol=m-1;
        int endrow=n-1;
        while(count<m*n){
            for (int i = startcol; i <=endcol && count<m*n; i++) {
                ans.add(matrix[startrow][i]);
                count++;
            }
            startrow++;
            for (int i = startrow; i <=endrow && count<m*n; i++) {
                ans.add(matrix[i][endcol]);
                count++;
            }
            endcol--;
            for (int i = endcol; i >=startcol && count<m*n; i--) {
                ans.add(matrix[endrow][i]);
                count++;
            }
            endrow--;
            for (int i = endrow; i >=startrow && count<m*n; i--) {
                ans.add(matrix[i][startcol]);
                count++;
            }
            startcol++;
        }
        return ans;
    }
}
