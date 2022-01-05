public class Q3_CountSubArrayProductLessThanK{
	public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int j=0,ans=0;
        long p=1;
        for(int i=0;i<n;i++){
            p*=a[i];
            while(j<n && p>=k){
                p/=a[j];
                j++;
            }
            ans+=(i-j+1);
        }
        return ans;
    }
}