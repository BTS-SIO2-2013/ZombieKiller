package consolefps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SensTest {

	@Test
	public void testPositionSuivanteBAS() {
		// Arrange
		Sens sens = Sens.BAS;
		Position pos = new Position(0, 0);

		// Act
		Position suivante = sens.positionSuivante(pos);

		// Assert
		assertEquals(new Position(0, 1), suivante);
	}

	@Test
	public void testDeplacerBAS() {
		// Arrange
		Sens sens = Sens.BAS;
		Position pos = new Position(0, 0);

		// Act
		sens.deplacer(pos);

		// Assert
		assertEquals(new Position(0, 1), pos);
	}

	@Test
	public void testPositionSuivanteHAUT() {
		// Arrange
		Sens sens = Sens.HAUT;
		Position pos = new Position(0, 0);

		// Act
		Position suivante = sens.positionSuivante(pos);

		// Assert
		assertEquals(new Position(0, -1), suivante);
	}

	@Test
	public void testPositionSuivanteGAUCHE() {
		// Arrange
		Sens sens = Sens.GAUCHE;
		Position pos = new Position(0, 0);

		// Act
		Position suivante = sens.positionSuivante(pos);

		// Assert
		assertEquals(new Position(-1, 0), suivante);
	}

	@Test
	public void testPositionSuivanteDROITE() {
		// Arrange
		Sens sens = Sens.DROITE;
		Position pos = new Position(0, 0);

		// Act
		Position suivante = sens.positionSuivante(pos);

		// Assert
		assertEquals(new Position(1, 0), suivante);
	}

	@Test
	public void testPositionSuivanteATTENDRE() {
		// Arrange
		Sens sens = Sens.ATTENDRE;
		Position pos = new Position(1, 1);

		// Act
		Position suivante = sens.positionSuivante(pos);

		// Assert
		assertEquals(new Position(1, 1), suivante);
	}
}
