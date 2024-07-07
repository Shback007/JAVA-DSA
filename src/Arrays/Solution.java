package Arrays;

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
import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(5);
        for(int i=0;i<5;i++){
            List.add(in.nextInt());
        }
        miniMaxSum(List);


    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long x=0;
        long y=0;
        for(int i =0;i<4;i++){
            x+=arr.get(i);
        }
        for(int i=1;i<5;i++){
            y+=arr.get(i);
        }
        System.out.println(x+" "+y);
    }
}
