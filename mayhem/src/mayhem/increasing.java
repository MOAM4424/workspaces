package mayhem;

import java.util.Scanner;

public class increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//increasing pattern
Scanner ac = new Scanner(System.in);
		
		for(int i = 0; i<5; i ++) 
		{
			for (int j = 0; j<5; j++)
				{
			if (i>j) System.out.print("*");
			else System.out.print(" ");
		}
System.out.println();
}


	}

}
