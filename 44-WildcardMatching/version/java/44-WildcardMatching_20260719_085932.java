// Last updated: 7/19/2026, 8:59:32 AM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] lastIndex = new int[26];
4        boolean[] visited = new boolean[26];
5
6        for (int i = 0; i < s.length(); i++) {
7            lastIndex[s.charAt(i) - 'a'] = i;
8        }
9
10        Stack<Character> stack = new Stack<>();
11
12        for (int i = 0; i < s.length(); i++) {
13            char c = s.charAt(i);
14
15            if (visited[c - 'a']) {
16                continue;
17            }
18
19            while (!stack.isEmpty()
20                    && stack.peek() > c
21                    && lastIndex[stack.peek() - 'a'] > i) {
22                visited[stack.pop() - 'a'] = false;
23            }
24
25            stack.push(c);
26            visited[c - 'a'] = true;
27        }
28
29        StringBuilder result = new StringBuilder();
30
31        for (char ch : stack) {
32            result.append(ch);
33        }
34
35        return result.toString();
36    }
37}