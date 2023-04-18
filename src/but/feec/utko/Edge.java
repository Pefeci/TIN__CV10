package but.feec.utko;

public class Edge {
	private Peak apex1;
	private Peak apex2;
	private int price;
	public Edge(Peak apex1, Peak apex2, int prize) {
		this. apex1 = apex1;
		this. apex2 = apex2;
		this. price = prize;
		// TODO Auto-generated constructor stub
	}
	public Peak getApex1() {
		return apex1;
	}
	public void setApex1(Peak apex1) {
		this.apex1 = apex1;
	}
	public Peak getApex2() {
		return apex2;
	}
	public void setApex2(Peak apex2) {
		this.apex2 = apex2;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Edge [apex1=" + apex1 + ", apex2=" + apex2 + ", prize=" + price + "] \n";
	}
	
	
	
	
	

}
