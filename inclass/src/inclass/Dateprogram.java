package inclass;

import java.util.Scanner;

public class Dateprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner m = new Scanner(System.in);
		System.out.println("enter month");
		
		Scanner d = new Scanner(System.in);
		System.out.println("enter day");
		
		Scanner y = new Scanner(System.in);
		System.out.println("enter year");
		
		date now = new date(m.nextInt(), d.nextInt(), y.nextInt());
		
		System.out.println(now.displayDate());
		
		
		
	}

}
