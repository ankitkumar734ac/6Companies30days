public class Q8_TotalDecodingMessages{
	
	static long mod = 1000000007;
    public int CountWays(String str)
    {
        char[] digit=str.toCharArray();
        int n=digit.length;
        Long [] dp=new Long[n+1];
        if(n==0 || n==1 && digit[0]=='0'){
            return 0;
        }
        return countDecoding(digit,n,dp);
    }
    static int countDecoding(char[] digit,int n,Long[] dp){
        if(n==0 || n==1){
            return 1;
        }
        if(digit[0]=='0'){
            return 0;
        }
        long count=0;
        if(dp[n]!=null)
           return dp[n].intValue();
        if(digit[n-1]>'0'){
            count=countDecoding(digit,n-1,dp);
        }
        if(digit[n-2]=='1' || (digit[n-2]=='2' && digit[n-1]<'7')){
            count=count%mod+countDecoding(digit,n-2,dp)%mod;
        }
        return (dp[n]=count%mod).intValue();
    }
}