class Q14_MinimumSizeSubarraySum{
	 public int minSubArrayLen(int target, int[] nums) {
        int i =0 , j = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int currSum = 0;
        
        while(j < n){
            if(j < n && currSum >= target){
                currSum += nums[j++];
            }
            
            while(j < n && currSum < target){
                currSum += nums[j++];
            }
            
            if(currSum >= target){
                
                while(i< j && currSum - nums[i] >= target){
                    currSum -= nums[i++];
                }
                
                min = Math.min(min , j- i);
            }
            
            
        }
        
        if(min == Integer.MAX_VALUE) return 0;
        
        return min ;
             
    }
}