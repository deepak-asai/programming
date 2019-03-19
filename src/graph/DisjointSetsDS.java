package graph;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * This algorithm is used for detecting cycles in a graph
 * Refer graph2
 * */
public class DisjointSetsDS {
	
	int arr[] = {-1000, -1, -1, -1, -1, -1, -1, -1, -1};
	int edges[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {2, 4}, {2, 5}, {1, 3}, {6, 8}, {5, 7} };

	public int find(int i) {
		if(arr[i] < 0) {
			return i;
		}
		return find(arr[i]);
	}
	public void union(int x, int y) {
		int xp = find(x);
		int yp = find(y);
		arr[xp] = yp;
	}
	public void algo() {
		for(int i=0; i<9; i++) {
			//edges[i][0] edges[i][1]
			int xp = find(edges[i][0]);
			int yp = find(edges[i][1]);
			if(xp == yp) {
				System.out.print(edges[i][0]+" " + edges[i][1]);
				System.out.println(Arrays.toString(arr));
				System.out.println("cycle is formed");
				continue;
			}
			union(edges[i][0], edges[i][1]);
			System.out.print(edges[i][0]+" " + edges[i][1]);
			System.out.println(Arrays.toString(arr));
		}
		
	}

	public static void main(String[] args) {
		DisjointSetsDS ds = new DisjointSetsDS();
		ds.algo();
		
	}
}
