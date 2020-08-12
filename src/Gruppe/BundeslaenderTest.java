package Gruppe;


import org.junit.Test;

import org.junit.Assert;



public class BundeslaenderTest {
		//String erwartung "Richtig!"
	
		Bundeslaender b = new Bundeslaender();
		
		@Test
		public void bundeslaender16 () {
			Assert.assertEquals("Richtig!", b.pruefeAnzahl(16));
			
		}
			
}
