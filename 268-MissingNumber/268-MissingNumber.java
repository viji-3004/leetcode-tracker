// Last updated: 09/07/2026, 10:06:46
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n *(n+1)/2;
        for(int num: nums){
            sum -=num;
        }
        return sum;
        
    }
}