package com.ajay.BitwiseOperater;

public class XorFromZeroToA {
    public static void main(String[] args) {
        System.out.println(find(5));
        System.out.println(range(5,9));
    }
    static int find(int num){
        if (num%4==1){
            return 1;
        }
        else if (num%4==2){
            return (num+1);
        }
        else if (num%4 == 3){
            return 0;
        }
        return num;
    }
    static int range(int a, int b){
        return (find(b) ^ find(a-1));
    }
}
