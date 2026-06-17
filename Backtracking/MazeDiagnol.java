package com.Recursion;

import java.util.ArrayList;

public class MazeDiagnol {
    public static void main(String[] args) {
        System.out.println(pathcount(3,3));
        System.out.println(pathlist("",3,3));

    }
    static int pathcount(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=pathcount(r-1,c);
        int right=pathcount(r,c-1);
        int diag=pathcount(r-1,c-1);
        return down+right+diag;
    }
    static ArrayList<String> pathlist(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(r>1){
            ArrayList<String>left=pathlist(p+'D',r-1,c);
            ans.addAll(left);
        }
        if(c>1){
            ArrayList<String>right=pathlist(p+'R',r,c-1);
            ans.addAll(right);
        }
        if(c>1 && r>1){
            ArrayList<String>diag=pathlist(p+'d',r-1,c-1);
            ans.addAll(diag);
        }
        return ans;
    }
    static void paths(String p,int r,int c){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            paths(p+'D',r-1,c);
        }
        if(c>1){
            paths(p+'R',r,c-1);
        }
        if(r>1 && c>1){
            paths(p+'d',r-1,c-1);
        }
    }
}
