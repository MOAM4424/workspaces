package mayhem;

import java.util.Scanner;

public class sumlimit {
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("enter #");
		System.out.println("enter #");
		
		int a = input1.nextInt();
		int b = input2.nextInt();
	
		System.out.println(sumLimit(a,b)); 
	}
	
	public static int sumLimit(int a, int b) {
		int length = String.valueOf(a).length();
		int sum = String.valueOf(a+b).length();
		
		if (sum != length){
			return (a);
		}
		else {
			return (a + b);
		}
		
		
	}
}

