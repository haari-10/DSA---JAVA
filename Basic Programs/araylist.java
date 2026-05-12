package com.haari;
import java.util.*;
public class araylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        ArrayList<Integer> list=new ArrayList<>(10);
//        for (int i=0;i<5;i++){
//            list.add(sc.nextInt());
//        }
//        for(int i=0;i<5;i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println(list.size());
        ArrayList<ArrayList<Integer>> list =new ArrayList<>(3);
        for(int i = 0; i < 3; i++){
            ArrayList<Integer> row = new ArrayList<>();
            list.add(row);
        }
//        for(int i=0;i<3;i++){
//            list.get(i).add(sc.nextInt());  // size of each sub array is 1
//        }
        for(int i=0;i<list.size();i++){
            int cols=sc.nextInt();
            for(int j=0;j<cols;j++){
                list.get(i).add(sc.nextInt());
            }
        }
//      list.get(0).add(10);
        System.out.println(list);
//        System.out.println(list.size());
    }
}
