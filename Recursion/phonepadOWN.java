package com.Recursion;

import java.util.ArrayList;

public class phonepadOWN {
    public static void main(String[] args) {
        ArrayList<String>list=combo("","");

        System.out.println(list.size());
    }
    static ArrayList<String> combo(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        int digit=up.charAt(0)-'0';
        String []map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<map[digit].length();i++){
            char c=map[digit].charAt(i);
            ArrayList<String>temp=combo(p+c,up.substring(1));
            ans.addAll(temp);

        }
        return ans;
    }
}
