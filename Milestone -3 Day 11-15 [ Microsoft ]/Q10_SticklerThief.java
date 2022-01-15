class Q10_SticklerThief{
	public int FindMaxSum(int arr[], int n)
    {
        Integer[] dp=new Integer[n+1];
        return maxloot(arr,0,dp);
    }
    int maxloot(int[] arr,int index,Integer[] dp){
        
        if(index>=arr.length)
          return 0;
        if(dp[index]!=null)
        return dp[index];
       int a1=arr[index]+maxloot(arr,index+2,dp);
       int a2=maxloot(arr,index+1,dp);
       return dp[index]=Math.max(a1,a2);
    }
}