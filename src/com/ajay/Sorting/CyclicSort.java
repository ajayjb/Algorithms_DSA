package com.ajay.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,6,7,4,1,3,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int trueIndex = arr[i] - 1;
            if(i != trueIndex){
                int temp = arr[i];
                arr[i] = arr[trueIndex];
                arr[trueIndex] = temp;
            }
            else{
                i++;
            }
        }
    }
}
