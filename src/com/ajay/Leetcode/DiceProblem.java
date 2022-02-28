package com.ajay.Leetcode;

import java.util.Calendar;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
       way1("", 4, 6);
        System.out.println(way2("", 4, 6));
    }
    // Recursion
    static void way1(String ans, int target, int dice){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        for (int i=1; i<=dice && i<=target;i++){
            way1(ans+i, target-i, dice);
        }
    }

    static ArrayList<String> way2(String ans, int target, int dice){
        if(target == 0){
            ArrayList<String> temp = new ArrayList<>(1);
            temp.add(ans);
            return temp;
        }
        ArrayList<String> finalAns = new ArrayList<>(1);
        for (int i=1; i<=dice && i<=target;i++){
            finalAns.addAll(way2(ans+i, target-i, dice));
        }
        return finalAns;
    }
}

// How many ways are there to form a target on Dice rolled 2 times.