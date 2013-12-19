/**
 * 
 */
package consolefps.views;

import java.util.ArrayList;
import java.util.List;

import consolefps.models.elements.Elements;

/**
 * @author alexis
 * 
 */
public class ElementsView extends View {

	private JoueurView vueDesJoueurs = new JoueurView();
	private List<View> listeDesVues = new ArrayList<>();

	public ElementsView() {
		// TODO Auto-generated constructor stub
		this.listeDesVues.add(new JoueurView());
	}

	@Override
	public String afficher(final Elements objet) {
		for (View vue : this.listeDesVues) {
			return vue.afficher(objet);
		}
		return "";

	}
}
