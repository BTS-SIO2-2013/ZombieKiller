package consolefps.controllers;

import java.util.HashMap;
import java.util.Map;

import consolefps.controllers.actions.Action;

public class Controlleur implements ICLIControleur {

	private final Map<Commande, Action> listeDesCommandesActions;

	public Controlleur() {
		this.listeDesCommandesActions = new HashMap<>();

	}

	@Override
	public String affichage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICLIControleur traitementCommande(final Commande commande) {
		for (Commande com : this.listeDesCommandesActions.keySet()) {
			if (com.equals(commande)) {
				return this.listeDesCommandesActions.get(com).execute();
			}
		}
		return this;
	}

	public void ajouterCommandeAction(final Commande com, final Action action) {
		this.listeDesCommandesActions.put(com, action);

	}

	public Map<Commande, Action> getListDeCommandesActions() {
		return this.listeDesCommandesActions;
	}

}
