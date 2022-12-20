package BitManipulation;

import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int res=0;
        for(int i = 0 ; i<a.size();i++){
            res =res ^ a.get(i);
        }
        return res;
    }
}
