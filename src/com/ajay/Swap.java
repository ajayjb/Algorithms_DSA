package com.ajay;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
      int[] arr1 ={1,5,8,2,7,5,7,2,4};
      reverse(arr1);
      System.out.println(Arrays.toString(arr1));
    }
    static void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(e>s){
            swap(arr, s, e);
            s++;
            e--;
        }
    }

    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
