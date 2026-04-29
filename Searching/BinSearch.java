package com.Algorithms.BinarySearch;
import java.util.*;
public class BinSearch {
    public static void main(String[] args) {
        int []arr={0,1,5,8};
        int target=5;
        int ans=bin(arr,target);
        System.out.println(ans);
    }
    static int bin(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
