// Last updated: 20/07/2026, 10:15:35
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        if (root == null) return "null";
15
16        StringBuilder sb = new StringBuilder();
17        Queue<TreeNode> q = new LinkedList<>();
18        q.add(root);
19
20        while (!q.isEmpty()) {
21            TreeNode curr = q.poll();
22
23            if (curr == null) {
24                sb.append("null,");
25                continue;
26            }
27
28            sb.append(curr.val).append(",");
29            q.add(curr.left);
30            q.add(curr.right);
31        }
32
33        return sb.toString();
34    }
35
36    // Decodes your encoded data to tree.
37    public TreeNode deserialize(String data) {
38        if (data.equals("null")) return null;
39
40        String[] arr = data.split(",");
41        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
42        Queue<TreeNode> q = new LinkedList<>();
43        q.add(root);
44        int i = 1;
45
46        while (!q.isEmpty() && i < arr.length) {
47            TreeNode curr = q.poll();
48
49            if (!arr[i].equals("null")) {
50                curr.left = new TreeNode(Integer.parseInt(arr[i]));
51                q.add(curr.left);
52            }
53            i++;
54
55            if (i < arr.length && !arr[i].equals("null")) {
56                curr.right = new TreeNode(Integer.parseInt(arr[i]));
57                q.add(curr.right);
58            }
59            i++;
60        }
61
62        return root;
63    }
64}
65
66    
67
68// Your Codec object will be instantiated and called as such:
69// Codec ser = new Codec();
70// Codec deser = new Codec();
71// TreeNode ans = deser.deserialize(ser.serialize(root));