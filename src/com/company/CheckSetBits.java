package com.company;

public class CheckSetBits {
    static int isBitSet(int N){
        if(N==0){
            return 0;
        }
        while (N>0){
            if((N&1)!=1){
                return 0;
            }
            N = N>>1;
        }
        return 1;
    }
}
