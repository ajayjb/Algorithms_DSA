package com.ajay.Recursion.RecursionStringSubsetSequence;

public class Skip {
    public static void main(String[] args) {
        System.out.println(skip2("sdcdsapplegegr"));
    }
    // Passing ans in arguments
    static String skip(String in, String ans, char exclude){
        if(in.isEmpty()){
            return ans;
        }
        char current = in.charAt(0);
        if(current == exclude){
            return skip(in.substring(1),ans, exclude);
        }else{
            return  skip(in.substring(1), ans+current, exclude);
        }
    }

    // Keeping the ans in the body of each function calls, and returning the ans to wherever they are called.
    static String skip2(String in){
        if(in.isEmpty()){
            return "";
        }
        if(in.startsWith("apple")){
            return skip2(in.substring(5));
        }
        String ans = skip2(in.substring(1));
        if(in.charAt(0) == 'a'){
            return ans;
        }else{
            return in.charAt(0)+ans;
        }
    }

    // Keeping the ans in the body of each function calls, and returning the ans to wherever they are called.
    static String skip3(String in){
        if(in.length() == 0){
            return "";
        }
        char first = in.charAt(0);
        if(first == 'a'){
            return skip2(in.substring(1));
        }else{
            return first + skip3(in.substring(1));
        }
    }

    static String skip4(String in) {
        if (in.length() == 0) {
            return "";
        }
        char first = in.charAt(0);
        if (in.startsWith("apple")) {
            return skip4(in.substring(5));
        }
        else{
            return first + skip4(in.substring(1));
        }
    }
}
