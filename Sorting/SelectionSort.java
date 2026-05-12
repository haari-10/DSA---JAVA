package com.Algorithms.Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int []arr={-54,51,4,-4,5,1,0};
        Select(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Select(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int maxidx=Midx(arr,last);
            swap(arr,maxidx,last);
        }
    }
    static int Midx(int []arr,int end){
        int max=0;
        for(int i=1;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int []arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}
