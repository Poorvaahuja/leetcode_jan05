class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0; // if there are no houses, then no robbery
        int prev1 = 0; // initialized two variables
        int prev2 = 0;
        for(int num : nums){
            int temp = prev1; // for each num we are storing max sum value of two non adjacent values
            prev1 = Math.max(prev2+num, prev1); // then shifting them to iterate the array nums
            prev2 = temp;
        }
        return prev1; // returned the maximum sum obtained
    }
}
