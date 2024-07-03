class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int numsLength = nums.length;
        int start = 0, end = numsLength - 1;
        int count = 0;
        while( start < end  ) {
            if( nums[start]+nums[end] == k ) {
                count += 1;
                start += 1;
                end -= 1;
            }
            else if( nums[start] +nums[end] <  k ) {
                start += 1;
            }
            else end -= 1;
        }
        return count;
    }
}

/*
 * to maximise the count, sort the array in increasing order
 * same as two sum, just return count of the pairs 
 */
