package javaz;

import java.util.List;
import java.util.stream.IntStream;

public class Problem {

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(List.of(1,2,3),List.of(4,5,6),List.of(9,8,9));
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1= IntStream.range(0, arr.size()).map(i->arr.get(i).get(i)).sum();
        int sum2= IntStream.range(0, arr.size()).map(i->arr.get(i).get(arr.size()-1-i)).sum();
        return Math.abs(sum1-sum2);
    }

    public static int diagonalDifference2(List<List<Integer>> arr)
    {
        int leftd = 0;
        int rightd = 0;
        int n = arr.size();

        for(int i =0; i < n; i++)
        {
            leftd+= arr.get(i).get(i);
            rightd+= arr.get(i).get(n-i-1);
        }
        return Math.abs(leftd - rightd);
    }
}
