# Last updated: 7/19/2026, 10:30:52 PM
1from collections import deque
2
3class Solution:
4    def ladderLength(self, beginWord, endWord, wordList):
5        wordSet = set(wordList)
6
7        if endWord not in wordSet:
8            return 0
9
10        queue = deque([(beginWord, 1)])
11
12        while queue:
13            word, length = queue.popleft()
14
15            if word == endWord:
16                return length
17
18            for i in range(len(word)):
19                for c in "abcdefghijklmnopqrstuvwxyz":
20                    newWord = word[:i] + c + word[i + 1:]
21
22                    if newWord in wordSet:
23                        queue.append((newWord, length + 1))
24                        wordSet.remove(newWord)
25
26        return 0