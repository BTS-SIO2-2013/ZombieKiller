package consolefps.controllers.actions;

import consolefps.controllers.ICLIControleur;

public class Action {

	private int nbExecute;

	public Action() {
		this.nbExecute = 0;
	}

	public ICLIControleur execute() {
		this.nbExecute += 1;
		return null;
	}

	public int getNbExecute() {
		return this.nbExecute;
	}
}
