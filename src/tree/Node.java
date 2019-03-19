package tree;

public class Node {
	public int value;
	public Node left;
	public Node right;
	
	Node() {
		
	}
	Node(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "value: " + value;
	}
}