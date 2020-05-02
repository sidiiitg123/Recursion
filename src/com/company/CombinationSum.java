package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (A.size() == 0) {
            return ans;
        }

        Collections.sort(A);
        ArrayList<Integer> temp = new ArrayList<>();
        combinationSumHelper(A, B, ans, temp, 0);

        return ans;
    }

    private void combinationSumHelper(ArrayList<Integer> a, int b, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int start) {
        if (b < 0) {
            return;
        }

        if (b == 0 && !ans.contains(temp)) {
            ans.add(new ArrayList<>(temp));
        }
        for (int i = start; i < a.size(); i++) {
            temp.add(a.get(i));
            combinationSumHelper(a, b - a.get(i), ans, temp, i);
            temp.remove(temp.size() - 1);
        }

    }
}
