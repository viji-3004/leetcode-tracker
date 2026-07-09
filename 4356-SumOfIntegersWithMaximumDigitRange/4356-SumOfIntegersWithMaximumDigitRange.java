// Last updated: 09/07/2026, 10:05:51
class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] range = new int[n];
        int maxRange = -1;

        for(int i = 0;i<n;i++){
            int x = nums[i];
            int maxDigit = 0;
            int minDigit = 9;

            while(x>0){
                int d = x% 10;
                maxDigit = Math.max(maxDigit, d);
                minDigit = Math.min(minDigit, d);
                x/=10;

                
            }
            range[i] = maxDigit - minDigit;
            maxRange = Math.max(maxRange, range[i]);
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(range[i]== maxRange){
                sum += nums[i];
            }
        }
        return sum;
    }
}