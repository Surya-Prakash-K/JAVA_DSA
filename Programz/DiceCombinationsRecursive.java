package Programz;



public class DiceCombinationsRecursive {

    public static void main(String[] args) {
        formDice("", 4);
    }

    private static void formDice(String output, int target) {
        if (target == 0) {
            System.out.print(output+" ");
            return;
        }

        for (int dice = 1; dice <= 6 && dice <= target; dice++) {
            formDice(output + dice, target - dice);
        }
    }

    /*
                   formDice("", 4)
                  /  |  |  |  |  \
                +1  +2 +3 +4 +5 +6
               /     |   |   |   \
formDice("1", 3) formDice("2", 2) formDice("3", 1) formDice("4", 0) formDice("5", -1) formDice("6", -2)
   /|\               /|\             /|\               |
 +1 +2 +3          +1 +2 +3        +1 +2 +3          PRINT "4"
 /    |             /    |          /    |
formDice("11", 2) formDice("21", 1) formDice("31", 0)
   /|\               /|\             |
 +1 +2 +3          +1 +2 +3        PRINT "31"
 /    |             /    |
formDice("111", 1) formDice("211", 0)
  /|\                 |
+1 +2 +3            PRINT "211"
 /    |
formDice("1111", 0)
  |
PRINT "1111"

     */


}
