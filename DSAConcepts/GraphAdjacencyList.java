package DSAConcepts;

import java.util.Vector;

public class GraphAdjacencyList {
	public void addEdge(Vector<Integer>[] adj, int u, int v) {
		adj[u-1].add(v-1);//1-->2  3 -->1,4
	}
	@SuppressWarnings("unchecked")
	public void initGraph(int u, int[][] v, int edge) {
		Vector<Integer>[] adj = new Vector[4];
		
		for( int i = 0; i<adj.length; i++) {
			adj[i]= new Vector<>();
		}
		for(int j = 0;j<edge; j++) {
			addEdge(adj, v[j][0], v[j][1]);
		}
		adjlist(adj,u);
	}
	public void adjlist(Vector<Integer>[] adj, int u) {
		for(int i =0;i<u;i++) {
			System.out.print(i+ " "+"--> ");
			for(int j =0;j<adj[i].size();j++) {
				System.out.print(" "+ adj[i].get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAdjacencyList GAL = new GraphAdjacencyList();
		int vertices =4;
		int edges[][] = { { 1,2 }, { 2,4 }, { 3,1 }, { 3,4 }, { 4,2 } };
		int noOfedges = 5;
		GAL.initGraph(vertices,edges,noOfedges);

	}

}
