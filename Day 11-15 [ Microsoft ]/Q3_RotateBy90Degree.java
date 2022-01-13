class Q3_RotateBy90Degree{
	static void rotate(int matrix[][]) 
    {
        int n = matrix.length;
       int t = 0;

       for (int r = 0; r < n; ++r)
           {
        for (int c = r; c < n - r - 1; ++c)
            {
             t = matrix[r][c];
             matrix[r][c] = matrix[c][n - 1 - r]; 
             matrix[c][n - 1 - r] = matrix[n - 1 - r][n - 1 - c];
             matrix[n - 1 - r][n - 1 - c] = matrix[n - 1 - c][r];
             matrix[n - 1 - c][r] = t;
            }
           }
    }
}