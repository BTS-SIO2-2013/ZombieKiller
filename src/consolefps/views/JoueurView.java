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
	public JoueurView(Joueur joueur) {
		this.joueur = joueur;
	}
	
	@Override
	public String afficher() {
		return "[j]";
	}

}
