package Greedy;

public class Largestnumberwithgivensum {
    static String largestNumber(int n, int sum) {
        if (sum == 0) {
            if (n == 1) {
                return "0";
            }
        }
        if (sum > 9 * n) {
            return ("-1");
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (sum >= 9) {
                result[i] = 9;
                sum -= 9;
            } else {
                result[i] = sum;
                sum = 0;
            }
        }
        String res = "";
        for (int i = 0; i < n; i++)
            res += result[i];
        return res;
    }
}
