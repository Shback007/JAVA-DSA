import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[]candies={2,3,5,1,3};
        int n=3;
        System.out.println(kidsWithCandies(candies,n));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int a=max(candies,extraCandies);
            if(extraCandies+candies[i]>=a)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
    static int max(int[]candies,int extracandies){
        int a=0;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>a) {
                a = candies[i];
            }
        }
        return a;
    }
}
