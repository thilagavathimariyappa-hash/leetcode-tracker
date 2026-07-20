# Last updated: 7/19/2026, 10:31:32 PM
1class Solution:
2    def longestConsecutive(self, nums):
3        numSet = set(nums)
4        longest = 0
5
6        for num in numSet:
7            # Start of a sequence
8            if num - 1 not in numSet:
9                current = num
10                length = 1
11
12                while current + 1 in numSet:
13                    current += 1
14                    length += 1
15
16                longest = max(longest, length)
17
18        return longest