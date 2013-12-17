/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

/**
 * 
 * @author krilivye
 */
public class Sens {
	public static final Sens BAS = new Sens(0, 1);
	public static final Sens DROITE = new Sens(1, 0);
	public static final Sens HAUT = new Sens(0, -1);
	public static final Sens GAUCHE = new Sens(-1, 0);
	public static final Sens ATTENDRE = new Sens(0, 0);

	private final int dx;
	private final int dy;

	private Sens(final int dx, final int dy) {
		this.dx = dx;
		this.dy = dy;
	}

	public Position positionSuivante(final Position pos) {

		int y = pos.getY();
		int x = pos.getX();

		return new Position(x + this.dx, y + this.dy);
	}

	public void deplacer(final Position pos) {
		pos.deplacerSelonX(this.dx);
		pos.deplacerSelonY(this.dy);
	}

}
