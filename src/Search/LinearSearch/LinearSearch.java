package Search.LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums={23,45,23,12,54,23,12,53,-1,12,53,-9,53,-24};
        int target=-1;
        int ans=linearSearch(nums,target);
        int ans2=linearSearch2(nums,target);
        boolean ans3=linearSearch3(nums,target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    //search in the array :return index if found
    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0)
            return -1;


        for (int i = 0; i < arr.length;i++){
            //check for element  at evry index
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        //this line will execute if none executes
        return -1;
    }
    static int linearSearch2(int[] arr,int target) {


        for (int element : arr) {
            //check for element  at evry index
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none executes
        return -1;
    }
    static boolean linearSearch3(int[] arr, int target) {


        for (int element : arr) {
            //check for element  at evry index
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none executes
        return false;
    }
}
