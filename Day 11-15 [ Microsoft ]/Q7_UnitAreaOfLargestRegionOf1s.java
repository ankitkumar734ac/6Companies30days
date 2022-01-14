class Q7_UnitAreaOfLargestRegionOf1s{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        int result=0;
       for(int i=0;i<grid.length;i++) {
           for(int j=0;j<grid[0].length;j++) {
               if(grid[i][j] == 1) {
                   int num = search(i,j,grid);
                   result = result > num ? result : num;
               }
           }
       }
       return result;
   }
   public int search(int i,int j, int[][]grid) {
       
       if(i < 0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 ) 
           return 0;
       
       grid[i][j] = 0;
       int sum = 0;
       sum += search(i+1,j,grid);
       sum += search(i,j+1,grid);
       sum += search(i,j-1,grid);
       sum += search(i-1,j,grid);
       
       sum += search(i+1,j+1,grid);
       sum += search(i-1,j-1,grid);
       sum += search(i+1,j-1,grid);
       sum += search(i-1,j+1,grid);
       return sum + 1;
   }
}

/*
//                 Second solution

class Solution
{
    int count;
    //Function to check if a given cell (row, col) can be included in DFS.
    static boolean isSafe(int[][] M,int row,int col,boolean[][] visited,int ROW,int COL)
    {
        //if the cell is within the matrix bounds and value at cell is 1 and
        //the cell is not visited, we return true else false.
        return ((row >= 0)&&(row<ROW)&&(col>=0)&& (col < COL)
                             && (M[row][col] == 1 && !visited[row][col]));
    }

    
    void DFS(int[][] M,int row,int col,boolean[][] visited,int ROW,int COL)
    {
        //these arrays are used to get row and column numbers
        //of 8 neighbours of a given cell.
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

        //marking the current cell as visited.
        visited[row][col] = true;

        //iterating over the adjacent cells.
        for (int k = 0; k < 8; k++) 
        {
            //if cell indexes are within range, we increment the count
            //and call the function recursively.
            if (isSafe(M, row + dx[k], col + dy[k],visited, ROW, COL)) 
            {
                count++;
                DFS(M, row + dx[k], col + dy[k],visited, ROW, COL);
            }
        }
    }
    
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        int ROW = grid.length;
        int COL = grid[0].length;
        
        //using boolean array to mark visited nodes.
        boolean[][] visited = new boolean[ROW][COL];

        int result = 0;
        //traversing all the cells of the matrix.
        for (int i = 0; i < ROW; i++) 
        {
            for (int j = 0; j < COL; j++) 
            {
                //if a cell has value 1 is not visited, we call DFS function.
                if (grid[i][j] == 1 && !visited[i][j]) 
                {
                    count = 1;
                    DFS(grid, i, j, visited, ROW, COL);

                    //updating maximum area.
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
}


*/