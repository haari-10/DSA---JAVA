package com.Algorithms.LinearSearch;

public class rangeLinSer {
    static int rangeSearch(int []arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,678,9};
        int target=6;
        int ans=rangeSearch(arr,8,5,target);
        System.out.println(ans);

    }
}
