package Gruppe;

public class Bundeslaender {
	public String pruefeAnzahl (int anzahlParameter) {
		
		String ergebnis = "";

		if (anzahlParameter == 16) {
			ergebnis = "Richtig!";
		} else 
			if(anzahlParameter < 16) {
			ergebnis = "Schade, die Anwort ist falsch. Deutschland hat mehr Bundeslšnder.";
			} else 
			{ergebnis = "Schade, die Anwort ist falsch. So viele Bundeslšnder hat Deutschland nicht.";
		}
		return ergebnis;
		
}	
}
