package com.ajay.Strings;

import java.util.HashMap;

public class Leetcode290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
    static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char current = pattern.charAt(i);
            if(map.containsKey(current)){
                if(!map.get(current).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(current, arr[i]);
            }
        }
        return true;
    }
}
