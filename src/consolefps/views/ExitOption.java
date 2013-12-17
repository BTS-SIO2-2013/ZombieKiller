/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.views;

import consolefps.controllers.Commande;
import consolefps.controllers.ICLIControleur;

/**
 * 
 * @author krilivye
 */
public class ExitOption implements ICLIControleur {

	public ExitOption() {
	}

	@Override
	public String affichage() {
		return "Merci D'avoir Joué!";
	}

	@Override
	public ICLIControleur traitementCommande(final Commande commande) {
		return this;
	}

}
