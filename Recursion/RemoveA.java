package com.Recursion;

public class RemoveA {
    public static void main(String[] args) {
        String str=remove("haari");
        //skipA(str,"");
        System.out.println(str);
    }
    static void skipA(String str,String empty){
        if(str.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch=str.charAt(0);
        if(ch!='a'){
            skipA(str.substring(1),empty+ch);
        }else{
            skipA(str.substring(1),empty);
        }
    }
    static String remove(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch!='a'){
            return ch+remove(str.substring(1));
        }else{
            return remove(str.substring(1));
        }
    }
}
