package javaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateArrayLeft {

    public static void main(String[] args) {
        List<Integer> res= rotLeft(List.of(33, 47, 70, 37, 8 ,53, 13, 93, 71, 72, 51, 100, 60, 87, 97),13);
        for (Integer num : res){
            System.out.println(num);
        }
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // 1 2 3 4 5
        List<Integer> rotated = new ArrayList<>();
        int rotate_index = d;
        int i = 0;
        while (rotate_index < a.size()){
            rotated.add(i,a.get(rotate_index));
            i++;
            rotate_index++;
        }

        rotate_index = 0;
        while (i < a.size()){
            rotated.add(i,a.get(rotate_index));
            i++;
            rotate_index++;
        }


        return rotated;
    }
}
