package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderSpiral {
	
	Stack<Node> s1 = new Stack<>();
	Stack<Node> s2 = new Stack<>();
	void spiral(Node root) {
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.empty()) {
				Node curr = s1.pop();
				System.out.println(curr.value);
				if(curr.left != null) {
					s2.push(curr.left);
				}
				if(curr.right != null) {
					s2.push(curr.right);
				}
			}
			
			while(!s2.empty()) {
				Node curr = s2.pop();
				System.out.println(curr.value);
				if(curr.right != null) {
					s1.push(curr.right);
				}
				if(curr.left != null) {
					s1.push(curr.left);
				}
			}
		}
	}
	
	public static void main(String[] args) {
	
		LevelOrderSpiral levelOrderSpiral = new LevelOrderSpiral();
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
		levelOrderSpiral.spiral(root);
	
	}
}	
