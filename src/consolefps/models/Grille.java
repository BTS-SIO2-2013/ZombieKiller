/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import java.util.ArrayList;
import java.util.List;

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

	public String afficherGrille() {
		String retour = entete();

		for (int y = 0; y < this.nbLignes; y++) {
			retour += afficherLigne(y);
		}
		return retour;
	}

	public void ajouterElement(final Elements e) {
		this.objets.add(e);
	}

	public String entete() {
		String str = " ";
		for (int i = 0; i < this.nbColonnes; i++) {
			str += " " + i + " ";
		}
		return str + "\n";
	}

	public String caseVide() {
		return "[ ]";
	}

	public String afficherLigne(final int i) {
		String retour = "" + i;
		for (int x = 0; x < this.nbColonnes; x++) {
			Position courante = new Position(x, i);

			boolean aAfficher = false;
			for (Elements objet : this.objets) {
				if (objet.getPosition().equals(courante)) {
					retour += objet.afficher();
					aAfficher = true;
				}
			}
			if (!aAfficher) {
				retour += caseVide();
			}
		}
		return retour + "\n";
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
		if (laPosition.getX() > getNbColonnes()) {
			return false;
		}
		if (laPosition.getY() > getNbLignes()) {
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

		boolean valide = true;
		valide = isDansLaGrille(laPosition);
		valide = !isDecors(laPosition);

		return valide;

	}

}
