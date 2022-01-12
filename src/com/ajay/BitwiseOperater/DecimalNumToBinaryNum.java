package com.ajay.BitwiseOperater;
import java.util.ArrayList;

public class DecimalNumToBinaryNum {
    public static void main(String[] args){
        System.out.println(Convert(100));
    }
    static int Convert(int num){
        String ans = "";
        ArrayList<Integer> binary =new ArrayList<Integer>(1);
        while(true){
            int rem = num%2;
            binary.add(rem);
            num = num/2;
            if(num <= 1 ){
                binary.add(num);
                break;
            }
        }
        for (int i=binary.size()-1; i>=0; i--){
            ans = ans + binary.get(i);
        }
        int res = Integer.parseInt(ans);
        return res;
    }
}
