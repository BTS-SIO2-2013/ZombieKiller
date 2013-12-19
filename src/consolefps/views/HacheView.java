package consolefps.views;

import consolefps.models.elements.Elements;
import consolefps.models.elements.arme.Hache;

public class HacheView extends View {

	@Override
	public String afficher(final Elements hache) { // affiche l'arme Hache sur
		if (hache instanceof Hache) { // la grille avec un h
			return "[h]";
		}
		return "";
	}
}
