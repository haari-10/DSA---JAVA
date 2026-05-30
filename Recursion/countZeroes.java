package com.Recursion;

public class countZeroes {
    public static void main(String[] args) {
        System.out.println(zeroes(0));

    }
    static int zeroes(int n){
        int c=0;
        if(n==0){
            return 1;
        }
        return helper(n,c);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
