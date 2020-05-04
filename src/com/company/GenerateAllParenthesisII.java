package com.company;

import java.util.ArrayList;

public class GenerateAllParenthesisII {
    public void recur(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> a, ArrayList<Integer> temp){

        if(a.size() == 0){
            res.add(new ArrayList<>(temp));
        }

        for(int i=0; i<a.size(); i++){
            temp.add(a.get(i)); //once i add i'll make a copy and delete added item and then send the rest.
            ArrayList<Integer> acopy = new ArrayList<>(a);
            acopy.remove(a.get(i));
            recur(res, acopy, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        recur(res, A, temp);
        return res;
    }
}
