class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        count=0
        for i in nums:
            if i<target:
                count+=1
        return count       