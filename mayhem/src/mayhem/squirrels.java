package mayhem;

import java.util.Scanner;

public class squirrels {
	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("Enter temp");
		int t = temp.nextInt();
		
		Scanner season = new Scanner(System.in);
		System.out.println("Enter season");
		String a = season.nextLine();
		//System.out.println(a);
		
	System.out.println(play(t,a));
	}
	
	public static String play(int t, String a) {
		boolean season = true;
		
		if( a.toLowerCase().equals("summer")) {
			season = true;
			} else if (a.toLowerCase().equals("spring")) {
			season = false;
			}
		else if (a.toLowerCase().equals("fall")) {
			season = false;}
		else if (a.toLowerCase().equals("winter")) {
			season = false;}
	
		

				if (season && t >= 60 && t <= 100) {
					return "play";}
				
				else {
					return "inside"; }
		
		
				
		
	}
	
	
}
