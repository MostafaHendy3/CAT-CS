package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int res=0;
        for(int i = 0 ; i<a.size();i++){
            res =res ^ a.get(i);
        }
        return res;
    }
}
