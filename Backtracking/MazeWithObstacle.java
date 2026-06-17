package com.Recursion;

import java.util.ArrayList;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean [][]map={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(maze2("",map,0,0));
    }
    static void maze(String p,boolean [][]map,int r,int c){
        if(!map[r][c]){
            return;
        }
        if(r==map.length-1 && c==map[0].length-1){
            System.out.println(p);
            return;
        }
        if(r<map.length-1){
            maze(p+"D",map,r+1,c);
        }
        if(c<map[0].length-1){
            maze(p+"R",map,r,c+1);
        }
    }
    static ArrayList<String> maze2(String p, boolean [][]map, int r, int c){
        if(!map[r][c]){
            return new ArrayList<String>();
        }

        if(r==map.length-1 && c==map[0].length-1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();

        if(r<map.length-1){
            list.addAll(maze2(p+"D",map,r+1,c));
        }
        if(c<map[0].length-1){
            list.addAll(maze2(p+"R",map,r,c+1));
        }
        return list;
    }
}
