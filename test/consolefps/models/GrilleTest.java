package consolefps.models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import consolefps.models.elements.Joueur;
import consolefps.models.elements.arme.Hache;
import consolefps.models.elements.decors.Mur;
import consolefps.views.GrilleView;

/**
 * 
 * @author krilivye
 */
public class GrilleTest {

	public GrilleTest() {
	}

	@Test
	public void testGrilleParDefaut() {
		// Act
		Grille grid = new Grille();

		// Assert
		assertEquals(5, grid.getNbColonnes());
		assertEquals(5, grid.getNbLignes());
		assertTrue(grid.getElements() != null);
	}

	@Test
	public void testisValide() {
		// Arrange
		Grille grid = new Grille(2, 1);
		Hache hache = new Hache(0, 0);
		Mur mur = new Mur(2, 1);

		// Act
		grid.ajouterElement(hache);
		grid.ajouterElement(mur);

		// Assert
		assertTrue(grid.isValide(hache.getPosition()));
		assertFalse(grid.isValide(mur.getPosition()));

	}

	@Test
	public void testisDecors() {
		// Arrange
		Grille grid = new Grille(2, 1);
		Hache hache = new Hache(0, 0);
		Mur mur = new Mur(2, 1);

		// Act
		grid.ajouterElement(hache);
		grid.ajouterElement(mur);

		// Assert
		assertFalse(grid.isDecors(hache.getPosition()));
		assertTrue(grid.isDecors(mur.getPosition()));
	}

	@Test
	public void testisDansGrille() {
		// Arrange
		Grille grid = new Grille(1, 1);
		Joueur j = new Joueur(0, 0);
		Joueur j2 = new Joueur(0, 0);

		// Act
		grid.ajouterElement(j);
		grid.ajouterElement(j2);
		j.deplacer(Sens.HAUT);

		// Assert
		assertFalse(grid.isDansLaGrille(j.getPosition()));
		assertTrue(grid.isDansLaGrille(j2.getPosition()));
	}

	@Test
	public void testCasesSuivantes() {
		// Arrange
		Grille grid = new Grille(2, 1);
		Joueur j = new Joueur(0, 0);
		grid.ajouterElement(j);
		GrilleView gridview = new GrilleView(grid);

		// Act
		List<Position> actual = grid.casesSuivantes(j);

		// Assert
		System.out.println(gridview.afficherGrille());
		List<Position> expected = new LinkedList<>();
		expected.add(new Position(1, 0));
		assertEquals(expected, actual);
	}

}
