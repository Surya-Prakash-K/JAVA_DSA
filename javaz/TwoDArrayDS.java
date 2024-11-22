package javaz;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayDS {

//            1    1     1    0     0     0
       //  (0,0) (0,1) (0,2) (0,0) (0,0) (0,0)
//            0    1     0    0     0     0
    //     (1,0)  (1,1) (1,2) (0,0) (0,0) (0,0)
//            1    1     1    0     0      0
    //     (2,0)  (2,1) (2,2) (0,0) (0,0)  (0,0)
//            0 0 2 4 4 0

//            0 0 0 2 0 0

//            0 0 1 2 4 0

    public static int hourglassSum(List<List<Integer>> arr) {
        int max_glass_hours = Integer.MIN_VALUE;
        int rows = arr.size();
        int columns  = arr.get(0).size();

        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < columns-2; j++) {
                int current_glass_hours =  arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                                    arr.get(i+1).get(j+1) +
                                    arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                max_glass_hours = Math.max(max_glass_hours,current_glass_hours);
            }
        }
        return max_glass_hours;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 1, 1, 0, 0, 0));
        list.add(List.of(0, 1, 0, 0, 0, 0));
        list.add(List.of(1, 1, 1, 0, 0, 0));
        list.add(List.of(0, 0, 2, 4, 4, 0));
        list.add(List.of(0, 0, 0, 2, 0, 0));
        list.add(List.of(0, 0, 1, 2, 4, 0));

        System.out.println(hourglassSum(list));
    }
}
