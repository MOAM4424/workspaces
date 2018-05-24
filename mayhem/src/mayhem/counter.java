package mayhem;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner word = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = word.nextLine();
		char someChar = 'a';
		int count = 0;
		
		
		System.out.println(counter(s, someChar, count));
		}
	
	public static int counter(String s, char searchedChar, int index) {
		if (index >= s.length()) {
			return 0;
		}
		
		int count = s.charAt(index) == searchedChar ? 1 : 0;
		return count + counter(s, searchedChar, index + 1);
		
		}
		
		
		
		
		
	}


