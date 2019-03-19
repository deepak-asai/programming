package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrder {
	
	Map<Integer, List<Integer>> ans= new HashMap<>();
	void verticalOrder(Node root, int horizontal) {
//		System.out.println(root);
		if(root == null) {
			return;
		}
		if(ans.get(horizontal) == null) {
			List<Integer> values = new ArrayList<>();
			values.add(root.value);
			ans.put(horizontal, values);
		}else{
			ans.get(horizontal).add(root.value);
		}
		verticalOrder(root.left, horizontal-1);
		verticalOrder(root.right, horizontal+1);
	}
	public static void main(String[] args) {
		VerticalOrder verticalOrder = new VerticalOrder();
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		e.left = g;
		Node root = a;
		
		//leftAndRightView.leftView(root, 1);
		verticalOrder.verticalOrder(root, 0);
		
		System.out.println(verticalOrder.ans.toString());
	}
}
