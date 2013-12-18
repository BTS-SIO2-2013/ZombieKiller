package consolefps.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import consolefps.controllers.actions.Action;
import consolefps.views.View;

public abstract class Controlleur implements ICLIControleur {

	private final Map<Commande, Action> listeDesCommandesActions;
	private List<View> views;

	public Controlleur() {
		this.listeDesCommandesActions = new HashMap<>();
		this.views = new ArrayList<>();

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

	@Override
	public String afficherViews() {
		String retour = "";
		for (View vue : this.views) {
			retour += vue.afficher();
		}
		return retour;
	}

	@Override
	abstract public String affichage();

}
