package Subarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeNode
{
	public class Node {
		int val;
		Node parent;
		List<Node> children;

		public Node(int val) {
			children = new ArrayList<Node>();
			this.val = val;
		}

		public void addChildren(Node n) {
			children.add(n);  
			n.parent = this;  
		}
	}
	
	public Map<Integer, Node> buildList (int[][] edges)
	{
		Map<Integer, Node> map = new HashMap<Integer, Node>();
		int len = edges.length;
		for (int i = 0; i < len; ++i) {
			Node n = null;
			if (map.containsKey(edges[i][0])) {
				n = map.get(edges[i][0]);
			} else {
				n = new Node(edges[i][0]);      
			}
			map.put(edges[i][0], n); 
			Node child = null;
			if (map.containsKey(edges[i][1])) {
				child = map.get(edges[i][1]);
			} else {
				child = new Node(edges[i][1]);
				map.put(edges[i][1], child);
			}
			n.addChildren(child);  
		}
		return map;
	}
	
	public void print(Map<Integer, Node> map)
	{
		Node root = null;
		for (Integer c: map.keySet())
		{
			if (map.get(c).parent == null) 
			{
				root = map.get(c);
				traversal(root, 0);
			}
		}
	}
	private void traversal(Node root, int depth) 
	{
		if (root == null) 
		{
			return;
		}

		for (int i = 0; i < depth; ++i) {
			System.out.print(" ");
			 
		}
		System.out.println(root.val);
		for (Node child: root.children)
		{
			traversal(child, depth + 1);
		}
	}

	public static void main(String[] args) {

		int[][] edges = {{1, 2}, {2, 3}, {2, 10}, {1, 5}, 
				{5, 6}, {3, 7}, {7, 8}, {3, 9}};
		TreeNode pt = new TreeNode();
		Map<Integer, Node> map = pt.buildList(edges);
		pt.print(map);

	}

}
