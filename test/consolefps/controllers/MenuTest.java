/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * @author krilivye
 */
public class MenuTest {

	public MenuTest() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
	@Test
	public void afficherMenu() {
		// Arrange
		Menu menu = new Menu();

		// Act
		String s = menu.affichage();

		// Assert
		assertEquals("Super Zombie Killer\n" + "1 - Jouer\n" + "2 - Options\n"
				+ "3 - Sortir\n", s);
	}

	@Test
	public void testJeuxOption() {
		// Arrange
		Menu menu = new Menu();
		Commande com = new Commande("1");

		// Act
		ICLIControleur ctrl = menu.traitementCommande(com);

		// Assert
		assertTrue(ctrl instanceof Jeux);
	}

	@Test
	public void testOption() {
		// Arrange
		Menu menu = new Menu();
		Commande com = new Commande("2");

		// Act
		ICLIControleur ctrl = menu.traitementCommande(com);

		// Assert
		assertTrue(ctrl instanceof Options);
	}
}
