package com.Recursion;

public class Max_elem_Array {
    public static void main(String[] args) {
        int arr[]={2,6,3,1};
        System.out.println(max(arr,1,0));
    }
    static int max(int []arr,int r,int max){
        if(r==arr.length){
            return arr[max];
        }
        if(arr[r]>arr[max]){
            return max(arr,r+1,r);
        }
        return max(arr,r+1,max);
        
    }
}
