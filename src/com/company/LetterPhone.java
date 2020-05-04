package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterPhone {
    public ArrayList<String> letterCombinations(String A) {
        Map<Integer,String> map=new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        ArrayList<String> output=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generate(A,0,map,output,sb);

        return output;
    }
    public void generate(String A ,int position,Map<Integer,String> map,ArrayList<String> output,StringBuilder sb){

        if(position>A.length()){
            return;
        }
        if (position==A.length()&& sb.length()==A.length()){
            output.add(new StringBuilder(sb.toString()).toString());
        }

        for(int i=position;i<A.length();i++){
           int k=Integer.valueOf(Character.toString(A.charAt(i)));
           String stringFromMapping=map.get(k);

           for(int j =0;j<stringFromMapping.length();j++){
               sb.append(stringFromMapping.charAt(j));
               generate(A,i+1,map,output,sb);
               sb.deleteCharAt(sb.length()-1);
           }
        }
    }
}
