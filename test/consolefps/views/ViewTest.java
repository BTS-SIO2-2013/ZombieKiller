package consolefps.views;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ViewTest {

	@Test
	public void test() {
		View view = new View();

		String vue = view.afficher();

		assertTrue(vue == "");
	}

}
