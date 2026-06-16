package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class P17_Letter_Combinations_PhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
    static String []map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static public List<String> letterCombinations(String up) {
        if(up.isEmpty()){
            return new ArrayList<String>();
        }
        return helper("",up,0);
    }
    static public ArrayList<String> helper(String p,String up,int idx){
        if(idx==up.length()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit=up.charAt(idx)-'0';
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<map[digit].length();i++){
            char ch=map[digit].charAt(i);
            ArrayList<String>temp=helper(p+ch,up,idx+1);
            ans.addAll(temp);

        }
        return ans;
    }
}
