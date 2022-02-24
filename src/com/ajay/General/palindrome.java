package com.ajay.General;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean res = palindrome(number);
        System.out.println(res);
    }

    static boolean palindrome(int num){
        int remSum = 0;
        int temp = num;
        while(num>0){
            int rem = num % 10;
            remSum = (remSum)*10 + rem;
            num = num/10;
        }
        if (temp == remSum){
            return true;
        }else {
            return false;
        }
    }
}
