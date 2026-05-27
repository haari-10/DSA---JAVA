package com.Basics;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(12,18));
        System.out.println(lcm(12,18));
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
