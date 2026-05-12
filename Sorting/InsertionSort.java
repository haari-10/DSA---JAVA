package com.Algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int []arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    static void insertion(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
}
