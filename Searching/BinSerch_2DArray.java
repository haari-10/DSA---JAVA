package com.Algorithms.BinarySearch;
import java.util.Arrays;
public class BinSerch_2DArray {
    public static void main(String [] args){
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9,}
        };
        int target=28;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int [] search(int [][]arr,int target){
        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
