package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		ArrayList<student> students = new ArrayList<>();
		
		student s = new student("Mark", "Mayhem", 4.0, 800);
		
		students.add(s);
		
		
		 basicCalc  d= new basicCalc();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		Scanner cs = new Scanner(System.in);
		System.out.println("enter b");

		int a = sc.nextInt();
		int b = cs.nextInt();

	System.out.println(d.sum(a,b));
	System.out.println(d.subtract(a, b));
}
}