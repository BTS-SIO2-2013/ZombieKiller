/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.IPositionable;
import consolefps.models.Position;
import consolefps.views.IAffichage;

/**
 * 
 * @author krilivye
 */
public abstract class Elements implements IPositionable, IAffichage {

	private Position position;

	public Elements() {
	}

	public Elements(final Position position) {
		this.position = position;
	}

	public Elements(final int p_x, final int p_y) {
		setPosition(p_x, p_y);
	}

	@Override
	public Position getPosition() {
		return this.position;
	}

	@Override
	public void setPosition(final Position position) {
		this.position = position;
	}

	@Override
	public void setPosition(final int x, final int y) {
		this.position = new Position(x, y);
	}

}
