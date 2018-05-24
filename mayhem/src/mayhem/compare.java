package mayhem;

import java.util.Scanner;
import  java.util.Random;

public class compare {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		System.out.println("Enter #");
		Scanner e = new Scanner(System.in);
		System.out.println("Enter #");
		Scanner f = new Scanner(System.in);
		System.out.println("Enter #");
		int a = d.nextInt();
		int b = e.nextInt();
		int c = f.nextInt();
		
		compare(a,b,c);
	}
		
	
	
	public static void compare(int a, int b, int c) { 
		if (a != b && b != c && a != c) 
			System.out.println("Score: 0  LOSER" );
		else if (a == b && b != c && a != c || b != a && b == c && c != a|| a == c && a != b && c != b)
			System.out.println(" Score: 10  LOSER");
		else if (a==b && b==c)
			System.out.println("Score: 20 WINNER WINNER CHICCIN DINNER!!");
				}
		
	
}

