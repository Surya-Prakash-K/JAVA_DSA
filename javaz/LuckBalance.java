package javaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LuckBalance {
    public static void main(String[] args) throws InterruptedException {
       int res =  luckBalance(3, List.of(List.of(5,1),List.of(2,1),List.of(1, 1),List.of(8, 1),List.of(10, 0),List.of(5, 0)));
        System.out.println(res);
    }
    public static int luckBalance(int k, List<List<Integer>> contests) throws InterruptedException {
        contests.sort((List<Integer> o1, List<Integer> o2) -> Integer.compare(o2.get(0), o1.get(0)));
        int luck_balance = 0;
        for (int i = 0; i < contests.size(); i++) {
            int luck = contests.get(i).get(0);
            int importance = contests.get(i).get(1);

            if(importance == 1 && k > 0){
                luck_balance+=luck;
                k--;
            } else if (importance == 1 && k == 0) {
                luck_balance-=luck;
            }

            if (importance == 0){
                luck_balance+=luck;
            }
        }
        return luck_balance;
    }
}
