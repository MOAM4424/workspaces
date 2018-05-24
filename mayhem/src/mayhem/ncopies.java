package mayhem;

import java.util.Scanner;

public class ncopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a String.");
		String b = a.nextLine();
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number of times");
		int c = n.nextInt();
		
		System.out.println(multiply(b,c));
		
	}
	
	public static String multiply(String b, int c) { 
		String newWord = " ";
		
			for (int i = 0; i<c; i++)
				newWord = newWord.concat(b);
			return newWord;
			
	
		
		
}
}