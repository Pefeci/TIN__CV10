package but.feec.utko;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.add(1, 2, 2);
		g.add(2, 3, 19);
		g.add(3, 4, 9);
		g.add(1, 5, 8);
		g.add(1, 6, 14);
		g.add(5, 6, 21);
		g.add(2, 6, 25);
		g.add(6, 3, 17);
		g.add(6, 7, 13);
		g.add(7, 3, 5);
		g.add(7, 4, 1);
		KruskalAlgorithm k = new KruskalAlgorithm(g);
		ArrayList<Edge> miSpan = k.getSpanningTree();
		System.out.println("Min Skeleton of graph: \n");
		System.out.println(miSpan);
		

	}

}
