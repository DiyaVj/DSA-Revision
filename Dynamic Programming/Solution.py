from collections import deque


class Solution:
    def countGoodStrings(self, low: int, high: int, zero: int, one: int):
        q=[]
        q=deque()
        ans=0
        q.append('')
        while len(q)!=0:
            top=q.popleft()
            if low<=len(top)<=high:
                ans+=2
                q.append(top+'0'*zero)
                q.append(top+'1'*one)
        return ans
a=Solution()
print(a.countGoodStrings(low = 3, high = 3, zero = 1, one = 1))