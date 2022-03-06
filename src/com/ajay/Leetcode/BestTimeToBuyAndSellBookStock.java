package com.ajay.Leetcode;

import java.util.ArrayList;

public class BestTimeToBuyAndSellBookStock {
    public static void main(String[] args) {
        System.out.println(profit(new int[] {7,6,4,3,1}));
        System.out.println(profitSlide(new int[] {7,6,4,3,1}));
    }
    // Bruteforce method
    // Time = O(n^2), Space = O(n)
    static int profit(int[] arr){
        ArrayList<Integer> profitArray = new ArrayList<>(1);
        for(int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                  int pro = arr[j] - arr[i];
                  profitArray.add(pro);
            }
        }
        if(profitArray.size()>0){
            int max = profitArray.get(0);
            for (int num:profitArray) {
                if(num>max){
                    max = num;
                }
            }
            if(max>0){
                return max;
            }
            return 0;
        }
        return 0;
    }

    // Sliding window approach
    // Time = O(n), Space = O(1)
    static int profitSlide(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return 0;
        }
        int max = 0;
        int i = 0; // buy point
        int j = i+1; // sell point
        while(j< arr.length){
            if(arr[i]>=arr[j]){
                i = j;
                j = j+1;
            }else{
                max = Math.max(max, arr[j]-arr[i]);
                j++;
            }
        }
        return max;
    }
}
