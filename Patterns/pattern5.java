package com.patterns;

public class pattern5 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
