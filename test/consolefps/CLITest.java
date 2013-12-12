/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import consolefps.controllers.ICLIControleur;
import consolefps.views.ExitOption;

/**
 * 
 * @author krilivye
 */
public class CLITest {

	public CLITest() {
	}

	@Test
	public void possedeUnControlleurParDefaut() {
		// Arrange

		// Act
		CLI cli = new CLI();

		// Assert
		assertTrue(cli.getControlleur() != null);
	}

	@Test
	public void possedeUnInputParDefaut() {
		// Arrange
		CLI menu = new CLI();
		// Act
		try (BufferedReader in = menu.getInput()) {

			// Assert
			assertTrue(in != null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testLectureCommande() {
		// Arrange
		BufferedReader in = new BufferedReader(new StringReader("1"));
		CLI cli = new CLI();
		cli.setInput(in);

		// Act
		String lecture = cli.readInput();

		// Assert
		assertEquals("1", lecture);
	}

	@Test
	public void sortAvecLeControleurDeSortie() {
		// Arrange
		BufferedReader in = new BufferedReader(new StringReader("3"));
		CLI cli = new CLI();
		cli.setInput(in);
		ICLIControleur ctrl = new ExitOption();
		cli.setControlleur(ctrl);

		// Act
		boolean retour = cli.execute();

		// Assert
		assertFalse(retour);
	}
}
