package com.Algorithms.LinearSearch;
import java.util.*;
public class String_Linser {
//    static boolean search(String  arr,char target){
//        if(arr.length()==0){
//            return false;
//        }
//        char []ch=arr.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]==target){
//                return true;
//            }
//        }
//        return false;
//    }


//    static boolean search(String str,char ch){
//        if(str.length()==0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch){
//                return true;
//            }
//        }
//        return false;
//    }

    static boolean search(String str,char ch){
        for(char i : str.toCharArray()){
            if(i==ch){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name="Haari";
       char [] ch=name.toCharArray();
       // System.out.println(ch[2]);
        char target='a';
        boolean ans=search(name,target);
        System.out.println(ans);
        //System.out.println(name.isEmpty());
        System.out.println(Arrays.toString(ch));
    }
}
