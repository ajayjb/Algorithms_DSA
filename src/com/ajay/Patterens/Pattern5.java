package com.ajay.Patterens;

public class Pattern5 {
    public static void main(String[] args) {
        patteren(5);
    }
    static void patteren(int n){
       for(int i=1; i<2*n; i++){
           for(int s=1; s<=Math.abs(n-i); s++){
               System.out.print(" ");
           }
           int c = i>n ? 2*n-i : i;
           for (int j=c; j>=1;j--){
               System.out.print(j);
           }
           for (int k=2; k<=c; k++){
               System.out.print(k);
           }
           System.out.println();
        }
    }
}
