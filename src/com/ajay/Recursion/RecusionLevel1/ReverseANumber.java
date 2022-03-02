package com.ajay.Recursion.RecusionLevel1;

public class ReverseANumber {
    static int sum = 0;
    public static void main(String[] args) {
        rev1(45789);
        System.out.println(sum);
        System.out.println(rev2(45789));
    }
    static void rev1(int num){
        if (num == 0){
            return ;
        }
        int rem = num%10;
        sum = sum*10 + rem;
        rev1(num/10);
    }
    static int rev2(int num){
        int digit = (int) Math.log10(num);
        return helper(num, digit);
    }
    static int helper(int num, int digit){
        if(num == 0){
            return 0;
        }
        return (num%10) * (int) Math.pow(10,digit) + helper(num/10, digit-1);
    }
}
