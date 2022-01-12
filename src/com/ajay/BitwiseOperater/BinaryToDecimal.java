package com.ajay.BitwiseOperater;

public class BinaryToDecimal {
    public static void main(String[] args){
        System.out.println(Convert(111));
    }
    static int Convert(int num){
        StringBuilder str = new StringBuilder();
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            str.append(rem);
            temp = temp/10;
        }
        int sum = 0;
        String newStr = str.toString();
        for(int j=0; j<newStr.length(); j++){
            int ans = Integer.parseInt(String.valueOf(newStr.charAt(j)));
            sum = sum + (ans*(int)Math.pow(2,j));
        }
        return sum;
    }
}
