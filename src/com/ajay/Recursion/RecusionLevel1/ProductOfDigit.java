package com.ajay.Recursion.RecusionLevel1;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(product(1523));
    }
    static int product(int num){
        if(num == 0){
            return 1;
        }
        return num%10*product(num/10);
    }
}
