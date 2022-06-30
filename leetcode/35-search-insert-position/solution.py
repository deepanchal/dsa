# https://leetcode.com/problems/search-insert-position/

class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if nums[0] == target or target < nums[0]:
             return 0
        for (i, num) in enumerate(nums):
            if i + 1 == len(nums):
                return len(nums)
            if nums[i] == target:
                return i
            elif target > nums[i]:
                if target < nums[i + 1] or target == nums[i + 1]:
                    return i + 1
        return len(nums)

