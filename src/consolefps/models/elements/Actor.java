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
			int y = getPosition().getY() + 1;
			getPosition().setY(y);

		}
		if (sens == Sens.DROITE) {
			int x = getPosition().getX() + 1;
			getPosition().setX(x);
		}
		if (sens == Sens.GAUCHE) {
			int x = getPosition().getX() - 1;
			getPosition().setX(x);
		}
		if (sens == Sens.HAUT) {
			int y = getPosition().getY() - 1;
			getPosition().setY(y);
		}

	}

	public Position positionSuivante(final Sens leSens) {
		Position laPositionSuivante = this.getPosition();

		if (leSens.equals(Sens.BAS)) {
			int x = getPosition().getX();
			int y = getPosition().getY() + 1;
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);

		}
		if (leSens.equals(Sens.DROITE)) {
			int x = getPosition().getX() + 1;
			int y = getPosition().getY();
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);
		}
		if (leSens.equals(Sens.GAUCHE)) {
			int x = getPosition().getX() - 1;
			int y = getPosition().getY();
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);
		}
		if (leSens == Sens.HAUT) {
			int x = getPosition().getX();
			int y = getPosition().getY() - 1;
			laPositionSuivante.setX(x);
			laPositionSuivante.setY(y);
		}

		return laPositionSuivante;
	}

	@Override
	public abstract String afficher();

}
