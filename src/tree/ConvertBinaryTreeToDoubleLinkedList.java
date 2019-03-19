package tree;

public class ConvertBinaryTreeToDoubleLinkedList {
	
	Node prev = null;
	Node head = null;
	void convert(Node root) {
		if(root == null) {
			return;
		}
		convert(root.left);
		
		if(prev == null) {
			head = root;
		}else {
			root.left = prev;
			prev.right = root;
			
		}
		prev = root;
		convert(root.right);
	}
}
