package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Options;

public class OptionsAction extends Action {
	private static final Options options = new Options();

	@Override
	public ICLIControleur execute() {
		super.execute();
		return options;
	}
}
