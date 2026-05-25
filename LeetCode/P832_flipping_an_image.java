package LeetCode;

import java.util.Arrays;

public class P832_flipping_an_image {
    public static void main(String[] args) {
        int arr[][]={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        qwe(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
    static void reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=1^arr[start];
            arr[start]=1^arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    static int[][] qwe(int [][]arr){
        for(int i=0;i<arr.length;i++){
            reverse(arr[i]);
        }
        return arr;
    }
}
