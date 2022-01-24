package com.ajay.MathsForDSA;

public class HCF {
    public static void main(String[] args) {
        System.out.println(Hcf(3,5));
    }
    static int Hcf(int a, int b){
        if(a==0){
            return b;
        }
        return Hcf(b%a,a);
    }
}
