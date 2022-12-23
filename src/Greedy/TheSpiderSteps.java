package Greedy;

public class TheSpiderSteps {
    static int minStep(int H, int U, int D){
        int steps =0;
        if(U>=H){
            return 1;
        }
        while(H>=U){
            H-=U-D;
            steps++;
        }
        return ++steps;
    }
}
