package com.ajay.Strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<=25; i++){
            char ch = (char) ('a' + i);
            series+=ch;
        }
        System.out.println(series);
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<=25; i++){
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);

        String name = " ajay ";
        System.out.println(name);

    }
}
