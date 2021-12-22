package com.ajay;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
      int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(find(nums, 10)));
    }
    static int[] find(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while(j >= i){
            if (arr[i] == target && arr[j] == target){
                return new int[] {i, j};
            }
            if (arr[i] != target){
                i = i+1;
            }
            if (arr[j] != target){
                j = j-1;
            }
        }
        return new int[] {-1, -1};
    }
}
