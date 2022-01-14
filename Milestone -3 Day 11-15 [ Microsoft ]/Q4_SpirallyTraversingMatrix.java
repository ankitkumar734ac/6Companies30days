class Q4_SpirallyTraversingMatrix{
	ArrayList<Integer> ans=new ArrayList<>();
        int k=0,l=0;
        int i;
        while(k<m && l<n){
            for(i=l;i<n;i++){
                ans.add(arr[k][i]);
            }
            k++;
            for(i=k;i<m;i++){
                ans.add( arr[i][n-1]);
               // num++;
            }
            n--;
            if(k<m){
                for(i=n-1;i>=l;i--){
                    ans.add( arr[m-1][i]);
                   // num++;
                }
                m--;
            }
            if(l<n){
                for(i=m-1;i>=k;i--){
                    ans.add( arr[i][l]);
                    //num++;
                }
                l++;
            }
        }
        return ans;
    }
	
