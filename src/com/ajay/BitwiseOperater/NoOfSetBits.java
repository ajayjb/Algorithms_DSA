package com.ajay.BitwiseOperater;

public class NoOfSetBits {
    public static void main(String[] args) {
        System.out.println(count(7));
    }
    static int count(int num){
        int countSet = 0;
        while(num > 0){
            if ((num & 1) == 1){
                countSet++;
            }
          num = num >> 1;
        }
        return countSet;
    }
}
