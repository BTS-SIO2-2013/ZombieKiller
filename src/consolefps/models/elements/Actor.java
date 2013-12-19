/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consolefps.models.elements;

import consolefps.models.Position;
import consolefps.models.Sens;

/**
 * 
 * @author zeph
 */
public abstract class Actor extends Elements {

	public Actor(final Position position) {
		super(position);
	}

	public Actor(final int x, final int y) {
		super(x, y);
	}

	public void deplacer(final Sens sens) {
		sens.deplacer(getPosition());
	}

	public Position positionSuivante(final Sens leSens) {
		return leSens.positionSuivante(getPosition());
	}

}
