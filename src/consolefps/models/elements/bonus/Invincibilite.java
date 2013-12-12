package consolefps.models.elements.bonus;

import consolefps.models.Position;

public class Invincibilite extends Bonus {

	public Invincibilite(final Position position) {
		super(position);
	}

	public Invincibilite(final int x, final int y) {
		super(x, y);
	}

	@Override
	public String afficher() {
		return "[i]";
	}

}
