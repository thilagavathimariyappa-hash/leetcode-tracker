// Last updated: 7/11/2026, 4:26:12 AM
1class Solution {
2    public int maxFreqSum(String s) {
3        int[] count = new int[26];
4
5        // Count frequency of each letter
6        for (char c : s.toCharArray()) {
7            count[c - 'a']++;
8        }
9
10        int maxVowel = 0;
11        int maxConsonant = 0;
12
13        // Find maximum vowel and consonant frequencies
14        for (int i = 0; i < 26; i++) {
15            char ch = (char) ('a' + i);
16
17            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
18                maxVowel = Math.max(maxVowel, count[i]);
19            } else {
20                maxConsonant = Math.max(maxConsonant, count[i]);
21            }
22        }
23
24        return maxVowel + maxConsonant;
25    }
26}