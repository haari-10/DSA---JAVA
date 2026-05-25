package LeetCode;

import java.util.Arrays;

public class P1480_runningSum {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int []ans=runsum(arr);
        System.out.println(Arrays.toString(ans));
    }

     static int[] runsum(int[] arr) {
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
}
