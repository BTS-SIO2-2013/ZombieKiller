package consolefps.views;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import consolefps.models.Grille;

public class GrilleViewTest {

	@Test
	public void testEntete() {
		// Arrange
		Grille grid = new Grille();
		GrilleView gridview = new GrilleView(grid);

		// Act
		String s = gridview.entete();

		// Assert
		assertEquals("  0  1  2  3  4 \n", s);

	}

	@Test
	public void testCaseVide() {
		// Arrange
		Grille grid = new Grille();
		GrilleView gridview = new GrilleView(grid);

		// Act
		String s = gridview.caseVide();

		// Assert
		assertEquals("[ ]", s);

	}

	@Test
	public void afficherLigne() {
		// Arrange
		Grille grid = new Grille();
		GrilleView gridview = new GrilleView(grid);
		// Act
		String s = gridview.afficherLigne(0);

		// Assert
		assertEquals("0[ ][ ][ ][ ][ ]\n", s);
	}

	@Test
	public void testafficherGrille() {
		// Arrange
		Grille grid = new Grille();
		grid.setNblignes(2);
		grid.setNbColonnes(2);
		GrilleView gridview = new GrilleView(grid);

		// Act
		String s = gridview.afficherGrille();

		// Assert
		assertEquals(gridview.entete() + "0[ ][ ]\n" + "1[ ][ ]\n", s);
	}
}
