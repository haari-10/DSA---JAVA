package com.Recursion;

import java.util.ArrayList;

public class basicPhonePad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println();
        System.out.println(padlist("","12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ArrayList<String>temp=padlist(p+ch,up.substring(1));
            ans.addAll(temp);
        }
        return ans;
    }
}
