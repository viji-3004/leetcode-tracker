// Last updated: 25/07/2026, 14:44:57
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
4                s.length() < t.length()) {
5            return new String();
6        }
7        int[] map = new int[128];
8        int count = t.length();
9        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
10        /// UPVOTE !
11        for (char c : t.toCharArray()) {
12            map[c]++;
13        }
14
15        char[] chS = s.toCharArray();
16
17        while (end < chS.length) {
18            if (map[chS[end++]]-- > 0) {
19                count--;
20            }
21            while (count == 0) {
22                if (end - start < minLen) {
23                    startIndex = start;
24                    minLen = end - start;
25                }
26                if (map[chS[start++]]++ == 0) {
27                    count++;
28                }
29            }
30        }
31
32        return minLen == Integer.MAX_VALUE ? new String() :
33                new String(chS, startIndex, minLen);
34    }
35}