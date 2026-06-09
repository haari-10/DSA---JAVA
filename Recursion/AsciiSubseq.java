package com.Recursion;

import java.util.ArrayList;

public class AsciiSubseq {
    public static void main(String[] args) {
 //       voidascii("","abc");
        System.out.println(ascii("","aaa"));

    }
    static void voidascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        voidascii(p+ch,up.substring(1));
        voidascii(p,up.substring(1));
        voidascii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> ascii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>first= ascii(p+ch,up.substring(1));
        ArrayList<String>second= ascii(p,up.substring(1));
        ArrayList<String>third=ascii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
