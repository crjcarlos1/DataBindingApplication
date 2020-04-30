package com.cralos.myapplication2.fragments.codingwithmitch.utils;

public class StringUtil {
    public static String getQuantityString(int quantity){
        return ("Qty: " + String.valueOf(quantity));
    }

    public static String convertIntToString(int value){
        return ("(" + String.valueOf(value) + ")");
    }
}
