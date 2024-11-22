package javaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1,2,5}; int amount = 11;
        int result = coinChange(coins,amount);
        System.out.println(result);
        String str = "Surya";
        String reverse = str.chars().mapToObj(c -> (char) c).reduce("",(a,b) -> b+a, (c,d) -> d+c);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(8);


    }

    public static int coinChange( int[] coins, int amount ) {
        if ( coins.length == 1 && coins[0] < amount ) {
            return -1;
        }
        int[] newest = new int[amount+1];
        int fewest = 0; int counter = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {

            }
        }

              return 0;
    }

    String str = "Surya";

    public static String reverse(String str){
        return Stream.of(str).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(""));
    }




}
