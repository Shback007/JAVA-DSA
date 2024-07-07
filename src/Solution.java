////import java.io.*;
////import java.util.Scanner;
////public class Solution{
////    static void print24(String str){
////        int h1 = (int)str.charAt(1) - '0';
////        int h2 = (int)str.charAt(0) - '0';
////        System.out.println(h1);
////        int hh = (h2 * 10 + h1 % 10);
////        if (str.charAt(8) == 'A'){
////            if (hh == 12){
////                System.out.print("00");
////                for (int i = 2; i <= 7; i++)
////                    System.out.print(str.charAt(i));
////            }
////            else{
////                for (int i = 0; i <= 7; i++)
////                    System.out.print(str.charAt(i));
////            }
////        }
////        else{
////            if (hh == 12){
////                System.out.print("12");
////                for (int i = 2; i <= 7; i++)
////                    System.out.print(str.charAt(i));
////            }
////            else{
////                hh = hh + 12;
////                System.out.print(hh);
////                for (int i = 2; i <= 7; i++)
////                    System.out.print(str.charAt(i));
////            }
////        }
////    }
////
////
////    // Driver code
////    public static void main (String[] args){
////        Scanner in=new Scanner(System.in);
////        String s=in.next();
////        print24(s);
////    }
////}
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class Solution {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
//        int [] arr=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        Arrays.sort(arr);
//        int ans=lonelyint(arr,n);
//        System.out.println(ans);
//    }
//
//    static int lonelyint(int[]arr,int n){
//        int ans=0;
//        for(int i=0;i<n-1;i+=2){
//            if (arr[i]!=arr[i+1])
//                ans=arr[i];
//        }
//        return ans;
//    }
//}
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> arr) {

        HashSet<Integer> s=new HashSet<Integer>();
        // for(int i =0;i<arr.size()-1;i+=2){
        //     if(arr.get(i)!=arr.get(i+1))
        //         return arr.get(i);
        // }
        // return arr.get(arr.size()-1);
        for(int i:arr){
            if(s.contains(i)){
                s.remove(i);
            }else{
                s.add(i);
            }
        }
        for(int i:s){
            return i;
        }
        return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
