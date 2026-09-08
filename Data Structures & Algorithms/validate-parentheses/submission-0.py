class Solution:
    def isValid(self, s: str) -> bool:
        ch={')':'(',']':'[','}':'{'}
        stack=[]
        found=True
        for i in s:
            if i in ch:
                if not stack or stack[-1]!=ch[i]:
                    found=False
                    break
                stack.pop()
            else:
                stack.append(i)
        if found and len(stack)==0:
            return True
        else:
            return False