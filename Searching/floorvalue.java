package com.Algorithms.BinarySearch;

public class floorvalue {
    public static void main(String[] args) {
        int []arr={1,2,58,78,98,258,365};
        int target=100;
        int ans=floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        if(target<arr[start]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target >arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}
