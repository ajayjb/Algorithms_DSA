package com.ajay.BitwiseOperater;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(make(5));
    }
    static ArrayList<ArrayList<Integer>> make(int n){
        ArrayList<ArrayList<Integer>> pascalArr = new ArrayList<ArrayList<Integer>>(1);

        if (n==0){
            return pascalArr;
        }

        pascalArr.add(new ArrayList<>());
        pascalArr.get(0).add(0,1);

        if (n==1){
            return pascalArr;
        }

        pascalArr.add(new ArrayList<>());
        pascalArr.get(1).add(0,1);
        pascalArr.get(1).add(1,1);

        if (n==2){
            return pascalArr;
        }

        for(int i=2; i<n; i++){
            ArrayList<Integer> previous = pascalArr.get(i-1);
            pascalArr.add(new ArrayList<Integer>());
            pascalArr.get(i).add(1);
            for (int k=1; k<i; k++){
                int value = previous.get(k-1)+previous.get(k);
                pascalArr.get(i).add(value);
            }
            pascalArr.get(i).add(1);
        }
     return pascalArr;
    }
}
