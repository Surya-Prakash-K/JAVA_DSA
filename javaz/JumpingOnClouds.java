package javaz;

import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
//        System.out.println(jumpingOnClouds(List.of(0,0,1,0,0,1,0)));
        //0, 0, 0, 0, 1, 0
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 0, 1, 0)));

    }

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int i = 0;
        while(i < c.size()-1) {
            if (i+2 < c.size() && c.get(i + 2) == 0) {
                i+=2;
            } else {
                i+=1;
            }
            jumps++;
        }
        return jumps;
    }
}
