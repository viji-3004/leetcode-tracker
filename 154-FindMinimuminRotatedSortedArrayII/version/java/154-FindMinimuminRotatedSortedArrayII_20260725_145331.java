// Last updated: 25/07/2026, 14:53:31
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
4        
5        Arrays.sort(filteredNums);
6        
7        int target = 1;
8        for (int n : filteredNums) {
9            if (n == target) {
10                target++;
11            } else if (n > target) {
12                return target;
13            }
14        }
15        
16        return target;        
17    }
18}