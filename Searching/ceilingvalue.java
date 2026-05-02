package com.Algorithms.BinarySearch;
//Find Smallest Letter Greater Than Target
public class ceilingvalue {
    public static void main(String[] args) {
        int []arr={12,19,23,56,84,95,98};
        int target=99;
        int ans=ceil(arr,target);
        System.out.println(ans);
    }
    static int ceil(int []arr,int target){
        int start=0;
        int end=arr.length-1;

//        if(target>arr[end]){
//            return -1;
//        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        if(start==arr.length){
            return -1;
        }
        return start;
    }
}
