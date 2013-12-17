package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Jeux;
import consolefps.controllers.Menu;

public class JeuxAction extends Action {
	private final ICLIControleur jeux;

	public JeuxAction(final Menu menu) {
		super();
		this.jeux = new Jeux(menu);
	}

	@Override
	public ICLIControleur execute() {
		super.execute();
		return this.jeux;
	}
}
