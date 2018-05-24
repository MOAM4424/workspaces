package mayhem;

import java.util.Scanner;

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int b = sc.nextInt();
		System.out.println("Enter a number");
		int c = sc.nextInt();
		
		remove();
		
		sc.close();
		System.out.println(mid(a,b,c));
	}



		public static int mid(int a,int b,int c) {
			if (b > a && a > c || b>a && c<a) 
			{
				return a;
		}
			if (b > a && b < c || b<a && b>c)
			{
				return b;
			}
			else return c;
		}
		
		public static void remove () {
		Scanner mj = new Scanner(System.in);
		System.out.println("enter a word");
		String d = mj.nextLine();
		
		d = d.replace("a", "");
		
		System.out.println( d );
		
		mj.close();
}		
}