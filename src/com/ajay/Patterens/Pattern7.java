package com.ajay.Patterens;

public class Pattern7 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int r=0; r<=2*n; r++){
            for (int c=0; c<=2*n; c++){
                int value = n - Math.min(Math.min(r, c), Math.min((2*n-c), (2*n-r)));
                System.out.print(value+ " ");
            }
            System.out.println();
        }
    }
}
