package com.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,5,8,7,8,6};
        System.out.println(search(arr,8));
    }
    static int search(int []arr,int target){
        return helper( arr,target,0);
    }
    static int helper(int []arr,int target ,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return helper(arr,target,idx+1);

    }
}
