package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;
import consolefps.views.ExitOption;

public class QuitAction extends Action {
	private static final ExitOption exit = new ExitOption();

	@Override
	public ICLIControleur execute() {
		super.execute();
		return exit;
	}
}
