package com.ajay.Patterens;

public class Pattern6 {
    public static void main(String[] args) {
      pattern(20);
    }
    static void pattern(int n){
        if(n<27 && n>0){
            for(int i=(n-1); i>=0;i--){
                for(int j=i; j<=n-1; j++){
                    char x = (char) (65+j);
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Not Valid Input");
        }

    }
}
