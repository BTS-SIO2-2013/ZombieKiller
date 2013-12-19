/*
http://infinitest.github.io * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import consolefps.models.elements.Actor;
import consolefps.models.elements.Elements;
import consolefps.models.elements.decors.Decors;

/**
 * 
 * @author krilivye
 */
public class Grille {
	private int nbLignes;
	private int nbColonnes;
	private List<Elements> objets;

	public Grille(final int nbColonnes, final int nbLignes) {
		this();
		this.nbLignes = nbLignes;
		this.nbColonnes = nbColonnes;
	}

	public int getNbLignes() {
		return this.nbLignes;
	}

	public int getNbColonnes() {
		return this.nbColonnes;
	}

	public Grille() {
		this.nbLignes = 5;
		this.nbColonnes = 5;
		this.objets = new ArrayList<>();
	}

	public void ajouterElement(final Elements e) {
		this.objets.add(e);
	}

	public List<Elements> getElements() {
		return this.objets;
	}

	public void setNblignes(final int i) {
		this.nbLignes = i;
	}

	public void setNbColonnes(final int i) {
		this.nbColonnes = i;
	}

	public boolean isDecors(final Position laPosition) {

		for (Elements element : this.objets) {
			if (laPosition.equals(element.getPosition())) {
				return element instanceof Decors;
			}
		}
		return false;
	}

	public boolean isDansLaGrille(final Position laPosition) {
		if (laPosition.getX() >= getNbColonnes()) {
			return false;
		}
		if (laPosition.getY() >= getNbLignes()) {
			return false;
		}
		if (laPosition.getX() < 0) {
			return false;
		}
		if (laPosition.getY() < 0) {
			return false;
		}
		return true;
	}

	public boolean isValide(final Position laPosition) {
		return isDansLaGrille(laPosition) && !isDecors(laPosition);
	}

	public List<Position> casesSuivantes(final Actor acteur) {

		List<Position> cases = new LinkedList<>();
		if (isValide(acteur.positionSuivante(Sens.BAS))) {
			cases.add(acteur.positionSuivante(Sens.BAS));

		}
		if (isValide(acteur.positionSuivante(Sens.HAUT))) {
			cases.add(acteur.positionSuivante(Sens.HAUT));
		}

		if (isValide(acteur.positionSuivante(Sens.GAUCHE))) {
			cases.add(acteur.positionSuivante(Sens.GAUCHE));
		}
		if (isValide(acteur.positionSuivante(Sens.DROITE))) {
			cases.add(acteur.positionSuivante(Sens.DROITE));
		}
		return cases;
	}

	public List<Elements> getObjets() {
		return this.objets;
	}

}
