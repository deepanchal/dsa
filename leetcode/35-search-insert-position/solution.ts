// https://leetcode.com/problems/search-insert-position/

function searchInsert(nums: number[], target: number): number {
   if (nums[0] === target || target < nums[0]) {
       return 0
   }
   for (let i = 0; i <= nums.length; i++) {
       if (i === nums.length || nums[i] === target) {
         return i
       }
       else if (target > nums[i]) {
          if (target == nums[i + 1] ||  target < nums[i + 1]) {
            return i + 1
          }
       }
   }
   return nums.length;
}

