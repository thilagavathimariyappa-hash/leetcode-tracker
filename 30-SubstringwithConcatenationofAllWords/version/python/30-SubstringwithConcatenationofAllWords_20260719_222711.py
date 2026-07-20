# Last updated: 7/19/2026, 10:27:11 PM
1from collections import Counter
2
3class Solution:
4    def findSubstring(self, s, words):
5        if not s or not words:
6            return []
7
8        word_len = len(words[0])
9        word_count = len(words)
10        total_len = word_len * word_count
11        n = len(s)
12
13        word_map = Counter(words)
14        result = []
15
16        for offset in range(word_len):
17            left = offset
18            count = 0
19            window = {}
20
21            for right in range(offset, n - word_len + 1, word_len):
22                word = s[right:right + word_len]
23
24                if word in word_map:
25                    window[word] = window.get(word, 0) + 1
26                    count += 1
27
28                    while window[word] > word_map[word]:
29                        left_word = s[left:left + word_len]
30                        window[left_word] -= 1
31                        left += word_len
32                        count -= 1
33
34                    if count == word_count:
35                        result.append(left)
36
37                        left_word = s[left:left + word_len]
38                        window[left_word] -= 1
39                        left += word_len
40                        count -= 1
41                else:
42                    window.clear()
43                    count = 0
44                    left = right + word_len
45
46        return result