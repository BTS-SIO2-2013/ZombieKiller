package consolefps.controllers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import consolefps.controllers.actions.Action;

public class ControlleurTest {

	@Test
	public void testNeFaitRien() {
		// Arrange
		Controlleur unControlleur = new ControlleurImpl();
		Commande com = new Commande("attendre");
		Action uneAction = new Action();

		// Act
		unControlleur.ajouterCommandeAction(com, uneAction);

		// Assert
		assertTrue(unControlleur.getListDeCommandesActions().containsKey(com));
		assertTrue(unControlleur.getListDeCommandesActions().get(com) == uneAction);
	}

	@Test
	public void effectuerAction() {
		// Arrange
		Controlleur unControlleur = new ControlleurImpl();
		Commande com = new Commande("attendre");
		Action uneAction = new Action();
		unControlleur.ajouterCommandeAction(com, uneAction);

		// Act
		unControlleur.traitementCommande(com);
		unControlleur.traitementCommande(com);
		unControlleur.traitementCommande(com);

		// Assert
		assertTrue(uneAction.getNbExecute() == 3);
	}

	public class ControlleurImpl extends Controlleur {
		@Override
		public String affichage() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
