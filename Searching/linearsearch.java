package com.Algorithms.LinearSearch;

public class linearsearch {
//    static int linSer(int [] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
    static boolean linSer(int [] arr,int target){
        for(int i: arr){
            if(i==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,8,7,5,9};
        int target=8;
        boolean ans=linSer(nums,target);
        System.out.println(ans);


    }
}
