package tree;

import java.util.HashMap;
import java.util.Map;

class Obj{
	int value;
	int height;
	Obj(int value, int height){
		this.value = value;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return ("value: " + value + " height: " + height);
	}
}
public class TopAndBottomView {
	
	Map<Integer, Obj> ans = new HashMap();
	
	void bottomView(Node root, int horizontalDist, int height){
		if(root == null) {
			return;
		}
		if(ans.get(horizontalDist) == null) {
			ans.put(horizontalDist, new Obj(root.value, height));
		}
		else {
			if(ans.get(horizontalDist).height < height) {
				ans.put(horizontalDist, new Obj(root.value, height));
			}
		}
		bottomView(root.left, horizontalDist - 1, height + 1);
		bottomView(root.right, horizontalDist + 1, height + 1);
	}
	public static void main(String[] args) {
		TopAndBottomView topAndBottomView = new TopAndBottomView();
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
		topAndBottomView.bottomView(root, 0, 0);
		
		System.out.println(topAndBottomView.ans.toString());
	}
}
