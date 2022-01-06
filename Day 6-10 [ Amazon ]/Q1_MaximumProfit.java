class Q1_MaximumProfit{
	static int maxProfit(int k, int n, int A[]) {
        int profit[][] = new int[k + 1][ n + 1];
        for (int i = 0; i <= k; i++)
            profit[i][0] = 0;
        for (int j = 0; j <= n; j++)
            profit[0][j] = 0;
        for (int i = 1; i <= k; i++) 
        {
            int prevDiff = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) 
            {
                prevDiff = Math.max(prevDiff,profit[i - 1][j - 1] - A[j - 1]);
                profit[i][j] = Math.max(profit[i][j - 1],A[j] + prevDiff);
            }
        }

        return profit[k][n - 1];
    }
}