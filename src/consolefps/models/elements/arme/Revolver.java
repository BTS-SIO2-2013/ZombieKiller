package consolefps.models.elements.arme;

import consolefps.models.Position;

public class Revolver extends Arme {
	

    public Revolver(int x, int y) {
		super(x, y);
	}
    
    public Revolver(Position position) {
		super(position);
	}

	@Override
    public String afficher() {
        return "[r]";
    }

}
