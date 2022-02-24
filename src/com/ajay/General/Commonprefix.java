package com.ajay.General;
// Leetcode 14 Longest common prefix
public class Commonprefix {
    public static void main(String[] args) {
      String [] arr = {"flower","flow","flight"};
        System.out.println(Find(arr));
    }
    static String Find(String[] arr){
        String res = "";
        for(int i=0; i<arr[0].length(); i++){
            try{
                for (String item : arr){
                    if (arr[0].charAt(i)!=item.charAt(i)){
                        return res;
                    }
                }
                res = res + arr[0].charAt(i);
            }
          catch (Exception e){
                return res;
          }
        }
        return res;
    }
}
