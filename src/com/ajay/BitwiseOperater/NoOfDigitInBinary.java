package com.ajay.BitwiseOperater;

public class NoOfDigitInBinary {
    public static void main(String[] args) {
        System.out.println(find1(55));
        System.out.println(find2(55, 2));
    }
    // Using right shift operator
    static int find1(int num){
        int count = 0;
        while(num>=1){
            count+=1;
            num = num >>1;
        }
        return count;
    }
    // Using formula
    static int find2(int num, int b){
        int count = ((int)(Math.log(num)/Math.log(b))) + 1;
        return count;
    }
}
