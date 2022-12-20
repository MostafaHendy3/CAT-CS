package com.company;

public class Flippingbits {
    public static long flippingBits(long n) {
        String s ="";
        String res="";
        for(int i =0;i<s.length();i++){
            res += s.charAt(i)=='0'?'1':'0';
        }
        return Long.parseLong(res,2);
    }
}
