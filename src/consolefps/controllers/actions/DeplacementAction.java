package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Jeux;
import consolefps.models.Sens;

public class DeplacementAction extends Action {
	private final Jeux jeux;
	private final Sens sens;

	public DeplacementAction(final Sens sens, final Jeux jeux) {
		super();
		this.jeux = jeux;
		this.sens = sens;
	}

	@Override
	public ICLIControleur execute() {
		super.execute();
		if (this.jeux.getGrille().isValide(
				this.jeux.getJoueur().positionSuivante(this.sens))) {
			this.jeux.getJoueur().deplacer(this.sens);
		} else {
			System.out.println("Bim le mur!");
		}
		return this.jeux;
	}
}
