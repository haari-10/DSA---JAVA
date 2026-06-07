package com.Recursion;

import java.util.Arrays;

public class QuickSortLomuto {

    public static void main(String[] args) {

        int[] arr = {4,3,2,5,7,9,1,6};

        quick(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr,int low,int high){

        if(low >= high){
            return;
        }

        int p = partition(arr,low,high);

        quick(arr,low,p-1);
        quick(arr,p+1,high);
    }

    static int partition(int[] arr,int low,int high){

        int pivot = arr[high];

        int i = low;

        for(int j=low;j<high;j++){

            if(arr[j] < pivot){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}
