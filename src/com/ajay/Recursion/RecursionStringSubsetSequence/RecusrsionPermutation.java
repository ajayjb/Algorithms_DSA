package com.ajay.Recursion.RecursionStringSubsetSequence;

import java.util.ArrayList;

public class RecusrsionPermutation {
    public static void main(String[] args) {
//        permutation("", "abc");
//        ArrayList<String> collection = new ArrayList<>(1);
//        permutation1("", "abc", collection);
//        System.out.println(collection);
        System.out.println(permutationCount("", "abc"));
    }
    static void permutation(String ans, String input){
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<=ans.length(); i++){
            String first = ans.substring(0,i);
            char middle = input.charAt(0);
            String last = ans.substring(i);
            String next = first + middle + last;
            permutation(next, input.substring(1));
        }
    }

    static void permutation1(String ans, String input, ArrayList<String> arr){
        if(input.length()==0){
            arr.add(ans);
            return;
        }
        for(int i=0; i<=ans.length(); i++){
            String first = ans.substring(0,i);
            char middle = input.charAt(0);
            String last = ans.substring(i);
            String next = first + middle + last;
            permutation1(next, input.substring(1), arr);
        }
    }

    static ArrayList permutation2(String ans, String input){
        if(input.length()==0){
            ArrayList<String> list = new ArrayList<>(1);
            list.add(ans);
            return list;
        }

        ArrayList<String> finalArray = new ArrayList<>(1);

        for(int i=0; i<=ans.length(); i++){
            String first = ans.substring(0,i);
            char middle = input.charAt(0);
            String last = ans.substring(i);
            String next = first + middle + last;
            finalArray.addAll(permutation2(next, input.substring(1)));
        }
        return finalArray;
    }

    static int permutationCount(String ans, String input){
        if(input.length()==0){
           return 1;
        }

        int count = 0;

        for(int i=0; i<=ans.length(); i++){
            String first = ans.substring(0,i);
            char middle = input.charAt(0);
            String last = ans.substring(i);
            String next = first + middle + last;
           count = count +  permutationCount(next, input.substring(1));
        }
        return count;
    }
}
