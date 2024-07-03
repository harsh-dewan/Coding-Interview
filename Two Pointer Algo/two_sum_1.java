class Solution {
    public int[] twoSum(int[] nums, int target) {
        if( nums.length == 0 ) return null;
        HashMap<Integer,ArrayList<Integer>> indexSave = new HashMap<Integer,ArrayList<Integer>>();
        int arrLength = nums.length;
        for(int index = 0; index < arrLength; index++ ) {
            ArrayList<Integer> arrList = null;
            if( indexSave.getOrDefault(nums[index],null) == null ) {
                arrList = new ArrayList<Integer>();
            }
            else {
                arrList = indexSave.get(nums[index]);
            }
            arrList.add(index);
            indexSave.put(nums[index], arrList);
        }
        int[] finalAns = new int[2];
        for(int i = 0; i < arrLength; i++ ) {
            int a = nums[i];
            int required  = target-a;
            if( required == a && indexSave.getOrDefault(required, null) != null &&
                indexSave.getOrDefault(required, null).size() >= 2
                ) 
            {
                ArrayList<Integer> arrList = indexSave.get(required);
                finalAns[0] = arrList.get(0);
                finalAns[1] = arrList.get(1);
                return finalAns;
            }
            else if(required != a && indexSave.getOrDefault(required, null) != null ) {
                ArrayList<Integer> arrList = indexSave.get(required);
                finalAns[0] = arrList.get(0);
                finalAns[1] = i;
                return finalAns;
            }
        }
        return finalAns;
        
    }
}

/*
 * step1: using hashmap, store the inices of the elements in the array.
 * step2: traverse the array, look for pair indices to form target.
 * 	when looking for pair, 
 * 		check if the same element is making a pair, if yes, check if we have atleast 2 occurence in the given array
 * 		check if different element is making pair, and that element is in the map, add the indices of both these elements and return final array
 *
 */
