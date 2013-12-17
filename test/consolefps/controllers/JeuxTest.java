/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import consolefps.models.Position;
import consolefps.models.elements.Zombie;

/**
 * 
 * @author krilivye
 */
public class JeuxTest {

	public JeuxTest() {
	}

	@Test
	public void testJeux() {
		// Arrange

		// Act
		Jeux jeux = new Jeux();

		// Assert
		assertTrue(jeux.getJoueur() != null);
		assertTrue(jeux.getGrille() != null);
		assertTrue(jeux.getZombies() != null);

	}

	@Test
	public void testZombie() {
		// Arrange
		Zombie z = new Zombie(0, 0);
		Jeux jeux = new Jeux();

		// Act
		jeux.ajouterZombie(z);

		// Assert
		assertTrue(jeux.getZombies().contains(z));
		assertTrue(jeux.getGrille().getElements().contains(z));
	}

	@Test
	public void testDeplacerLeJoueur() {
		// Arrange
		Jeux jeux = new Jeux();
		Commande com = new Commande("bas");

		// Act
		jeux.traitementCommande(com);

		// Assert
		assertTrue(jeux.getJoueur().getPosition().getY() == 2);
	}

	@Test
	public void testNeFaitRien() {
		// Arrange
		Jeux jeux = new Jeux();
		Commande com = new Commande("attendre");
		Position posAvant = jeux.getJoueur().getPosition();

		// Act
		jeux.traitementCommande(com);

		// Assert
		assertTrue(jeux.getJoueur().getPosition().getX() == posAvant.getX());
		assertTrue(jeux.getJoueur().getPosition().getY() == posAvant.getY());
	}

}
