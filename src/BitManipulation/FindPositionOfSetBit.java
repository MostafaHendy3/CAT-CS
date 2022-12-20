package BitManipulation;

public class FindPositionOfSetBit {
    //https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Bit%20Magic&sortBy=submissions
    public static int findPosition(int N) {
        int ret = 0;
        int ones=0;
        int flag=0;
        while(N>0){
            if((N&1)!=1){
                ret++;
            }else{
                ones++;
            }
            N = N>>1;
        }
        return ones==1?ret+1:-1;
    }
}
