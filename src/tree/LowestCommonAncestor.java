package tree;

public class LowestCommonAncestor {
	
	int n1 = 3;
	int n2 = 6;
	void findLCA(Node root) {
		
		if(root.value > n1 && root.value > n2) {
			findLCA(root.left);
		}
		if(root.value < n1 && root.value < n2) {
			findLCA(root.right);
		}
		
		System.out.println(root.value);
	}
}
