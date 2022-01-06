class Q2_LongestMountainInArray{
    public int longestMountain(int[] nums) {
        int up = 0;
        int down = 0;
        int longest = 0;
        
        for (int idx = 1; idx< nums.length; idx++) {
            
            if (down!=0 && nums[idx-1] < nums[idx] || nums[idx-1] == nums[idx]) {
                up = 0;
                down = 0;
            }
            up += nums[idx-1] < nums[idx] ? 1: 0;
            down += nums[idx-1] > nums[idx] ? 1: 0;
            
            if (up != 0 && down != 0) {
                longest = Math.max(longest, up + down + 1);
            }
        }
        return longest;
    }
}