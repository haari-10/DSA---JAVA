package com.Recursion;

public class permutsOfString__printing {
    public static void main(String[] args) {
        permuts("","abc");
    }
    static void permuts(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permuts(s+ch+f,up.substring(1));
        }
    }
}
