package inclass;

public class student {
	
	student(String name, int age)
	{
	
	this.name=name;
	this.age=age;
	
	
		

}
	private String name;
	private int age;
	private double fee;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public double generateBill() {
		return fee + (fee*.1);
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	
}
	