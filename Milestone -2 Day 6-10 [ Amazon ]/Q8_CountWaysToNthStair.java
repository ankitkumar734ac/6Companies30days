class Q8_CountWaysToNthStair{

    //---> Solution one for this question if order doesn't matter
    /*
	Long countWays(int m){

       return (long)(m/2)+1;
    }  
    */

    //---> Solution two Using DP
    Long countWays(int m){
    	Long res[] = new Long[m+1];
        res[0] = 1L; 
        res[1] = 1L;
        for (int i = 2; i <= m; i++)  
            res[i] = (res[i-2] + 1);   //--> No. of ways to reach i will be ways to reach (i - 2) + 1
     
        return res[m];
    }


	
}