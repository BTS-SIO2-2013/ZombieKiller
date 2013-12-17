/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.client.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import consolefps.controllers.Commande;
import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Menu;
import consolefps.views.ExitOption;

/**
 * 
 * @author krilivye
 */
public class CLI {

	private static BufferedReader systemIn = new BufferedReader(
			new InputStreamReader(System.in));

	private BufferedReader in;

	private ICLIControleur controlleur;

	public CLI() {
		this.in = systemIn;
		this.controlleur = new Menu();
	}

	public BufferedReader getInput() {
		return this.in;
	}

	public void setInput(final BufferedReader in) {
		this.in = in;
	}

	public static BufferedReader getSystemInput() {
		return systemIn;
	}

	public String readInput() {
		String sortie = "";
		try {
			sortie = this.in.readLine();
		} catch (IOException ex) {
			Logger.getLogger(CLI.class.getName()).log(Level.SEVERE, null, ex);
		}
		return sortie;
	}

	public boolean execute() {
		afficherSortieConsole();
		if (isExitCondition()) {
			return false;
		}

		String choix = readInput();
		Commande com = new Commande(choix);

		this.controlleur = this.controlleur.traitementCommande(com);

		return true;
	}

	private void afficherSortieConsole() {
		System.out.println(this.controlleur.affichage());
	}

	private boolean isExitCondition() {
		if (this.controlleur instanceof ExitOption) {
			return true;
		}
		return false;
	}

	public void setControlleur(final ICLIControleur controlleur) {
		this.controlleur = controlleur;
	}

	public ICLIControleur getControlleur() {
		return this.controlleur;
	}
}
