package javaz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchantSales {
    public static void main(String[] args) {
        System.out.println(sockMerchant(7,List.of(1,2,1,2,1,3,2)));
    }

    public static int sockMerchant(int n, List<Integer> arr) {
        int pairs = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            if(!set.contains(arr.get(i))){
                set.add(arr.get(i));
            }else {
                pairs++;
                set.remove(arr.get(i));
            }

        }
        return pairs;
    }
}
