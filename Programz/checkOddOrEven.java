package Programz;

import java.util.List;

public class checkOddOrEven {
    public static void main(String[] args) {
        checkOddEven(List.of(3,5,7,10,6));
    }

    static void checkOddEven(List<Integer> nums){
        boolean ans  = nums.stream().anyMatch(e -> e%2 == 0);
        System.out.println(ans);
    }

}
