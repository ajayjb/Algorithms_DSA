package com.ajay;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<b){
            int hcf = HCF(a, b);
            int lcm = a*b/hcf;
            System.out.println(lcm);
        }
        else {
            int hcf = HCF(b, a);
            int lcm = a*b/hcf;
            System.out.println(lcm);
        }
    }
    static int HCF(int a, int b){
        int hcf = 0;
        for(int i=a; i>=1; i--){
            if(a%i==0 && b%i==0){
                hcf = i;
                break;
            }
        }
        return hcf;
    }
}
