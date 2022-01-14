class Q3_IPL2021MatchDay2{
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
      Deque<Integer> dq=new ArrayDeque<>();
      for(int i=0;i<n;i++){
         while(!dq.isEmpty()&&arr[dq.getLast()]<=arr[i]){
            dq.removeLast();
         }
         dq.addLast(i);
         if(dq.getFirst()==i-k){
          dq.removeFirst();
         }
         if(i>=k-1){
           ans.add(arr[dq.getFirst()]);
         }

      }
      return ans;
    }
}