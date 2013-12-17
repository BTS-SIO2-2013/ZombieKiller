package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Menu;

public class ExitAction extends Action {
	private final ICLIControleur menu;

	public ExitAction(final Menu menu) {
		super();
		this.menu = menu;
	}

	@Override
	public ICLIControleur execute() {
		super.execute();
		return this.menu;
	}
}
