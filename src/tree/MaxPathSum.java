package tree;

public class MaxPathSum {
	int res=0;
	int compute(Node root) {
		if(root == null) {
			return 0;
		}
		
		int l = compute(root.left);
		int r = compute(root.right);
		
		int max_l_r = Math.max(l, r);
		int max_single = Math.max(max_l_r + root.value,  root.value);
		
		int max_final = Math.max(max_single, l + r + max_single);
		
		res = Math.max(res,  max_final);
		return max_single;
	}
}
