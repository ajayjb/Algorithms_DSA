package com.ajay.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,5,7,6,71,8,4,86,2,4,6,58,1,7,32,-54,-78};
        int[] nums = {-1,-2};
        Bubble(arr);
        Bubble(nums);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
    static void Bubble(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            boolean sort = true;
            for(int j=1; j<=arr.length-1-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sort = false;
                }
            }
            if (sort == true){
                break;
            }
        }
    }
}
