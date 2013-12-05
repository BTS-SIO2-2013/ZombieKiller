package consolefps.bonus;

import consolefps.models.Position;

public class TrousseDeSoin extends Bonus{

	public TrousseDeSoin(Position position) {
		super(position);
	}
	
	public TrousseDeSoin(int x, int y) {
		super(x, y);
	}
	
	@Override
	public String afficher() {
		return "[s]";
	}
}
