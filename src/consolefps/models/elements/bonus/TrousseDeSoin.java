package consolefps.models.elements.bonus;

import consolefps.models.Position;

public class TrousseDeSoin extends Bonus {

	public TrousseDeSoin(final Position position) {
		super(position);
	}

	public TrousseDeSoin(final int x, final int y) {
		super(x, y);
	}

	@Override
	public String afficher() {
		return "[s]";
	}
}
