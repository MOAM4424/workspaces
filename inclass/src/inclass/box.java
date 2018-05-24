package inclass;

public class box {

	
	//construct box
	box(double coMPI, double height, double length, double depth) {
		
		this.coMPI = coMPI;
		this.height = height;
		this.length = length;
		this.depth = depth;
		
	}
	
	
	
	//Properties
	private double coMPI;
	private double height;
	private double length;
	private double depth;
	
	//Getters and Setters
	public double getCoMPI() {
		return coMPI;
	}
	public void setCoMPI(double coMPI) {
		this.coMPI = coMPI;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	//To string
	@Override
	public String toString() {
		return "box [coMPI=" + coMPI + ", height=" + height + ", length=" + length + ", depth=" + depth + "]";
	}
	
	//Methods
	//Surface Area
	public double surfarea() {
		return length * height;
	}
	
	
	//Volume
	public double vol() {
		return surfarea() * depth;
		
	}
	
	
	//Cost
	public double cost() {
		return surfarea() * 6;
		
	}
}
