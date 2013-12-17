package consolefps.models.elements.arme;

import static org.junit.Assert.*;

import org.junit.Test;

import consolefps.models.elements.arme.Hache;

public class testHache {

	@Test
	public void testAfficherHache() {
		 Hache h = new Hache(0,0);
		 String s = h.afficher();
		 assertEquals("[h]",s);
	}

}
