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
		if (sens == Sens.BAS) {
			int y = this.getPosition().getY() + 1;
			this.getPosition().setY(y);

		}
		if (sens == Sens.DROITE) {
			int x = this.getPosition().getX() + 1;
			this.getPosition().setX(x);
		}
		if (sens == Sens.GAUCHE) {
			int x = this.getPosition().getX() - 1;
			this.getPosition().setX(x);
		}
		if (sens == Sens.HAUT) {
			int y = this.getPosition().getY() - 1;
			this.getPosition().setY(y);
		}

	}

	public Position positionSuivante(final Sens leSens) {
		Position laPositionSuivante = new Position(0, 0);

		if (leSens.equals(Sens.BAS)) {
			int x = this.getPosition().getX();
			int y = this.getPosition().getY() + 1;
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);

		}
		if (leSens.equals(Sens.DROITE)) {
			int x = this.getPosition().getX() + 1;
			int y = this.getPosition().getY();
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);
		}
		if (leSens.equals(Sens.GAUCHE)) {
			int x = this.getPosition().getX() - 1;
			int y = this.getPosition().getY();
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);
		}
		if (leSens == Sens.HAUT) {
			int x = this.getPosition().getX();
			int y = this.getPosition().getY() - 1;
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);
		}

		return laPositionSuivante;
	}

	@Override
	public abstract String afficher();

}
