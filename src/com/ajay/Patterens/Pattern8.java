package com.ajay.Patterens;

public class Pattern8 {
    public static void main(String[] args) {
       pattern(4);
    }
    static void pattern(int n){
        for(int r=1; r<=(2*n)-1; r++){
            for(int c=1; c<=(2*n)-1;c++){
                int left = c-1;
                int right = (2*n)-c-1;
                int top = r-1;
                int bottom = (2*n)-r-1;
                int value = Math.min(Math.min(left, right), Math.min(top, bottom));
//                if(value==3){
//                    value=4;
//                }
                System.out.print(n-value + " ");
            }
            System.out.println();
        }
    }
}
