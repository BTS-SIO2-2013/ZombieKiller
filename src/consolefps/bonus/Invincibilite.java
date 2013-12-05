package consolefps.bonus;

import consolefps.models.Position;

public class Invincibilite extends Bonus {

	public Invincibilite(Position position) {
		super(position);
	}
	
	public Invincibilite(int x, int y) {
		super(x,y);
	}
	
	@Override
	public String afficher() {
		return "[i]";
	}

}
