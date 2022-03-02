package com.ajay.Recursion.RecusionLevel1;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(find(1253));
    }
    static int find(int num){
        if(num == 0){
            return 0;
        }
        return num%10+find(num/10);
    }
}
