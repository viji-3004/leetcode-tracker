// Last updated: 25/07/2026, 14:40:46
1class Solution {
2    private int[] manacher(int[] seq, int sentinel) {
3        int m = seq.length;
4        int[] s = new int[2 * m + 1];
5        Arrays.fill(s, sentinel);
6        for (int i = 0; i < m; ++i) {
7            s[2 * i + 1] = seq[i];
8        }
9        int n = s.length;
10        int[] p = new int[n];
11        int c = 0, r = 0;
12        for (int i = 0; i < n; ++i) {
13            if (i < r) {
14                p[i] = Math.min(r - i, p[2 * c - i]);
15            }
16            while (i - 1 - p[i] >= 0 && i + 1 + p[i] < n && s[i - 1 - p[i]] == s[i + 1 + p[i]]) {
17                p[i]++;
18            }
19            if (i + p[i] > r) {
20                c = i;
21                r = i + p[i];
22            }
23        }
24        return p;
25    }
26
27    public long getSum(int[] A) {
28        int n = A.length;
29        long[] pre = new long[n + 1];
30        for (int i = 0; i < n; ++i) {
31            pre[i + 1] = pre[i] + A[i];
32        }
33        int[] p = manacher(A, 0);
34        long res = 0, cur = 0;
35        for (int i = 0; i < n + n + 1; ++i) {
36            cur = pre[(i + p[i]) / 2] - pre[(i - p[i]) / 2];
37            res = Math.max(res, cur);
38        }
39        return res;
40    }
41}