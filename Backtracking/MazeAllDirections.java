package com.Recursion;

import java.util.ArrayList;

public class MazeAllDirections {
    public static void main(String[] args) {
        boolean [][]map={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allpath("",map,0,0);

    }
    static void allpath(String p,boolean [][]map,int r,int c){
        if(!map[r][c]){
            return;
        }
        // map[r][c]=false;
        if(r==map.length-1 && c==map[0].length-1){
            System.out.println(p);
            return;
        }
       map[r][c]=false;
        if(r<map.length-1){
            allpath(p+"D",map,r+1,c);
        }
        if(c<map[0].length-1){
            allpath(p+"R",map,r,c+1);
        }
        if(r>0){
            allpath(p+"U",map,r-1,c);
        }
        if(c>0){
            allpath(p+"L",map,r,c-1);
        }
        map[r][c]=true;
    }

}
