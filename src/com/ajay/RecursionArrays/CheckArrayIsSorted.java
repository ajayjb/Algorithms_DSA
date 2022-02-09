package com.ajay.RecursionArrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(check(new int[] {1,4,8,9,44,55,78,777}, 0));
    }
    static boolean check(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr, i+1);
    }
    static boolean sorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr, i+1);
    }
}
