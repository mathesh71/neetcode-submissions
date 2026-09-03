class Solution:
    def search(self, nums: List[int], target: int) -> int:
        sum1=sorted(nums)
        found=False
        for i in range(len(sum1)):
            if sum1[i]==target:
                found=True
                break
        if found:
            return i
        else:
            return -1    