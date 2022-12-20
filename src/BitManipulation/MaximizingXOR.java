package BitManipulation;

public class MaximizingXOR {
    public static int maximizingXor(int l, int r) {
        int max =Integer.MIN_VALUE;
        for(int i =l;i<=r;i++){
            for(int j = i;j<=r;j++){
                if(max<(i^j)){
                    max =(i^j);
                }
            }
        }
        return max;
    }
}
