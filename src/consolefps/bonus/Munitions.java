package consolefps.bonus;

import consolefps.models.Position;

public class Munitions extends Bonus {

	public Munitions(int x, int y) {
		super(x,y);
	}
	
	public Munitions(Position position) {
		super(position);
	}

	@Override
	public String afficher() {
		return "[m]";
	}

}
