package Accenture;
import java.util.*;
public class CountFreq {
//    public static void main(String[] args) {
//        String str = "aabbbbcaccddd";
//        System.out.println(Compressed(str));
//    }
//    public static String Compressed(String str){
//        StringBuilder sb = new StringBuilder();
//        int count = 1;
//
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i)==str.charAt(i-1)){
//                count++;
//            }
//            else{
//                sb.append(str.charAt(i-1)).append(count);
//                count=1;
//            }
//        }
//        sb.append(str.charAt(str.length()-1)).append(count);
//        return sb.toString();
//    }
    public static void main(String[] args) {
        String str = "aaaabbbbcaccceeee";
        String result = compressStringUsingHashing(str);
        System.out.println(result);
    }

    public static String compressStringUsingHashing(String str) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the string and count character frequencies
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Build the compressed string
        StringBuilder compressed = new StringBuilder();
//        for (char ch : frequencyMap.keySet()) {
//            compressed.append(ch).append(frequencyMap.get(ch));
//        }
        for(Map.Entry<Character,Integer> entry :frequencyMap.entrySet()){
            compressed.append(entry.getKey()).append(entry.getValue());
        }

        return compressed.toString();
    }
}
