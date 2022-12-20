package com.company;

import java.util.Scanner;

import static com.company.FindPositionOfSetBit.findPosition;

public class Main {
    public static void main(String[] args) {
        // System.out.println(Flippingbits.flippingBits(1));
        System.out.println(findPosition(8));
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        int res = Integer.MIN_VALUE;
//
//        for (int i = 0; i < T; i++) {
//            int n = scanner.nextInt();
//            int[] a = new int[n];
//            int[] b = new int[n];
//            int[] c = new int[n];
//            for (int j = 0; j < n; j++) {
//                a[j] = scanner.nextInt();
//                b[j]= scanner.nextInt();
//                c[j] = a[j]&b[j];
//            }
//            for (int j = 0; j < n; j++) {
//                if(res<c[j]){
//                    res = c[j];
//                }
//            }
//            System.out.println(res);
//            res = Integer.MIN_VALUE;
//        }
    }
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
    ////check set bit
    static int isBitSet2(int N){
        return (N&(N-1))==0?1:0;
    }


    public static void printNumber(int n, int len) {
        if (len == 0) {
            return;
        }
        printNumber(n >> 1, len - 1);
        System.out.print(n & 1);
    }

    ////count number of 1's in binary representation of a number
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public static long flippingBits(long n) {
        for (int i = 0; i < 31; i++) {
            n = toggleBit(n, 31 - 1 - i);
        }
        return n;
    }

    public static long toggleBit(long n, long i) {
        return n ^ (1 << i);
    }

    public static int countOnes2(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    ////get ith bit of a number
    public static int getBit(int n, int i) {
        return (n >> i) & 1;
    }

    ////set ith bit of a number
    public static int setBit0(int n, int i) {
        return n | (1 << i);
    }

    public static int setBit1(int n, int i) {
        return n & (~(1 << i));
    }

    ////clear ith bit of a number
    public static int clearBit(int n, int i) {
        return n & (~(1 << i));
    }

    ////toggle ith bit of a number
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }
}
