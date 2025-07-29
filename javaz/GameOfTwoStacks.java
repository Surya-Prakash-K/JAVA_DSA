package javaz;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        System.out.println(twoStacks(10, new int[]{4,2,4,6,1},new int[]{2,1,8,5}));
    }

    public static int twoStacks(int maxSum, int[] a, int[] b) {
        return findMaxScore(maxSum,a,b,0,0) - 1;
    }

    static int findMaxScore(int max, int[] first, int[] second, int sum, int count){
        if(sum > max){
            return count;
        }

        if(first.length == 0 || second.length == 0){
            return count;
        }
        int maxFirst = findMaxScore(max, Arrays.copyOfRange(first, 1,first.length),second,sum+first[0],count+1);
        int maxSecond = findMaxScore(max,first,Arrays.copyOfRange(second,1,second.length),sum+second[0],count+1);

        return Math.max(maxFirst,maxSecond);
    }
}
