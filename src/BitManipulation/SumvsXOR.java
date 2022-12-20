package BitManipulation;

public class SumvsXOR {
    public static long sumXor(long n) {
        int counts =0;
        String s = Long.toBinaryString(n);
        if(n==0){
            return (long)Math.pow(2,counts);
        }
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                counts++;
            }
        }
        return (long)Math.pow(2,counts);
    }
}
