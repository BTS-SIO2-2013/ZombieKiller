/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

/**
 * 
 * @author krilivye
 */
public class Position {
	private int x;
	private int y;

	public Position(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Position :" + this.x + "," + this.y;

	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof Position) {
			Position autre = (Position) obj;
			if (this.x == autre.getX() && this.y == autre.getY()) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public double distance(final Position p) {
		return Math.sqrt(Math.pow(getY() - p.getY(), 2)
				+ Math.pow(getX() - p.getX(), 2));
	}

	public void deplacerSelonX(final int dx) {
		this.x += dx;

	}

	public void deplacerSelonY(final int dy) {
		this.y += dy;
	}
}
