class Q1_MinimumSumPartition{
	public int minDifference(int arr[], int n) 
	{ 
	    int sum=0;
	    for(int a:arr)
	    sum+=a;
	    Integer[][] dp=new Integer[n][sum+1];
	    return subSetDiff(dp,arr,0,0,0);
	} 
	static int subSetDiff(Integer[][] dp,int[] arr,int curr,int s1,int s2){
	    if(curr==arr.length)
	    return Math.abs(s1-s2);
	    if(dp[curr][s1]==null){
	       dp[curr][s1]= Math.min( subSetDiff(dp,arr,curr+1,s1+arr[curr],s2), subSetDiff(dp,arr,curr+1,s1,s2+arr[curr]) );
	    }
	      return dp[curr][s1];  
	    }
}