package javaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwoDArray {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 1, 1, 0, 0, 0));
        list.add(List.of(0, 1, 0, 0, 0, 0));
        list.add(List.of(1, 1, 1, 0, 0, 0));
        list.add(List.of(0, 9, 2, -4, -4, 0));
        list.add(List.of(0, 0, 0, -2, 0, 0));
        list.add(List.of(0, 0, -1, -2, -4, 0));

//        1, 1, 1, 0, 0, 0
//        0, 1, 0, 0, 0, 0
//        1, 1, 1, 0, 0, 0
//        0, 9, 2, -4, -4, 0
//        0, 0, 0, -2, 0, 0
//        0, 0, -1, -2, -4, 0

        System.out.println(maxHourGlass(list));
    }

    public static int maxHourGlass(List<List<Integer>> arr){
        int row = arr.size();
        int column = arr.get(0).size();
        int max_hour_glass = Integer.MIN_VALUE;

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < column - 2; j++) {
                int current_max_hour_glass =
                        arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                max_hour_glass = Math.max(max_hour_glass, current_max_hour_glass);
            }
        }
        return max_hour_glass;
    }
}
