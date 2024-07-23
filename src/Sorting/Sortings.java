package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sortings {
    public static void main(String[] args) {
//        ArrayList<Integer> cars = new ArrayList<Integer>();
        int []arr={5,3,4,1,2};
//        insertion(arr);
//        System.out.println(Arrays.toString(arr));

//        Scanner sc = new Scanner(System.in);
//        int n = 7;
//        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
//        System.out.println("Before sorting array: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        mergeSort(arr, n );
//        System.out.println("After sorting array: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        mergeSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }

    static void insertion(int[]arr){
        for (int i = 0; i <arr.length; i++) {
//            for (int j = i+1 ; j > 0; j--) {
//                if (arr[j] < arr[j-1]) {
//                    swap(arr,j,j-1);
//                }else{
//                    break;
//                }
//            }
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = getMinindex(arr, i, arr.length-1);
            swap(arr,minIndex, i);
        }
    }

     static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for(int i =start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static int getMinindex(int[]arr, int start,int end){
        int min = start;
        for(int i = start;i<=end;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }

    static void bubble(int[]arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void ms( int[] list,int low,int high){
        if(low==high) return;
        int mid=low+(high-low)/2;
        ms(list,low,mid);
        ms(list,mid+1,high);
        merge(list,low,mid,high);
    }

    static void mergeSort(int[] arr,int n){
        ms(arr,0,n-1);
    }

    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        //[ low...mid]
        // [mid+1...high]
        int left = low;
        int right = mid+1;
        while(left<=mid && right <=high){
            if(arr[left] <=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}
