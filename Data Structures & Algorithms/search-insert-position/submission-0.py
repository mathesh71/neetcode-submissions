class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        res=[]
        for i in nums:
            if i<target:
                res.append(i)
        return len(res)        