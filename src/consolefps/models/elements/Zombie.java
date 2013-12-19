/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.Position;

/**
 * 
 * @author krilivye
 */
public class Zombie extends Actor {

	public Zombie(final Position position) {
		super(position);
	}

	public Zombie(final int x, final int y) {
		super(x, y);
	}

}
