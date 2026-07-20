# Last updated: 7/19/2026, 10:29:58 PM
1from collections import defaultdict, deque
2
3class Solution:
4    def findLadders(self, beginWord, endWord, wordList):
5        wordSet = set(wordList)
6        if endWord not in wordSet:
7            return []
8
9        parents = defaultdict(list)
10        level = {beginWord}
11        found = False
12
13        while level and not found:
14            nextLevel = set()
15
16            for word in level:
17                if word in wordSet:
18                    wordSet.remove(word)
19
20            for word in level:
21                for i in range(len(word)):
22                    for c in "abcdefghijklmnopqrstuvwxyz":
23                        newWord = word[:i] + c + word[i+1:]
24
25                        if newWord in wordSet:
26                            nextLevel.add(newWord)
27                            parents[newWord].append(word)
28
29                            if newWord == endWord:
30                                found = True
31
32            level = nextLevel
33
34        if not found:
35            return []
36
37        result = []
38
39        def dfs(word, path):
40            if word == beginWord:
41                result.append(path[::-1])
42                return
43
44            for parent in parents[word]:
45                dfs(parent, path + [parent])
46
47        dfs(endWord, [endWord])
48
49        return result