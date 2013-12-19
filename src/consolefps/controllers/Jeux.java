/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import java.util.LinkedList;
import java.util.List;

import consolefps.controllers.actions.DeplacementAction;
import consolefps.controllers.actions.ExitAction;
import consolefps.controllers.actions.NeRienFaireAction;
import consolefps.models.Grille;
import consolefps.models.Sens;
import consolefps.models.elements.Joueur;
import consolefps.models.elements.Zombie;
import consolefps.models.elements.arme.Arme;
import consolefps.models.elements.arme.FusilAPompe;
import consolefps.models.elements.arme.Hache;
import consolefps.models.elements.arme.Revolver;
import consolefps.models.elements.bonus.Bonus;
import consolefps.models.elements.bonus.Invincibilite;
import consolefps.models.elements.bonus.Munitions;
import consolefps.models.elements.bonus.TrousseDeSoin;
import consolefps.models.elements.decors.Decors;
import consolefps.models.elements.decors.Mur;
import consolefps.models.elements.decors.Vitre;
import consolefps.views.GrilleView;
import consolefps.views.View;

/**
 * 
 * @author krilivye
 */
public class Jeux extends Controlleur {

	private final Joueur joueur;
	private final Grille grille;
	private final List<Zombie> zombies;
	private final List<Bonus> bonus;
	private final List<Arme> armes;
	private final List<Decors> decors;
	private Menu menu;
	private View view;

	private GrilleView viewGrille;

	/**
     *
     */
	public Jeux() {
		super();
		this.grille = new Grille();
		this.zombies = new LinkedList<>();
		this.armes = new LinkedList<>();
		this.bonus = new LinkedList<>();
		this.decors = new LinkedList<>();
		this.joueur = new Joueur(1, 1);

		this.view = new GrilleView(this.grille);

		this.viewGrille = new GrilleView(this.grille);

		initialiserLeJeux();

		ajouterCommandeAction(new Commande("bas"), new DeplacementAction(
				Sens.BAS, this));
		ajouterCommandeAction(new Commande("attendre"), new NeRienFaireAction(
				this));
		ajouterCommandeAction(new Commande("haut"), new DeplacementAction(
				Sens.HAUT, this));
		ajouterCommandeAction(new Commande("gauche"), new DeplacementAction(
				Sens.GAUCHE, this));
		ajouterCommandeAction(new Commande("droite"), new DeplacementAction(
				Sens.DROITE, this));
		ajouterCommandeAction(new Commande("exit"), new ExitAction(this.menu));
	}

	private void initialiserLeJeux() {
		ajouterDecors(new Mur(0, 0));
		ajouterDecors(new Mur(0, 1));
		ajouterDecors(new Mur(0, 2));
		ajouterDecors(new Mur(0, 3));
		ajouterDecors(new Mur(0, 4));
		ajouterDecors(new Mur(1, 0));
		getGrille().ajouterElement(this.joueur);
		ajouterBonus(new TrousseDeSoin(1, 2));
		ajouterBonus(new Invincibilite(1, 3));
		ajouterDecors(new Mur(1, 4));
		ajouterDecors(new Vitre(2, 0));
		ajouterArme(new Hache(2, 1));
		ajouterBonus(new Munitions(2, 2));
		ajouterDecors(new Mur(2, 3));
		ajouterDecors(new Mur(2, 4));
		ajouterDecors(new Mur(3, 0));
		ajouterArme(new FusilAPompe(3, 1));
		ajouterZombie(new Zombie(3, 2));
		ajouterArme(new Revolver(3, 3));
		ajouterDecors(new Mur(3, 4));
		ajouterDecors(new Mur(4, 0));
		ajouterDecors(new Mur(4, 1));
		ajouterDecors(new Mur(4, 2));
		ajouterDecors(new Mur(4, 3));
		ajouterDecors(new Mur(4, 4));
	}

	public Jeux(final Menu menu) {
		this();
		this.menu = menu;
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public Grille getGrille() {
		return this.grille;
	}

	public List<Zombie> getZombies() {
		return this.zombies;
	}

	public void ajouterZombie(final Zombie z) {
		this.zombies.add(z);
		this.grille.ajouterElement(z);
	}

	public void ajouterBonus(final Bonus b) {
		this.bonus.add(b);
		this.grille.ajouterElement(b);
	}

	public void ajouterArme(final Arme a) {
		this.armes.add(a);
		this.grille.ajouterElement(a);
	}

	public void ajouterDecors(final Decors d) {
		this.decors.add(d);
		this.grille.ajouterElement(d);
	}

	@Override
	public ICLIControleur traitementCommande(final Commande commande) {

		ICLIControleur ctrl = super.traitementCommande(commande);

		// Compare la position du joueur a la position de chaque zombie, en cas
		// d'egalite la partie se termine.
		for (Zombie element : this.zombies) {
			if (this.joueur.getPosition().equals(element.getPosition())) {
				System.out.println("GAMEOVER!");
				return this.menu;
			}
		}

		return ctrl;
	}

	public View getView() {
		return this.view;
	}

	@Override
	public String affichage() {
		return this.viewGrille.afficherGrille();
	}
}
