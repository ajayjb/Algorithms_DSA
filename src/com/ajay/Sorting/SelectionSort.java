package com.ajay.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,5,7,6,71,8,4,86,2,4,6,58,1,7,32,-54,-78};
        int[] nums = {1};
        Selection(arr);
        Selection(nums);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
    static void Selection(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            int last = arr.length-1-i;
            int start = 0;
            int max = maxFind(arr, start, last);
            Swap(arr, max, last);
        }
    }

    static void Swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

    static int maxFind(int[] arr, int start, int last){
        int maximum = start;
        for (int j=1; j<=last; j++){
            if(arr[maximum]<arr[j]){
                maximum = j;
            }
        }
        return maximum;
    }
}
