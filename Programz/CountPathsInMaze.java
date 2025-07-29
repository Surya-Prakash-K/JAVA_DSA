package Programz;

public class CountPathsInMaze {
    public static void main(String[] args) {
//        System.out.println(countMaze(3,3));
//        findPaths("",3,3);
//        printDiagonalPaths("",3,3);
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        printDiagonalPathsRestriction("",maze,0,0);
    }

    static int countMaze(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = countMaze(row-1,col);
        int right = countMaze(row,col-1);

        return left+right;
    }


    /*
                     ("",3,3)

                       /
                  ("D",2,3)

                    /

               ("DD",1,3)
                      \
                        ("DDR",1,2)
                            \
                              ("DDRR",1,1)

                                 if(row ==1 & col ==1)
                                 print("DDRR")
*/

       static void findPaths(String output,int row, int col){
           if(row == 1 && col == 1){
               System.out.println(output);
               return;
           }
           if(row > 1) {
               findPaths(output + "D", row - 1, col);
           }
           if(col > 1){
               findPaths(output+"R",row,col-1);
           }

       }


       static void printDiagonalPaths(String output,int row, int col){
           if(row == 1&& col == 1){
               System.out.println(output);
               return;
           }

           if(row>1){
               printDiagonalPaths(output+"V",row-1,col);
           }

           if(col>1){
               printDiagonalPaths(output+"H",row,col-1);
           }

           if(col > 1 && row > 1){
               printDiagonalPaths(output+"D",row-1,col-1);
           }
       }


    static void printDiagonalPathsRestriction(String output,boolean[][] maze,int row, int col){
        if(row == maze.length -1 && col == maze[0].length-1){
            System.out.println(output);
            return;
        }

        /*
                                         (0,0)
                                     /          \
                         ("D",1,0)                  ("R",0,1)
                             /   \                    /   \
                      ("DD",2,0)  ("DDR",1,1)  ("RD",1,1)    ("RR",0,2)
                            \                                 /
                              ("DDR",2,1)                  ("RRD",1,2)
                                \                          /
                                 ("DDRR",2,2)          ("RRDD",2,2)

         */

        if(!maze[row][col]){
            return;
        }
        if(row < maze.length-1){
            printDiagonalPathsRestriction(output+"D",maze,row+1,col);
        }

        if(col < maze[0].length-1){
            printDiagonalPathsRestriction(output+"R",maze,row,col+1);
        }

    }


       /*


                    (3, 3)
                   /     \
              (2, 3)     (3, 2)
             /    \       /    \
        (1, 3)  (2, 2) (2, 2) (3, 1)
        /  \     /  \   /  \    /  \
   (0,3)(1,2)(1,2)(2,1)(2,1)(2,1)(3,0)(2,0)
          /    \   /    \   /    \
     (0,2)(1,1)(1,1)(1,1)(1,0)(1,1)
              |     |     |     |
           Print  Print  Print  Print
             1      1      1      1


      3,3   3,2   3,1

      2,3   2,2   2,1

      1,3   1,2   1,1


      C3    C2    C1
   R3 👤   .      .
      ------------
   R2 | .    .     .
      |
   R1 | .    .     .




     */




}