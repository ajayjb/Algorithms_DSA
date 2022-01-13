package com.ajay.BitwiseOperater;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(find2(26));
    }
    static boolean find1(int num){
        while(num>1){
            if((num & 1) == 1){
                return false;
            }
            num = num >> 1;
        }
        return (num & 1) == 1;
    }
    static boolean find2(int num){
     return ((num & (num-1)) == 0);
    }
}
