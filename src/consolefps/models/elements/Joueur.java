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
public class Joueur extends Actor {

	public Joueur(final Position position) {
		super(position);
	}

	public Joueur(final int x, final int y) {
		super(x, y);
	}

	public void afficherPosition() {
		System.out.println(this.getPosition());
	}

	@Override
	public String afficher() {
		return "[j]";
	}
}
