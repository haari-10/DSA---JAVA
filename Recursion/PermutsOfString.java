package com.Recursion;

import java.util.ArrayList;

public class PermutsOfString {
    public static void main(String[] args) {
        System.out.println(permuts("","abc"));

    }
    static ArrayList<String> permuts(String p, String up ){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){

           ans.addAll(permuts(p.substring(0,i)+ch+p.substring(i,p.length()),up.substring(1)));

        }
        return ans;

    }
}
