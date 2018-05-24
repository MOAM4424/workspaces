package mayhem;

import java.util.Scanner;

public class decreasign {
	
	public static void main(String[] args) {
	
	//decreasing pattern
	Scanner ac = new Scanner(System.in);
			
			for(int i = 0; i<5; i ++) 
			{
				for (int j = 0; j<5; j++)
					{
				if (i+j<4) System.out.print("*");
				else System.out.print(" ");
			}
	System.out.println();
	}

}}
