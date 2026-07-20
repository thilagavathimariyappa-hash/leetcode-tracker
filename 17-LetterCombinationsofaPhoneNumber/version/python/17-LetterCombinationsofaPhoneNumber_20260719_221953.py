# Last updated: 7/19/2026, 10:19:53 PM
1class Solution:
2    def fullJustify(self, words, maxWidth):
3        result = []
4        i = 0
5
6        while i < len(words):
7            line_len = len(words[i])
8            j = i + 1
9
10            while j < len(words) and line_len + 1 + len(words[j]) <= maxWidth:
11                line_len += 1 + len(words[j])
12                j += 1
13
14            line_words = words[i:j]
15            num_words = j - i
16            total_chars = sum(len(word) for word in line_words)
17
18            # Last line or line with one word
19            if j == len(words) or num_words == 1:
20                line = " ".join(line_words)
21                line += " " * (maxWidth - len(line))
22            else:
23                total_spaces = maxWidth - total_chars
24                space_between = total_spaces // (num_words - 1)
25                extra_spaces = total_spaces % (num_words - 1)
26
27                line = ""
28                for k in range(num_words - 1):
29                    line += line_words[k]
30                    line += " " * (space_between + (1 if k < extra_spaces else 0))
31                line += line_words[-1]
32
33            result.append(line)
34            i = j
35
36        return result