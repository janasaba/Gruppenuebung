package Gruppe;

public class Bundeslaender {
	public String pruefeAnzahl (int anzahlParameter) {
		
		String ergebnis = "";

		if (anzahlParameter == 16) {
			ergebnis = "Richtig!";
		} else 
			if(anzahlParameter < 16) {
			ergebnis = "Schade, die Anwort ist falsch. Deutschland hat mehr Bundesl�nder.";
			} else 
			{ergebnis = "Schade, die Anwort ist falsch. So viele Bundesl�nder hat Deutschland nicht.";
		}
		return ergebnis;
		
}	
}
