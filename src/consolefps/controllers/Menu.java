/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import consolefps.controllers.actions.JeuxAction;
import consolefps.controllers.actions.OptionsAction;
import consolefps.controllers.actions.QuitAction;

/**
 * 
 * @author krilivye
 */
public class Menu extends Controlleur {

	public Menu() {
		ajouterCommandeAction(new Commande("1"), new JeuxAction(this));
		ajouterCommandeAction(new Commande("2"), new OptionsAction());
		ajouterCommandeAction(new Commande("3"), new QuitAction());

	}

	@Override
	public String affichage() {
		return "Super Zombie Killer\n" + "1 - Jouer\n" + "2 - Options\n"
				+ "3 - Sortir\n";
	}

	@Override
	public ICLIControleur traitementCommande(final Commande commande) {
		ICLIControleur ctrl = super.traitementCommande(commande);
		return ctrl;
	}
}
