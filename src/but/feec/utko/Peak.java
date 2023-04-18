package but.feec.utko;

public class Peak {
	private int id;
	public Peak(int data) {
		// TODO Auto-generated constructor stub
		this.id = data;
	}
	public int getID() {
		return id;
	}
	public void setID(int data) {
		this.id = data;
	}
	@Override
	public String toString() {
		return "Apex [id=" + id + "] ";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(((Peak)obj).getID() == id) {return true;}
		return false;
	}
	
	
	
	

}
