package com.ajay.Patterens;

public class Pattern9 {
    public static void main(String[] args) {
       pattern(5);
    }
    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            int c = i*2 - 1;
            for (int j=1;j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
