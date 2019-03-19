package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	public int V;
	public List<List<Integer>> adj;
	public Graph(int v) {
		V = v;
		
		adj = new ArrayList<>(V);
		for(int i=0; i<V; i++) {
			adj.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int src, int dest) {
		adj.get(src).add(dest);
	}

}

//12

//7+9
