// Last updated: 29/07/2026, 20:30:26
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    Map<Node, Node> map;
23
24    public void dfs(Node node, Node cloneNode, Map<Node, Node> map) {
25        for (Node neighbor : node.neighbors) {
26
27            // If neighbor is not cloned yet
28            if (!map.containsKey(neighbor)) {
29                Node cloneNeighbor = new Node(neighbor.val);
30                map.put(neighbor, cloneNeighbor);
31
32                cloneNode.neighbors.add(cloneNeighbor);
33                dfs(neighbor, cloneNeighbor, map);
34            } 
35            // If already cloned, reuse it
36            else {
37                cloneNode.neighbors.add(map.get(neighbor));
38            }
39        }
40    }
41
42    public Node cloneGraph(Node node) {
43        if (node == null) return null;
44
45        map = new HashMap<>();
46
47        Node cloneNode = new Node(node.val);
48        map.put(node, cloneNode);
49
50        dfs(node, cloneNode, map);
51        return cloneNode;
52    }
53}