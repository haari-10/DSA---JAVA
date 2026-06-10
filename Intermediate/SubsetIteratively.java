package com.Intermediate;

import java.util.ArrayList;

public class SubsetIteratively {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(subset(arr));
    }
    static ArrayList<ArrayList<Integer>>subset(int []arr){
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int n=outer.size();
            for(int j=0;j<n;j++){
                ArrayList<Integer>p=new ArrayList<>(outer.get(j));
                p.add(arr[i]);
                outer.add(p);
            }
        }
        return outer;
    }
}
