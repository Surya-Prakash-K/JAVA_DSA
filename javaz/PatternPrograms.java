package javaz;

import java.util.ArrayList;
import java.util.List;

public class PatternPrograms {
    public static void main(String[] args) {
        pattern7();
    }

//
//    5
//    54
//    543
//    5432
//    54321
    public static void patternNum() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.println(j);
            }
        }
    }


    public static void patternStar() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    *
//    * *
//    * * *
//    * * * *
//    * * *
//    * *
//    *

    public static void pattern4() {
        int n = 5;
        for (int i = 1; i < 2 * n; i++) {
            int k = i > n ? 2 * n - i : i;
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//        *
//       * *
//      * * *
//     * * * *
//      * * *
//       * *
//        *

    public static void pattern5() {
        int n = 5;
        for (int i = 1; i < 2 * n; i++) {
            int k = i > n ? 2 * n - i : i;
            int spaces = n - k;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//     1
//    212
//   32123
//  4321234
// 543212345

    public static void pattern6() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1


    public static void pattern7() {
        int n = 4;
        for (int i = 1; i <= 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int s = 1; s <= n - c; s++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= c; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }

}
