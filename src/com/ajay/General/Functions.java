package com.ajay.General;

public class Functions {
    public static void main(String[] args) {
        boolean test = isPrime(4);
        System.out.println(test);
    }
    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        int c=2;
        while(c*c <= num){
            if (num%c ==0 ){
                return false;
            }
            c++;
        }
        return true;
    }
}
