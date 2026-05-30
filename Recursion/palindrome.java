package com.Recursion;

public class palindrome {
    public static void main(String []args){
        System.out.println(palindrome(121));
    }
    static boolean palindrome(int n){
        if(n==0){
            return true;
        }
        if(n<0){
            return false;
        }
        int digits=(int)Math.log10(n);
        return helper(n,digits);

    }
    static boolean helper(int n,int digits){
        int div=(int)Math.pow(10,digits);
        int s=n/div;
        int e=n%10;
        if(n%10== n){
            return true;
        }
        if(s!=e){
            return false;
        }

        return helper((n%div)/10,digits-2);
    }
}
