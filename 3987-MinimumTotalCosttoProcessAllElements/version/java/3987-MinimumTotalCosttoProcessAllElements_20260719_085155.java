// Last updated: 19/07/2026, 08:51:55
1// AI-converted version of the original C++ solution.
2class Solution {
3    public int minimumCost(int[] nums, int k) {
4        long ops = 0, res = k;
5
6        for (int x : nums) {
7            if (res < x) {
8                long add = (x - res + k - 1L) / k;
9                ops += add;
10                res += add * k;
11            }
12            res -= x;
13        }
14
15        final long MOD = 1_000_000_007L;
16
17        if (ops % 2 == 0) {
18            return (int) (((ops / 2) % MOD) * ((ops + 1) % MOD) % MOD);
19        }
20
21        return (int) ((ops % MOD) * (((ops + 1) / 2) % MOD) % MOD);
22    }
23}