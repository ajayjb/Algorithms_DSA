package com.ajay;
// Maximum sum of Subarray in an array of size k.
public class MaximumSum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,10,23,3,1,0,20};
        System.out.println(find(arr, 8));
    }
    static int find(int[] arr, int size){
        int start = 0;
        int end = (size - 1);
        int sum = 0;
        for(int i =0; i<=end; i++){
            sum = sum + arr[i];
        }
        if (size>arr.length){
            return Integer.MAX_VALUE;
        }
        int i = 1;
        end = end + 1;
        while(end<=(arr.length-1)){
            int nextSum = sum + arr[end] - arr[i-1];
            sum = Integer.max(nextSum, sum);
            i++;
            end ++;
        }
        return sum;
    }
    static int findGeeksMethod(int[] arr, int size){
        int start = 0;
        int end = size;
        int sum = 0;
        for (int i = start; i<end ; i++){
            sum = sum + arr[i];
        }
        int currentSum = sum;
        for (int j = end; j < arr.length; j++){
            currentSum = sum + arr[j] + arr[j-end];
            sum = Integer.max(sum, currentSum);
        }
        return sum;
    }
}
