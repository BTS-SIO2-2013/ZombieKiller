/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements.arme;

import consolefps.models.Position;

/**
 * Affiche l'arme Fusil à Pompe, notifié [p]
 * 
 * @author Tristan Ferie
 */
public class FusilAPompe extends Arme {

	@Override

	public FusilAPompe(final Position position) {
		super(position);
	}

	public FusilAPompe(final int x, final int y) {
		super(x, y);
	}
}
