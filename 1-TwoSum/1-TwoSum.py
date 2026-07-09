# Last updated: 09/07/2026, 10:09:02
class Solution:
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

def _driver():
    param_1 = [2, 7, 11, 15]
    param_2 = 9
    ret = Solution().twoSum(param_1, param_2)
    print(ret)

_driver()
