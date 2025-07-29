package Programz;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of islands: " + countIslands(grid));
    }

    public static int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    exploreIsland(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private static void exploreIsland(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Check boundaries and if the current cell is water
        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0') {
            return;
        }

        // Mark the current cell as visited
        grid[row][col] = '0';

        // Recursively visit all adjacent cells (4-directionally)
        exploreIsland(grid, row - 1, col); // Up
        exploreIsland(grid, row + 1, col); // Down
        exploreIsland(grid, row, col - 1); // Left
        exploreIsland(grid, row, col + 1); // Right
    }
}
