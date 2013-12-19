/**
 * 
 */
package consolefps.views;

import consolefps.models.elements.Joueur;

/**
 * @author alexis
 * 
 */
public class JoueurView extends ActorView {

	private Joueur joueur;

	/**
	 * 
	 */
	public JoueurView(final Joueur joueur) {
		this.setJoueur(joueur);
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public void setJoueur(final Joueur joueur) {
		this.joueur = joueur;
	}

	@Override
	public String afficher() {
		return "[j]";
	}

}
