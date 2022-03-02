package com.ajay.Recursion.RecursionStringSubsetSequence;

public class String1 {
    public static void main(String[] args) {
        System.out.println(modify("baccdah", 0, "", 'a'));
        System.out.println(modify2("baccdah", 0, 'a'));
    }
    // Passing ans in args.
    static String modify(String input, int i, String carry, char exclude){
        if(i==input.length()){
            return carry;
        }
        int ascii = (int) exclude;
        char other = 'a';
        if(ascii >=65 && ascii<=90){
            other = (char)(ascii + 32);
        }
        if(ascii >=97 && ascii<=122){
            other = (char) (ascii-32);
        }
        if(input.charAt(i) != exclude && input.charAt(i) != other){
            carry = carry + input.charAt(i);
        }
        return modify(input, i+1, carry, exclude);
    }

    // Another method is keeping the ans in function call body.
    static String modify2(String input, int i, char exclude ){
        if(i== input.length()){
            return "";
        }
        String ans = modify2(input, i+1, exclude);
        int ascii = (int) exclude;
        char other = 'a';
        if(ascii >=65 && ascii<=90){
            other = (char)(ascii + 32);
        }
        if(ascii >=97 && ascii<=122){
            other = (char) (ascii-32);
        }
        if(input.charAt(i) != exclude && input.charAt(i) != other){
            return input.charAt(i)+ans;
        }else{
            return ans;
        }
    }
}
