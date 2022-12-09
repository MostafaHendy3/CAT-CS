package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr ={0,0,1,2,1};
        List<Integer> ls = Arrays.asList(1,2,1);
        System.out.println(lonelyinteger(ls));
    }
    public static int lonelyinteger(List<Integer> a) {
        int res=0;
        for(int i = 0 ; i<a.size();i++){
            res =res ^ a.get(i);
        }
        return res;
    }
}
