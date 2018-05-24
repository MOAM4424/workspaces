package mayhem;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fill pattern
		Scanner ac = new Scanner(System.in);
		
		for(int i = 0; i<3; i ++) 
		{
			for (int j = 0; j<5; j++)
				{
			if (i == i || j==j) System.out.print("*");
			else System.out.print(" ");
		}
System.out.println();
}

	}

}
