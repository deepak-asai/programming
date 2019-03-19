package graph;

import java.util.Stack;

public class DFS {
	
	void dfs() {
		
		int arr[][]= {
				{0, 1, 1, 0, 0, 0},
				{0, 0, 0, 1, 1, 0},
				{0, 0, 0, 0, 1, 0},
				{0, 1, 1, 0, 1, 1},
				{0, 1, 1, 0, 0, 1},
				{0, 1, 1, 0, 0, 0},
		};
		Stack<Integer> s = new Stack<>();
		s.push(0);
		System.out.println(0);
		int[] visited = new int[6];
		
		while(!s.isEmpty()) {
			System.out.println(s.toString());
			int curr_vertex = s.peek();
			boolean pushed = false;
			for(int i = 0; i<6; i++) {
				if(arr[curr_vertex][i] == 1 && visited[i] == 0) {
					s.push(i);
					System.out.println(i);
					visited[i] = 1;
					pushed = true;
					break;
				}
			}
			if(pushed) {
				continue;
			}
			s.pop();
		}
		
	}
	public static void main(String[] args) {
		DFS d= new DFS();
		d.dfs();
	}
	
	
}
