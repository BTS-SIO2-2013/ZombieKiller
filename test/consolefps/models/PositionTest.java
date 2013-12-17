package consolefps.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PositionTest {

	@Test
	public void testDistance() {

		// Arrange
		Position p = new Position(0, 0);
		Position p2 = new Position(2, 2);

		// Act
		double res;
		res = p2.distance(p);

		// Assert
		assertTrue(res == Math.sqrt(8));
	}

	@Test
	public void testDistance2() {

		// Arrange
		Position p = new Position(0, 2);
		Position p2 = new Position(4, 3);

		// Act
		double res;
		res = p2.distance(p);

		// Assert
		assertTrue(res == Math.sqrt(17));
	}

	@Test
	public void deplacerSelonX() {
		// Arrange
		Position pos = new Position(1, 1);

		// Act
		pos.deplacerSelonX(1);

		// Assert
		assertTrue(pos.getX() == 2);
	}

	@Test
	public void deplacerSelonY() {
		// Arrange
		Position pos = new Position(1, 1);

		// Act
		pos.deplacerSelonY(1);

		// Assert
		assertTrue(pos.getY() == 2);
	}
}
