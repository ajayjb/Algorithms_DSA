package com.ajay;
// Minimum sum of Subarray in an array of size k.
public class MinimumSum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,10,23,3,1,0,20};
        System.out.println(Minimum(arr, 1));
    }
    static int Minimum(int[] arr, int k){
        int start = 0;
        int end = k;
        int sum = 0;
        for (int i = start; i<end ; i++){
            sum = sum + arr[i];
        }
        int currentSum = sum;
        for (int j = end; j < arr.length; j++){
            currentSum = sum + arr[j] + arr[j-end];
            sum = Integer.min(sum, currentSum);
        }
        return sum;
    }
}
