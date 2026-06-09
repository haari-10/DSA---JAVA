package com.Recursion;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String>list=new ArrayList<>();
        subarray("",str,list);
        System.out.println(list);
    }
    static void sub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sub(p+ch,up.substring(1));
        sub(p,up.substring(1));
    }
    static ArrayList<String> subarray(String p, String up,ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        subarray(p+ch,up.substring(1),list);
        subarray(p,up.substring(1),list);
        return list;
    }

}
