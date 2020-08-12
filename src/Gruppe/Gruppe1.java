package Gruppe;

import java.util.Scanner;

public class Gruppe1 {

	public static void main(String[] args) {
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		//System.out.println("16 oder 3 oder 15 oder 30?");

		Scanner scan = new Scanner(System.in);
		int bLand = scan.nextInt();
		if (bLand == 16) {
			System.out.println("Richtig!");
		} else if (bLand < 16) {
			System.out.println("Du Depp, duuuuuu!");
		} else if (bLand > 16) {
			System.out.println("so viele Bundeslaender haben wir nicht");
					
			scan.close();
		}
	}

}
