package com.Algorithms.Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={5,2,1,3,4};
        int []ans=bubsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int [] bubsort(int []arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
    static void swap(int [] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
