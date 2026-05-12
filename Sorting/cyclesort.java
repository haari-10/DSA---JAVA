package com.Algorithms.Sorting;
import java.util.*;
public class cyclesort {
    public static void main(String[] args) {
        int []arr={15,16,13,17,14};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void cycle(int []arr){
        int i=0;
        while(i<arr.length-1){
            int correct_idx=arr[i]-13;
            if(arr[i]!=arr[correct_idx]){
                swap(arr,i,correct_idx);
            }else{
                i++;
            }
        }
    }
}
