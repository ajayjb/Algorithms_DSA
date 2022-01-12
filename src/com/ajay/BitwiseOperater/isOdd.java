package com.ajay.BitwiseOperater;

public class isOdd {
    public static void main(String[] args) {
        System.out.println(odd(58));
    }
    static boolean odd(int num){
        return ((num & 1) == 1);
    }
}
