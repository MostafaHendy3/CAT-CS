package BitManipulation;

public class FindFirstSetBit {
    public static int getFirstSetBit(int n){
        int ret = 0;
        int flag=0;
        while(n>0){
            if((n&1)!=1){
                ret++;
            }else{
                flag=1;
                break;
            }
            n = n>>1;
        }
        return flag==1?ret+1:0;
    }
}
