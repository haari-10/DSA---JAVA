package com.Recursion;

public class Program {
    public static void main(String[] args) {
        printrev(5);
    }
    static void print(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        print(x-1);
    }
    static void printrev(int x){
        if(x==0){
            return;
        }

        printrev(x-1);
        System.out.println(x);
    }
    static void printboth(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        printboth(x-1);
        System.out.println(x);
    }

}
