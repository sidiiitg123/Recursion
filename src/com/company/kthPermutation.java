package com.company;

import java.util.ArrayList;

public class kthPermutation {
    public long factorial(int n){

        if(n>15){
            return Integer.MAX_VALUE;
        }

        long fact = 1;

        for(int i=2;i<=n;i++){
            fact *= i;
        }

        return fact;
    }

    public String permutate(ArrayList<Integer> input, int k ){

        int n = input.size();
        if(n==0){
            return "";
        }
        if(k>factorial(n)){
            return "";
        }

        int f = (int)factorial(n-1);
        int pos = k/f;
        k%=f;

        String ch = String.valueOf(input.get(pos));
        input.remove(pos);
        return ch+permutate(input,k);
    }

    public String getPermutation(int A, int B) {

        ArrayList<Integer> r = new ArrayList<>();

        for(int i=1;i<=A;i++){
            r.add(i);
        }

        return permutate(r,B-1);
    }
}
