package com.Recursion;

import java.util.Arrays;

public class MazePathMatrix {
    public static void main(String[] args) {
        boolean [][]map={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][]path=new int[map.length][map[0].length];
        pathprint("",map,0,0,path,1);

    }
    static void pathprint(String p,boolean [][]map,int r,int c,int [][]path,int step){
        if(!map[r][c]){
            return;
        }
        if(r==map.length-1 && c==map[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        map[r][c]=false;
        path[r][c]=step;
        if(r<map.length-1){
            pathprint(p+"D",map,r+1,c,path,step+1);
        }
        if(c<map[0].length-1){
            pathprint(p+"R",map,r,c+1,path,step+1);
        }
        if(r>0){
            pathprint(p+"U",map,r-1,c,path,step+1);
        }
        if(c>0){
            pathprint(p+"L",map,r,c-1,path,step+1);
        }
        map[r][c]=true;
        path[r][c]=0;
    }
}
