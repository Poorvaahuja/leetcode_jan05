// using dp, maintained an array, whose elements represents the smallest ending element of all increasing subsequence of i+1.
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length]; // stores the ending elements of increasing subsequences
        int size = 0; // keeps track of current length of longest increasing subsequence
        for(int num : nums){
            int i=0, j=size; // using binary search to find the correct position for number num in tails array
            while(i != j){
                int m =(i+j)/2;
                if(tails[m] < num) // if num is greater than all ending elemens in tails, appending it to the end
                    i= m+1;
                else
                    j=m;
            }
            tails[i] = num; // update the corresponding position in tails with the num
            if(i == size) ++size; // and size incremented
        }
        return size;
    }
}
