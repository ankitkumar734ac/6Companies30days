class Q13_RottingOranges{
	
    public int orangesRotting(int[][] grid) {
        List<int[]> dirs = List.of(
		                         new int[]{0,-1},
                                 new int[]{0,1},
                                 new int[]{1,0},
                                 new int[]{-1,0});
        
        var dq = new ArrayDeque<int[]>();
        int fresh = 0;
        
        // collect all rottten orange in queue and count fresh orange .
        for(int i =0; i<grid.length; i++){
            for(int j =0; j<grid[i].length; j++){
                if(grid[i][j] == 2) dq.offer(new int[]{i,j});
                else if(grid[i][j] == 1) fresh++;
            }
        }
        
        
        int time = 0;
        
        while(!dq.isEmpty()){
            int size = dq.size();
            
            for(int i=0; i<size; i++){
                int[] curr = dq.poll();
                                                
                for(int[] dir: dirs){
                    int x = curr[0]+dir[0];
                    int y = curr[1]+dir[1];
                    
                    //invalid index
                    if(x<0 || y<0 || x>=grid.length || y>=grid[0].length) continue;
                    
                    if(grid[x][y] == 1){
                        grid[x][y] = 2;  //rotten the fresh orange
                        dq.offer(new int[]{x,y}); // new rotten orange will make other rotten
                        fresh--; // decrease fresh count
                    }
                } 
            }
            //if its not empty mean , it took time to make fresh orange rotten.
            if(!dq.isEmpty()) time++;
        }
    
        
        return fresh == 0 ? time : -1;
    }

}