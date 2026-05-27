package com.Recursion;

public class gcd_lcm_recursion {
    public static void main(String[] args) {
        System.out.println(gcd(12,16));
        System.out.println(lcm(12,18));
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
