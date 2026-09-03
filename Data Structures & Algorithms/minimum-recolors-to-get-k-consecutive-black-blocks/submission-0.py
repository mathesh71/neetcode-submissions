class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        window=blocks[:k].count('W')
        count=window
        for i in range(k,len(blocks)):
            if blocks[i]=='W':
                window+=1
            if blocks[i-k]=='W':
                window-=1
            count=min(count,window)
        return count