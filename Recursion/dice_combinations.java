package com.Recursion;

import java.util.ArrayList;

public class dice_combinations {
    public static void main(String[] args) {
        //comb("",4);
        System.out.println(combo("",7));
        System.out.println(count("",7));
    }
    static void comb(String p,int up){
        if(up==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=up&&up<=6;i--){
            comb(p+i,up-i);
        }
    }
    static ArrayList<String> combo(String p,int up){
        if(up==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        for(int i=1;i<=up&&i<=6;i++){
            ans.addAll(combo(p+i,up-i));
        }
        return ans;
    }
    static int count(String p,int up){
        if(up==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=up && i<=6;i++){
            count =count+count(p+i,up-i);
        }
        return count;
    }
}
