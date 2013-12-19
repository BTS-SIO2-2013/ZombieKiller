package consolefps.views;

import consolefps.models.Grille;
import consolefps.models.Position;
import consolefps.models.elements.Elements;

public class GrilleView extends View {
	//
	private Grille m_laGrille;

	public GrilleView(final Grille p_laGrille) {
		//
		setLaGrille(p_laGrille);
	}

	public String entete() {
		String str = " ";
		for (int i = 0; i < getLaGrille().getNbColonnes(); i++) {
			str += " " + i + " ";
		}
		return str + "\n";
	}

	public String afficherGrille() {
		String retour = entete();

		for (int y = 0; y < getLaGrille().getNbLignes(); y++) {
			retour += afficherLigne(y);
		}
		return retour;
	}

	private ElementsView vueDesElements = new ElementsView();

	public String afficherLigne(final int i) {
		String retour = "" + i;
		for (int x = 0; x < getLaGrille().getNbColonnes(); x++) {
			Position courante = new Position(x, i);

			boolean aAfficher = false;
			for (Elements objet : getLaGrille().getObjets()) {
				if (objet.getPosition().equals(courante)) {
					retour += this.vueDesElements.afficher(objet);
					aAfficher = true;
				}
			}
			if (!aAfficher) {
				retour += caseVide();
			}
		}
		return retour + "\n";
	}

	public String caseVide() {
		return "[ ]";
	}

	public Grille getLaGrille() {
		return this.m_laGrille;
	}

	public void setLaGrille(final Grille m_laGrille) {
		this.m_laGrille = m_laGrille;
	}
}
