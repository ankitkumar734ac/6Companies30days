import java.util.*;
class Q10_FindMax10NumbersInListHaving10Mentries{
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int ans[]=new int[10];
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		    nums[i]=sc.nextInt();
		for(int i=0;i<10;i++)
		    ans[i]=nums[i];
		for(int i=10/2-1;i>=0;i--)
		    heapify(ans,i,10);
		for(int i=10;i<n;i++)
		{
		    if(nums[i]>ans[0])
		    {
		        ans[0]=nums[i];
		        heapify(ans,0,10);
		    }
		}
		System.out.println("Max 10 elements are:\n");
		Arrays.sort(ans);
		for(int i=0;i<10;i++)
		    System.out.println(ans[i]);
	}
	public static void heapify(int arr[],int i,int n)
	{
	    int large=i;
	    int l=2*i+1;
	    int r=2*i+2;
	    if(l<n && arr[l]<arr[large])
	        large=l;
	    if(r<n && arr[r]<arr[large])
	        large=r;
	    if(large!=i)
	    {
	        int tmp=arr[i];
	        arr[i]=arr[large];
	        arr[large]=tmp;
	        heapify(arr,large,n);
	    }
	}


}