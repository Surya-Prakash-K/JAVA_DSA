package Programz;

import java.util.Arrays;

public class FindAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true,true},
                {true, true,true},
                {true, true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
//        findAllPath("",maze,0,0);
        printAllPath("",maze,0,0,path,1);
    }

     static void findAllPath(String output, boolean[][] maze, int row, int col) {
        if(row == maze.length -1 && col == maze[0].length - 1){
            System.out.println(output);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        maze[row][col] = false;

        if(row < maze.length -1){
            findAllPath(output+"D",maze,row+1,col);
        }

        if(col < maze[0].length - 1){
            findAllPath(output+"R",maze,row,col+1);
        }

        if(row > 0){
            findAllPath(output+"U",maze,row-1,col);
        }

        if(col > 0){
            findAllPath(output+"L",maze,row,col-1);
        }

        maze[row][col] = true;
    }


    static void printAllPath(String output,boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step;
            for(int[] n : path){
                System.out.println(Arrays.toString(n));
            }
            System.out.println(output);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length -1){
            printAllPath(output+"D",maze,row+1,col,path,step+1);
        }

        if(col < maze[0].length - 1){
            printAllPath(output+"R",maze,row,col+1,path,step+1);
        }

        if(row > 0){
            printAllPath(output+"U",maze,row-1,col,path,step+1);
        }

        if(col > 0){
            printAllPath(output+"L",maze,row,col-1,path,step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }

}
