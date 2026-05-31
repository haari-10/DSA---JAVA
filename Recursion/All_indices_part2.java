package com.Recursion;
import java.util.ArrayList;
public class All_indices_part2 {
    public static void main(String[] args) {
        int []arr={1,2,4,4,5};
        int target=4;
        System.out.println(searchall(arr,target,0));
    }
    static ArrayList<Integer> searchall(int[]arr,int target,int idx){
        ArrayList<Integer>list=new ArrayList<>();
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        ArrayList<Integer>ans= searchall(arr,target,idx+1);
        list.addAll(ans);
        return list;
    }
}
