package Greedy;

import java.util.Arrays;

public class Minimizethesumofproduct {
    public long minValue(long a[], long b[], long n) {
        Arrays.sort(a);
        Arrays.sort(b);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] + b[i+(int)n-1];
        }
        return ans;
    }
}
