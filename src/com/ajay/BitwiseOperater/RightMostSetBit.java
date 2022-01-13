package com.ajay.BitwiseOperater;

public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n&(-n));
        System.out.println(find(10));
    }
    static int find(int num){
        int i = 1;
        while(num>0){
            if((num&1)==1){
                return i;
            }
            num = num >> 1;
            i++;
        }
        return -1;
    }
}
