# Last updated: 7/19/2026, 9:50:57 AM
1from collections import defaultdict
2
3class Solution:
4    def groupAnagrams(self, strs):
5        groups = defaultdict(list)
6
7        for word in strs:
8            key = "".join(sorted(word))
9            groups[key].append(word)
10
11        return list(groups.values())