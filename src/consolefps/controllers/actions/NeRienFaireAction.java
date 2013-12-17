package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Jeux;


public class NeRienFaireAction extends Action {
	private final Jeux jeux;

	public NeRienFaireAction(final Jeux jeux) {
		super();
		this.jeux = jeux;
	}

	@Override
	public ICLIControleur execute() {
		super.execute();
		return this.jeux;
	}
}
