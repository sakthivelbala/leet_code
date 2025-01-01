// Number of islands (LeetCode #200)

class Solution {
    public int numIslands(char[][] grid) {
        // if invalid grid
        if(grid == null || grid.length == 0){
            return 0;
        }
        int rows = grid.length;
        int columns = grid[0].length;
        int isLandCount = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j] == '1'){
                    // if grid cound the island count
                    isLandCount++;
                    dfs(grid, i, j);
                }
            }
        }
        return isLandCount;
    }

    // mark the adjacent matrix if island as visited.
    public void dfs(char[][] grid, int row, int column){
        if(row<0 || row >= grid.length || column < 0 ||column >= grid[0].length || grid[row][column] == '0'){
            return;
        }
        grid[row][column] = '0';
        dfs(grid, row+1, column);
        dfs(grid, row-1, column);
        dfs(grid, row , column+1);
        dfs(grid, row, column-1);
    }
}