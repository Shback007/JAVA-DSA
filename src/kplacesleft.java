import java.util.ArrayList;
import java.util.Arrays;

public class kplacesleft {
    static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        k=k%n;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<k;i++){
            temp.add(arr.get(i));
        }
        for(int i=k;i<n;i++){
            arr.set(i-k,arr.get(i));
        }
        for(int i=n-k;i<n;i++){
            arr.set(i,temp.get(i-(n-k)));
        }
        return (arr);

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(rotateArray(arr,25));
    }
}
