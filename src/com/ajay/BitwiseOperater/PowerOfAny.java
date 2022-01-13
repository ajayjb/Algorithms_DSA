package com.ajay.BitwiseOperater;

public class PowerOfAny {
    public static void main(String[] args) {
        System.out.println(find(2,3));
    }
    static int find(int base, int power){
        int ans = 1;
        while(power>0){
            if((power&1) == 1){
                ans*= base;
            }
            base = base*base;
            power = power >> 1;
        }
        return ans;
    }
}
