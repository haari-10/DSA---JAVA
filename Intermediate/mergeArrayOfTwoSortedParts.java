package com.Intermediate;

import java.util.Arrays;

public class mergeArrayOfTwoSortedParts {
    public static void main(String[] args) {
        int []arr={5,0};
        merge(arr,0,0,1);
        System.out.println(Arrays.toString(arr));


    }
    static void merge(int[]arr,int s,int m,int e){
        int mix[]=new int[e-s+1];
        int i=s;
        int j=m+1;
        int k=0;
        while(i<=m && j<=e){
            if(arr[i]<=arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=s;l<=e;l++){
            arr[l]=mix[l-s];
        }

    }
}
