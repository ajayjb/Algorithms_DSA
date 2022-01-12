package com.ajay.BitwiseOperater;

public class magicNumber {
    public static void main(String[] args) {
        System.out.println(find(6));
    }
    static int find(int n){
        int sum = 0;
        int i = 1;
        while(n>0){
            int last = n & 1;
            sum = (int)(sum + last * Math.pow(5,i));
            i++;
            n = n >> 1;
        }
        return sum;
    }
}
