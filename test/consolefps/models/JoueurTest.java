/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import consolefps.models.elements.Joueur;

/**
 * 
 * @author krilivye
 */
public class JoueurTest {

	public JoueurTest() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
	@Test
	public void testDeplacer() {
		// Arrange
		Sens sens = Sens.BAS;
		Joueur j = new Joueur(0, 0);

		// Act
		j.deplacer(sens);
		System.out.println(sens);
		System.out.println(j.getPosition());

		// Assert
		assertEquals(new Position(0, 1), j.getPosition());
	}

	@Test
	public void testDeplacer2() {
		// Arrange
		Sens sens = Sens.DROITE;
		Joueur j = new Joueur(0, 0);

		// Act
		j.deplacer(sens);

		// Assert
		assertEquals(new Position(1, 0), j.getPosition());

	}

	@Test
	public void testDeplacer3() {
		// Arrange
		Sens sens = Sens.DROITE;
		Joueur j = new Joueur(0, 0);

		// Act
		j.deplacer(sens);
		j.deplacer(sens);

		// Assert
		assertEquals(new Position(2, 0), j.getPosition());
	}

	@Test
	public void testPositionSuivante() {
		// Arrange
		Joueur j = new Joueur(2, 2);
		// Act
		Position posBas = j.positionSuivante(Sens.BAS);
		Position posHaut = j.positionSuivante(Sens.HAUT);
		Position posGauche = j.positionSuivante(Sens.GAUCHE);
		Position posDroite = j.positionSuivante(Sens.DROITE);
		// Assert
		assertEquals(new Position(2, 1), posHaut);
		assertEquals(new Position(2, 3), posBas);
		assertEquals(new Position(1, 2), posGauche);
		assertEquals(new Position(3, 2), posDroite);

	}
}
