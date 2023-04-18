package but.feec.utko;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
	private HashMap<Integer, Peak> peaks = new HashMap<Integer, Peak>();
	private HashSet<Edge> edges = new HashSet<Edge>();
		
	public Graph() {
		
	}
	
	public void add(int idPeak1, int idPeak2, int price) {
		Peak p1 = createOrGet(idPeak1);
		Peak p2 = createOrGet(idPeak2);
		Edge e1 = new Edge(p1, p2, price);
		edges.add(e1);	
	}
	private Peak createOrGet(int idPeak) {
		Peak newPeak = peaks.get(idPeak);
		if(newPeak == null) {
			newPeak = new Peak(idPeak);
			peaks.put(idPeak, newPeak);
		}
		return newPeak;
	}
	public Collection<Peak> getPeaks() {
		return peaks.values();
	}
	public Set<Edge> getEdges() {
		return edges;
	}

	
	
	
}
