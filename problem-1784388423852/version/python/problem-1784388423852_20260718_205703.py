# Last updated: 7/18/2026, 8:57:03 PM
1class Solution(object):
2    def canReach(self, start, target):
3        start_color = (start[0]+start[1])%2
4        target_color = (target[0]+target[1])%2
5        if start_color == target_color:
6            return True
7        return False
8        