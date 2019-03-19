package tree;

public class LeftAndRightView {
	int max_level = 0;
	void rightView(Node root , int level) {
		if(root == null)
			return;
		
		if(max_level < level) {
			System.out.println(root.value);			
			max_level = level;
		}
		

		leftView(root.right, level+1);
		leftView(root.left, level+1);
		
	}
	
	void leftView(Node root , int level) {
		if(root == null)
			return;
		
		if(max_level < level) {
			System.out.println(root.value);			
			max_level = level;
		}
		
		leftView(root.left, level+1);
		leftView(root.right, level+1);
		
	}
	public static void main(String[] args) {
		LeftAndRightView leftAndRightView = new LeftAndRightView();
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
		//e.left = g;
		Node root = a;
		
		//leftAndRightView.leftView(root, 1);
		leftAndRightView.rightView(root, 1);
	}
}
