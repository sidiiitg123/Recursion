package com.company;

import java.util.ArrayList;

public class GrayArr {


    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> result= new ArrayList<>();

        for(int i=0;i<Math.pow(2,a);i++){

             int res=i^(i>>1);
             result.add(res);
        }
        return result;
    }
}
