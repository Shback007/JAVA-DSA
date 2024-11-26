package  Accenture;
import java.util.*;

 public class NumFreq {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr.add(value);
        }
        PrintFreq(arr,n);
    }
    public static void PrintFreq(ArrayList<Integer> arr,int n){
        Map<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
//            if(mpp.containsKey(arr.get(i))){
//                mpp.put(arr.get(i),mpp.get(arr.get(i))+1 );
//            }
//            else{
//                mpp.put(arr.get(i),1);
//            }
            mpp.put(arr.get(i),mpp.getOrDefault(arr.get(i),0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            System.out.println(entry.getKey() +" occurs "+entry.getValue() +" times");
        }
    }
}
