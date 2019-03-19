package graph;

import java.util.HashMap;
import java.util.List;


public class Search {

	HashMap<Integer, Boolean> visited = new HashMap<>(7);
	
	public void printDFS(Graph graph, int vertex) {
		if(visited.get(vertex) == false) {
			System.out.println(vertex);
			visited.put(vertex,true);
		}
		for(int vertices : graph.adj.get(vertex)) {
			printDFS(graph, vertices);
		}
	}
	
	public void dfs() {
		Graph graph= new Graph(7);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 5);
		graph.addEdge(1, 6);
		graph.addEdge(2, 4);
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		graph.addEdge(6, 4);
		
		for(int i =0 ; i< 7; i++) {
			visited.put(i, false);
		}
	
		printDFS(graph, 0);
	}
	
	public static void main(String[] args) {
		Search s = new Search();
		s.dfs();	
	}
}
