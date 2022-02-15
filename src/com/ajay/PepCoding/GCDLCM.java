package com.ajay.PepCoding;

public class GCDLCM {
    public static void main(String[] args) {
        System.out.println(lcm(6,12));
    }
    static int gcd(int a, int b){
        if(b>a){
            if(a==0){
                return b;
            }
            return gcd(b%a,a);
        }
        else{
            if(b==0){
                return b;
            }
            return gcd(a%b,b);
        }
    }

    static int lcm(int a, int b){
        return ((a*b)/gcd(a,b));
    }
}
