package com.Recursion;

public class reverseAnumber {
    public static void main(String[] args) {
        //System.out.println(reverse(1234));
        System.out.println(reverse2(1234));
    }
    static int reverse(int n){
        if(n%10==n){
            return n;
        }
        int m=(int)Math.log10(n);
        int rem=n%10;
        return rem*(int)Math.pow(10,m)+reverse(n/10);

    }
    static int reverse2(int n){
        int digits=(int)Math.log10(n);
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits)+helper(n/10,digits-1);
    }
}
