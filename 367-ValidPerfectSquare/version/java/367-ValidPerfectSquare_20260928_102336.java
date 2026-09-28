// Last updated: 28/09/2026, 10:23:36
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long left = 1, right = num;
4        while (left <= right) {
5            long mid = (left + right) / 2;
6            if (mid * mid == num) return true; // check if mid is perfect square
7            if (mid * mid < num) { // mid is small -> go right to increase mid
8                left = mid + 1;
9            } else {
10                right = mid - 1; // mid is large -> to left to decrease mid
11            }
12        }
13        return false;
14    }
15}