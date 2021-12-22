package com.ajay;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
       int[] list = {1, 252, 425828, 7,58, 402505};
       System.out.println(Arrays.toString(list));
       System.out.print(found(list));
    }
    static int found(int[] arr){
        int max = arr[0];
        for (int num : arr) {
            if (num>max){
                max = num;
            }
        }
        return max;
    }
}
