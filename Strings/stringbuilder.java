package com.Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            name.append(ch);
        }
        name.reverse();
        System.out.println(name.toString());
    }
}
