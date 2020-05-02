package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetII {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());
        if (A.size() == 0) {
            return output;
        }

        Collections.sort(A);
        ArrayList<Integer> temp= new ArrayList<>();
        generate(A, output, temp, 0);
        return output;
    }

    public void generate(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index) {
        for (int i = index; i < A.size(); i++) {
            temp.add(A.get(i));
            if(!output.contains(temp)){
                output.add(new ArrayList<>(temp));
            }
            generate(A, output, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
