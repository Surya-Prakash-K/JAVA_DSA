package javaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {
    public static void main(String[] args) {
        System.out.println(maximumToys(List.of(3 ,7 ,2 ,9 ,4),15));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        int max_toys = 0;
        int sum = 0;
        Collections.sort(prices);

        for (int i = 0; i < prices.size(); i++) {
            sum +=prices.get(i);
            if(sum <= k){
                max_toys++;
            }else {
                break;
            }

        }
        return max_toys;
    }
}
