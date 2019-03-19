package tree;


public class BinaryTree {

	void inorder(Node root) { 
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(root.value);
		inorder(root.right);
	}
	
	void preorder(Node root) { 
		if(root == null)
			return;

		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}
	
	void postorder(Node root) { 
		if(root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.value);
	}
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		//Node f = new Node(6);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		//c.left = f;
		
		Node root = a;
		
		//inorder
		//binaryTree.inorder(root);
		
		//preorder
		binaryTree.preorder(root);
		
		//postorder
		//binaryTree.postorder(root);
		
		
	}
	
	
}
