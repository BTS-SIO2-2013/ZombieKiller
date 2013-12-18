package consolefps.views;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GrilleViewTest {

	@Test
	public void testAfficheUneGrille() {
		View grilleview = new GrilleView();

		String vue = grilleview.afficher();

		assertTrue(vue == "");
	}
}
