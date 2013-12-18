package consolefps.controllers.actions;

import consolefps.controllers.ExitControlleur;
import consolefps.controllers.ICLIControleur;

public class QuitAction extends Action {
	private static final ExitControlleur exit = new ExitControlleur();

	@Override
	public ICLIControleur execute() {
		super.execute();
		return exit;
	}
}
