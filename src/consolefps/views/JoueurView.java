/**
 * 
 */
package consolefps.views;

import consolefps.models.elements.Elements;
import consolefps.models.elements.Joueur;

/**
 * @author alexis
 * 
 */
public class JoueurView extends ElementsView {

	private Joueur joueur;

	/**
	 * 
	 */
	public JoueurView(final Joueur joueur) {
		setJoueur(joueur);
	}

	public JoueurView() {
		// TODO Auto-generated constructor stub
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public void setJoueur(final Joueur joueur) {
		this.joueur = joueur;
	}

	@Override
	public String afficher(final Elements joueur) {
		if (joueur instanceof Joueur) {
			return "[j]";
		}
		return "";
	}

}
