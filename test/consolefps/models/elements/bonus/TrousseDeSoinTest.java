/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements.bonus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author SpectroDT
 */
public class TrousseDeSoinTest {

	public TrousseDeSoinTest() {
	}

	/**
	 * Test of afficher method, of class TrousseDeSoin.
	 */
	@Test
	public void testAfficher() {
		// Arrange
		TrousseDeSoin soin = new TrousseDeSoin(1, 2);

		// Act
		String s = soin.afficher();

		// Assert
		assertEquals("[s]", s);
	}
}