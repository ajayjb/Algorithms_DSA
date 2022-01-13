package com.ajay.BitwiseOperater;

public class FindUniqueUsingBits {
    public static void main(String[] args) {
        int[] arr = {2,2,2,5,5,5,4};
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println(sum%3);
    }
}
