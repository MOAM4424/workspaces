package mayhem;

import java.util.Scanner;

public class cols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//columns
		Scanner ac = new Scanner(System.in);
				
				for(int i = 0; i<=5; i ++) 
				{
					for (int j = 0; j<=5; j++)
						{
					if (j>=0) System.out.print(j);
					else System.out.print(" ");
				}
		System.out.println();
		}
			
}}
