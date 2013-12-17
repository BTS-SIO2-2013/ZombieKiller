package consolefps.models.elements.arme;

import consolefps.models.Position;
import consolefps.models.elements.Elements;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author krilivye
 */
public abstract class Arme extends Elements {

	public Arme(final Position position) {
		super(position);

	}

	public Arme(final int x, final int y) {
		super(x, y);
	}

}
