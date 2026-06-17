package com.Recursion;

public class phonePad_count {
    public static void main(String[] args) {
        System.out.println(count("","23",0));
    }
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int count(String p,String up,int idx){
        if(idx==up.length()){
            return 1;
        }
        int digit=up.charAt(idx)-'0';
        int count=0;
        for(int i=0;i<map[digit].length();i++){
            char ch=map[digit].charAt(i);
            count=count+count(p+ch,up,idx+1);
        }
        return count;
    }
}
