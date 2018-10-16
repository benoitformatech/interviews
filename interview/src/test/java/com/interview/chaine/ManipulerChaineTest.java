package com.interview.chaine;
import static org.junit.Assert.*;

import org.junit.Test;

public class ManipulerChaineTest {

	
	@Test
	public void countABTest()  {
		
	
		ManipulerChaine manChaine = new ManipulerChaine();
		
		assertEquals(manChaine.countAB("atelier"),0);
		assertEquals(manChaine.countAB("web"),1);
		assertEquals(manChaine.countAB("villa web"),2);
		assertEquals(manChaine.countAB("web villa"),2);
		assertEquals(manChaine.countAB("villa waaab web"),3);
		assertEquals(manChaine.countAB("villa waaaa web weeeeb"),4);
	}
	
}
