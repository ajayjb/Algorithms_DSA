package com.ajay.Recursion.RecusionLevel1;

public class Basic {
    public static void main(String[] args) {
       message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");
        message5();
    }
    static void message5(){
        System.out.println("Hello world");
    }

}
