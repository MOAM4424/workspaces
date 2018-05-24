package mayhem;

import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int b = sc.nextInt();
		System.out.println("Enter a number");
		int c = sc.nextInt();
		
		
		System.out.println(min(a,b,c));
	}



		public static int min(int a,int b,int c) {
			if (a < b && a < c)
			{
				return a;
		}
			if (b < a && b < c)
			{
				return b;
			}
			else return c;
		}

	}