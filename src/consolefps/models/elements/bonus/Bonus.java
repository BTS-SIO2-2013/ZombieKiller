package consolefps.models.elements.bonus;

import consolefps.models.Position;
import consolefps.models.elements.Elements;

public abstract class Bonus extends Elements {

	public Bonus(final Position position) {
		super(position);
	}

	public Bonus(final int x, final int y) {
		super(x, y);
	}

	@Override
	public abstract String afficher();

}
