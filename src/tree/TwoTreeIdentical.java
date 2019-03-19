package tree;

public class TwoTreeIdentical {
	boolean check(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		
		if(root1 != null && root2 != null)
			return (root1.value == root2.value && check(root1.left, root2.left) && check(root1.right, root2.right));
		
		
		return false;
	}
}
