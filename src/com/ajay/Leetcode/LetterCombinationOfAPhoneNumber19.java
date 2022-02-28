package com.ajay.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber19 {
    public static void main(String[] args) {
        String[] arr = {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination("","221",arr);
        System.out.println(combination2("","221",arr));
    }
    static void combination(String ans, String in, String[] arr){
        if(in.length() == 0){
            System.out.println(ans);
            return;
        }
        int first = Integer.parseInt(in.charAt(0) + "");
        if(first == 1){
            combination(ans , in.substring(1), arr);
        }
        else{
            String value = arr[first];
            for(int i=0; i<value.length();i++){
                combination(ans+value.charAt(i), in.substring(1), arr);
            }
        }
    }
    static List<String> combination2(String ans, String in, String[] arr){
        if(in.length() == 0){
            List<String> temp = new ArrayList<>(1);
            temp.add(ans);
            return temp;
        }
        int first = Integer.parseInt(in.charAt(0) + "");
        List<String> finalAns = new ArrayList<>(1);
        if(first == 1){
            finalAns.addAll(combination2(ans , in.substring(1), arr));
        }
        else{
            String value = arr[first];
            for(int i=0; i<value.length();i++){
                finalAns.addAll(combination2(ans+value.charAt(i), in.substring(1), arr));
            }
        }
        return finalAns;
    }
}
