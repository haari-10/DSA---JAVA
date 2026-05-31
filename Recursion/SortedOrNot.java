package com.Recursion;

public class SortedOrNot {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,5};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int [] arr){
        return helper(arr,0);
    }
    static boolean helper(int []arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return helper(arr,i+1);
    }
}
