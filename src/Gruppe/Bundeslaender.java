package Gruppe;

public class Bundeslaender {
	public String pruefeAnzahl (int anzahlParameter) {
		
		String ergebnis = "";

		if (anzahlParameter == 16) {
			ergebnis = "Richtig!";
		} else 
			if(anzahlParameter < 16) {
			ergebnis = "Du Depp, du! Zu wenig!";
			} else 
			{ergebnis = "Du Depp, du! Zu viele!";
		}
		return ergebnis;
		
}	
}
