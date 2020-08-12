package Gruppe;

import java.util.Scanner;

public class Gruppe1 {

	public static void main(String[] args) {
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		//System.out.println("16 oder 3 oder 15 oder 30?");
		Scanner scan = new Scanner(System.in);
		int bLand = scan.nextInt();
		Bundeslaender b = new Bundeslaender();
		b.pruefeAnzahl(bLand);
		String ausgabe = b.pruefeAnzahl(bLand);
		System.out.println(ausgabe);
				
			scan.close();
		}
	}


