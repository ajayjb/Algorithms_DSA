package com.ajay.Recursion.RecursionStringSubsetSequence;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        subset("", "abc");

        ArrayList<String> subs = new ArrayList<>(1);
        subset1("", "abc", subs);
        subs.remove(subs.size()-1);
        ArrayList<String> ascii = new ArrayList<String>(1);
        for (int i=0; i< subs.size(); i++) {
            if(subs.get(i).length()==1){
                char value = subs.get(i).charAt(0);
                int asc = (int) value;
                String forAscii = String.valueOf(asc);
                ascii.add(forAscii);
            }
        }
        subs.addAll(ascii);
        System.out.println(subs);

        System.out.println(subset3("", "abc"));
    }

    // Printing the ans.
    static void subset(String ans, String input){
        if(input.length() == 0){
            System.out.println(ans);
            return;
        }
        char first = input.charAt(0);
        subset(ans+first, input.substring(1));
        subset(ans, input.substring(1));
    }
    // Passing the array in the args of function call and updating it when it r=the base condition.
    static void subset1(String ans, String input, ArrayList<String> collection){
        if(input.length() == 0){
            collection.add(ans);
            return;
        }
        char first = input.charAt(0);
        subset1(ans+first, input.substring(1), collection);
        subset1(ans, input.substring(1), collection);
    }
    // Keeping the array in the function of body.
    static ArrayList subset3(String ans, String input){
        if(input.length() == 0){
            ArrayList<String> temp = new ArrayList<>(1);
            temp.add(ans);
            return temp;
        }
        char first = input.charAt(0);
        ArrayList<String> left = subset3(ans+first, input.substring(1));
        ArrayList<String> right = subset3(ans, input.substring(1));
        left.addAll(right);
        return left;
    }
}
