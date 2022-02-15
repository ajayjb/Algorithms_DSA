package com.ajay.RecursionPattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selection( new int[] {12,4,45,3,2,1}, 0,0, 6)));
    }
    static int[] selection(int [] arr, int max, int start, int end){
        if(end == 0){
            return arr;
        }
        if(start<end){
            if(arr[max]<arr[start]){
                max = start;
            }
            return selection(arr, max, start+1, end);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1] = temp;
            return selection(arr, 0, 0, end-1);
        }
    }
}
