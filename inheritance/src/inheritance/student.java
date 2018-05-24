package inheritance;

public class student extends person {
	
	private double gpa;
	private double fee;
	
	public student(String first, String last, double gpa, double fee) {
		super(first, last);
		this.gpa = gpa;
		this.fee = fee;
		
	}

	@Override
	public String toString() {
		return "student [gpa=" + gpa + ", fee=" + fee + ", first=" + first + ", last=" + last + "]";
	}
	

}
