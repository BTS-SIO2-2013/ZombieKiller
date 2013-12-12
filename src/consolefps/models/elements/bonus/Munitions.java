package consolefps.models.elements.bonus;

import consolefps.models.Position;

public class Munitions extends Bonus {

	public Munitions(final int x, final int y) {
		super(x, y);
	}

	public Munitions(final Position position) {
		super(position);
	}

	@Override
	public String afficher() {
		return "[m]";
	}

}
