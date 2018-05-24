import java.util.Scanner;

public class bankingprogram {

	public static void main(String[] args) {
		SavingsAccount priority = new SavingsAccount();
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the balance");
		
		priority.setBalance(sc.nextDouble());
		System.out.println("Original Balance: $" + priority.getBalance());
		
		System.out.println(priority.annualInterest());
		
	
		Scanner d = new Scanner(System.in);
		System.out.println("Amount to deposit");
		System.out.println(priority.deposit(d.nextDouble()));
		
		Scanner w = new Scanner(System.in);
		System.out.println("Amount to be withdrawn");
		System.out.println(priority.withdrawl(w.nextDouble()));
		
		

	}

}
