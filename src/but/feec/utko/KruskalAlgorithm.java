package but.feec.utko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class KruskalAlgorithm {
	private Graph g;
	public KruskalAlgorithm(Graph g) {
		this.g = g;
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Edge> getSpanningTree() {
		//create Forest
		HashMap<Peak, Set<Peak>> forest = new HashMap<Peak, Set<Peak>>();
		initializeForest(forest);
		ArrayList<Edge> minSpanTree = new ArrayList<Edge>();
		findSkeletOfGraph(forest, minSpanTree);
		return minSpanTree;
	}
	
	
	private void initializeForest(HashMap<Peak, Set<Peak>> forest) {
		for(Peak peak: g.getPeaks()) {
			Set<Peak> peakSet = new HashSet<Peak>();
			peakSet.add(peak);
			forest.put(peak, peakSet);
		}
	}
	
	private void findSkeletOfGraph(HashMap<Peak, Set<Peak>> forest, ArrayList<Edge> minSpanTree) {
		LinkedList<Edge> edgesLinked = new LinkedList<Edge>();
		edgesLinked.addAll(g.getEdges());
		Collections.sort(edgesLinked, new ComparatorEdgesByPrice());
		
		for(Edge edge: edgesLinked) {
			Set<Peak> peakSet1 = forest.get(edge.getApex1());
			Set<Peak> peakSet2 = forest.get(edge.getApex2());
			if(!peakSet1.equals(peakSet2)) {
				minSpanTree.add(edge);
				
				peakSet1.addAll(peakSet2);
				for(Peak p: peakSet1) {
					forest.put(p, peakSet1);
				}
			}
			
		}
		
	}
		
	private class ComparatorEdgesByPrice implements Comparator<Edge> {
			@Override
			public int compare(Edge o1, Edge o2) {
				Integer price1 = o1.getPrice();
				Integer price2 = o2.getPrice();
				return price1.compareTo(price2);
			}
		}
		
		
}


