package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoTreeIdentical {
	boolean check(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		
		if(root1 != null && root2 != null)
			return (root1.value == root2.value && check(root1.left, root2.left) && check(root1.right, root2.right));
		
		return false;
	}
	
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		
		list.add('a');
		list.add('b');
		System.out.println(list.get(0));
		System.out.println(list.remove((Character)'a'));
		System.out.println(list.get(0));
		
		
	}
}
