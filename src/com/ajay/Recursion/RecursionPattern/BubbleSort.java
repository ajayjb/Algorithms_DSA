package com.ajay.Recursion.RecursionPattern;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubble( new int[] {12,4,3,2,1}, 0, 4)));
    }
    static int[] bubble(int[] arr,int left, int right){
        if(right == 0){
            return arr;
        }
        if(left<right){
            if(arr[left]>arr[left+1]){
                int temp = arr[left];
                arr[left] = arr[left+1];
                arr[left+1] = temp;
            }
            return bubble(arr, left+1, right);
        }
        else{
           return  bubble(arr, 0, right-1);
        }
    }
}
