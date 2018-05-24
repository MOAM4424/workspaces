package inheritance;

public class person {
	
	protected String first;
	protected String last;
	protected person(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "person [first=" + first + ", last=" + last + "]";
	}
	
	
	
	

}
