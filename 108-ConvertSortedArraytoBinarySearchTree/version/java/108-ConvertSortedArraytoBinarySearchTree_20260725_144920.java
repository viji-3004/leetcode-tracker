// Last updated: 25/07/2026, 14:49:20
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return convert(nums, 0, nums.length - 1);        
19    }
20
21    private TreeNode convert(int[] nums, int left, int right) {
22        if (left > right) {
23            return null;
24        }
25        
26        int mid = left + (right - left) / 2;
27        
28        TreeNode node = new TreeNode(nums[mid]);
29        
30        node.left = convert(nums, left, mid - 1);
31        node.right = convert(nums, mid + 1, right);
32        
33        return node;
34    }    
35}