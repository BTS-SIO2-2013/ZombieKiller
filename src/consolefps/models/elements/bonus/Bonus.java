package consolefps.models.elements.bonus;
import consolefps.models.Position;
import consolefps.models.elements.Elements;

public abstract class Bonus extends Elements {

	public Bonus(Position position) {
        super(position);
    }

    public Bonus(int x, int y) {
        super(x,y);
    }

	@Override
	public abstract String afficher();

}
