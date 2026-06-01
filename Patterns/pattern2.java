package com.patterns;

public class pattern2 {
    public static void main(String[] args) {
        triangle(4);

    }
    static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
