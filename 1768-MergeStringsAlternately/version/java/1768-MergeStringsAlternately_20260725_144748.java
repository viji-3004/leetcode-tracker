// Last updated: 25/07/2026, 14:47:48
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder result = new StringBuilder();
4        int i = 0;
5        while (i < word1.length() || i < word2.length()) {
6            if (i < word1.length()) {
7                result.append(word1.charAt(i));
8            }
9            if (i < word2.length()) {
10                result.append(word2.charAt(i));
11            }
12            i++;
13        }
14        return result.toString();
15    }
16}