package com.Recursion;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        int []arr={1,2,3};
        ArrayList<ArrayList<Integer>>ans=subset(new ArrayList<Integer>(),arr,0);
        for(ArrayList<Integer> i: ans){
            System.out.println(i);
        }

    }
    static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer>p,int[] up,int idx){
        if(idx==up.length){
            ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
            ans.add(new ArrayList<Integer>(p));
            return ans;
        }
        ArrayList<Integer>take=new ArrayList<>(p);
        take.add(up[idx]);
        ArrayList<ArrayList<Integer>>left= subset(take,up,idx+1);
        ArrayList<ArrayList<Integer>>right=subset(p,up,idx+1);
        left.addAll(right);
        return left;


    }
}
