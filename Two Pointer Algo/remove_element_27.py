class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        index1, index2 = 0, 0
        while index2 < len(nums):
            if nums[index2] != val:
                nums[index1] = nums[index2]
                index1 = index1 + 1
            index2 += 1
        return index1
