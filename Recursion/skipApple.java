package com.Recursion;

public class skipApple {
    public static void main(String[] args) {
        String str=remove("bdapplejk");
        System.out.println(str);

    }
    static String remove(String str){
        if(str.isEmpty()){
            return "";

        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return remove(str.substring(3));
        }else{
            return str.charAt(0)+remove(str.substring(1));
        }
    }
}
