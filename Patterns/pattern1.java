package com.patterns;

public class pattern1 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
