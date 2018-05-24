package inclass;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Boxprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a = new Scanner(System.in);
System.out.println("Enter Cost per Square Inch");
Scanner b = new Scanner(System.in);
System.out.println("Enter height");
Scanner c = new Scanner(System.in);
System.out.println("Enter length");
Scanner d = new Scanner(System.in);
System.out.println("Enter depth");



box e = new box(a.nextDouble(), b.nextDouble(), c.nextDouble(), d.nextDouble());
System.out.println(e.toString());
System.out.println(e.surfarea() + " inches squared");
System.out.println(e.vol() + " inches cubed");
System.out.println("$" + e.cost());


	}

}
