package Programz;

public class PatternNumber {
    /*
     1 2 3 4 17 18 19 20
       5 6 7 14 15 16
         8 9 12 13
          10 11
    */

    public static void main(String[] args) {
        int n = 5;
        int ascCount = 1;
        int descCount =  n * (n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
        }
    }
}
