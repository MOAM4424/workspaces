
public abstract class Account {
	
	protected double balance;
	
	
	public double deposit(double b) {
	
	return balance = balance + b;
	

}

	public double withdrawl(double b) {
		
		return balance = balance - b;
	}
	
	public abstract double annualInterest();

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}