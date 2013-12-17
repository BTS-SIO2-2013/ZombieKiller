package consolefps.models.elements.arme;

import consolefps.models.Position;

public class Revolver extends Arme {

	public Revolver(final int x, final int y) {
		super(x, y);
	}

	public Revolver(final Position position) {
		super(position);
	}

	@Override
	public String afficher() {
		return "[r]";
	}

}
