/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

/**
 * 
 * @author krilivye
 */
public class ExitControlleur extends Controlleur {

	public ExitControlleur() {
	}

	@Override
	public String affichage() {
		return "Merci D'avoir Joué!";
	}

	@Override
	public ICLIControleur traitementCommande(final Commande commande) {
		return this;
	}

	@Override
	public String afficherViews() {
		// TODO Auto-generated method stub
		return null;
	}

}
