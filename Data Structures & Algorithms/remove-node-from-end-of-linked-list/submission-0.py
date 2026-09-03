# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr=head
        count=0
        while curr:
            count+=1
            curr=curr.next
        length=count-n
        if length==0:
            return head.next
        cur=head
        count1=0
        while cur and cur.next:
            
            if count1==length-1:
                cur.next=cur.next.next
                break
            
            cur=cur.next
            count1+=1
            
        return head