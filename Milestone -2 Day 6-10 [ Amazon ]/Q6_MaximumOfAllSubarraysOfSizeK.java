class Q6_MaximumOfAllSubarraysOfSizeK{
	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> res = new ArrayList <Integer> (0);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        
        //iterating over first k elements or first window of array.
        for(i  = 0; i < k ; i++)
        {
            //for every element, the previously smaller elements 
            //are useless so removing them from deque.
            while(dq.isEmpty() == false && arr[i] >= arr[dq.peekLast()])
              dq.pollLast();
            
            //adding new element at back of deque.  
            dq.add(i);
        }
        
        //iterating over the rest of the elements.
        for(; i < n; i++)
        {
            //the element at the front of the deque is the largest 
            //element of previous window, so adding it to the list.
            res.add(arr[dq.peek()]);
            
            //removing the elements which are out of this window.
            while(dq.isEmpty() == false && (dq.peekFirst() <= i-k))
               dq.pollFirst();
            
            //removing all elements smaller than the element being  
            //added currently (removing useless elements). 
            while(dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();
            
            //adding new element at back of deque.    
            dq.add(i);
        }
        
        //the element at the front of the deque is the largest 
        //element of last window, so adding it to the list.
        res.add(arr[dq.peek()]);
        dq.pollFirst();
           
        //returning the list.
        return res;
          
    }
}