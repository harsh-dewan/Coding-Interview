class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        start = 0
        end = len(s)-1
        while start < end:
            temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start  =  start + 1
            end = end - 1
        return
