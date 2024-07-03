class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int[] ans = new int[2];
        while( start < end ) {
            if( nums[start] + nums[end] == target ) {
                ans[0] = ++start;
                ans[1] = ++end;
                return ans;
            }
            else if( nums[start] + nums[end] < target ) start += 1;
            else end -= 1;
        }
        return null;
    }
}

/*
 * 
 * since th given array is sorted, we can use the two pointer algorithm to solve the questions
 * keeping one pointer to start and another to end, 
 * we can look for the indices where elements sum to target.
 * if sum is greater than target, end position is moved leftwards to elements with less values
 * if sum is less than target, we need big element to make the target, then we will shift the start pointer to its right
 */
