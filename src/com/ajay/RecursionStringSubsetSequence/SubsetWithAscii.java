package com.ajay.RecursionStringSubsetSequence;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SubsetWithAscii {
    public static void main(String[] args) {
//        int[] arr = {1};
//        int[] arr2 = Arrays.copyOfRange(arr, 1, arr.length);
//        System.out.println(Arrays.toString(arr2));
//        String as = "s";
//        String ki = as.substring(1);
//        System.out.println(ki);
        ArrayList<ArrayList> test = new ArrayList<>();
        test.add(new ArrayList(1));
        test.get(0).add("a");
        test.get(0).add(1);
        List Check = new List(1);
        System.out.println(test);
    }
}
