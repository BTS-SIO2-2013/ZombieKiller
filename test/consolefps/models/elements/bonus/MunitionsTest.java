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
public class MunitionsTest {

	public MunitionsTest() {
	}

	/**
	 * Test of afficher method, of class Munitions.
	 */
	@Test
	public void testAfficher() {
		// Arrange
		Munitions ammo = new Munitions(1, 2);

		// Act
		String s = ammo.afficher();

		// Assert
		assertEquals("[m]", s);
	}
}