package com.ajay.RecursionStringSubsetSequence;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetUsingIteration {
    public static void main(String[] args) {
        ArrayList<Character> in = new ArrayList<>(1);
        in.addAll(Arrays.asList('a', 'b', 'c'));
        System.out.println(subsets(in));
        System.out.println(subsets1(new int[] {1, 2, 3}));
    }

    // Subsets using Binary number concept
    static ArrayList<ArrayList> subsets(ArrayList<Character> input){
         int NoOfSubset = (int) Math.pow(2, input.size());
         ArrayList<ArrayList> outer = new ArrayList<>(1);
         for(int i=0; i<NoOfSubset; i++){
             outer.add(new ArrayList<>(1));
             int temp = i;
             for(int j=input.size()-1; j>=0; j--){
                 int rem = temp%2;
                 temp = temp/2;
                 if(rem == 0){
                     continue;
                 }else {
                     outer.get(i).add(input.get(j));
                 }
             }
         }
         return outer;
    }

    // Another concept
    static ArrayList<ArrayList<Integer>> subsets1(int[] input){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>(1);
        outer.add(new ArrayList<>());
        for (int num:input) {
            int n =outer.size();
            for(int i=0; i<n; i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
