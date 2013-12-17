package consolefps.models.elements.arme;

import consolefps.models.Position;

public class Hache extends Arme {

	public Hache(final int x, final int y) {
		super(x, y);

	}

	public Hache(final Position position) {
		super(position);
	}

	@Override
	public String afficher() { // affiche l'arme Hache sur la grille avec un h
		return "[h]";

	}
}
