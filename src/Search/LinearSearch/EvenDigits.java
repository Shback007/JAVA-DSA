package Search.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[]arr={12,145,2453,123,53};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check even or not
    static boolean even(int num) {

        int count=digits(num)+1;
        return count % 2 == 0;
    }
    static int digits(int num){
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
        return (int)(Math.log10(num));
    }
}
