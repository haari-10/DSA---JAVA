package com.Recursion;
import java.util.ArrayList;
public class All_indices_of_target {

    public static void main(String[] args) {
        int []arr={1,5,8,7,8,6};
        int target=8;
        ArrayList<Integer>ans=searchAll(arr,target);
        System.out.println(ans);

    }
    static ArrayList<Integer> searchAll(int []arr,int target){
        //ArrayList<Integer>list=new ArrayList<>();
        return helper(arr,target,new ArrayList<>(),0);
    }
    static ArrayList<Integer> helper(int []arr,int target,ArrayList<Integer>list,int idx){
        if(idx== arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        return helper(arr,target,list,idx+1);
    }
}
