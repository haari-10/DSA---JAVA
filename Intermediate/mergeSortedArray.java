package com.Intermediate;
import java.util.*;
public class mergeSortedArray {
    public static void main(String[] args) {
        int []arr1={1};
        int []arr2={};
        int []ans=merge(arr1,arr2);
        System.out.println(Arrays.toString(ans));

    }
    static int[] merge(int []arr1,int []arr2){
        int i=0;
        int j=0;
        int k=0;
        int []arr3=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;

        }
        return arr3;
    }
}
