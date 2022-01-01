package com.ajay.Patterens;

public class Pattern3 {
    public static void main(String[] args) {
        Patteren(5);
    }
    static void Patteren(int n){
        for(int i=1; i<2*n; i++){
            for(int s=1; s<=Math.abs(n-i); s++){
                System.out.print(" ");
            }
            int col = 0;
            if(i>n){
                col = 2*n-i;
            }else{
                col = i;
            }
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}