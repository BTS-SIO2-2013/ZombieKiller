/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import java.util.LinkedList;
import java.util.List;

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

/**
 * 
 * @author krilivye
 */
public class Jeux implements ICLIControleur {

	private final Joueur joueur;
	private final Grille grille;
	private final List<Zombie> zombies;
	private final List<Bonus> bonus;
	private final List<Arme> armes;
	private final List<Decors> decors;
	private Menu menu;

	private final static Commande BAS = new Commande("bas");
	private final static Commande HAUT = new Commande("haut");
	private final static Commande GAUCHE = new Commande("gauche");
	private final static Commande DROITE = new Commande("droite");
	private final static Commande ATTENDRE = new Commande("attendre");
	private final static Commande EXIT = new Commande("exit");

	/**
     *
     */
	public Jeux() {
		this.grille = new Grille();
		this.zombies = new LinkedList<>();
		this.armes = new LinkedList<>();
		this.bonus = new LinkedList<>();
		this.decors = new LinkedList<>();
		this.joueur = new Joueur(1, 1);
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

	void deplacer(final Joueur joueur, final Sens sens) {
		// if(this.joueur.positionSuivante(sens))
		joueur.deplacer(sens);
	}

	@Override
	public ICLIControleur traitementCommande(final Commande commande) {
		if (Jeux.EXIT.equals(commande)) {
			return this.menu;
		}
		if (Jeux.ATTENDRE.equals(commande)) {
			// Ne fais rien
		}

		if (Jeux.BAS.equals(commande)) {
			if (this.grille.isValide(this.joueur.positionSuivante(Sens.BAS))) {
				this.joueur.deplacer(Sens.BAS);
			} else {
				System.out.println("Bim le mur!");
			}
		}
		if (Jeux.HAUT.equals(commande)) {
			if (this.grille.isValide(this.joueur.positionSuivante(Sens.HAUT))) {
				this.joueur.deplacer(Sens.HAUT);
			} else {
				System.out.println("Bim le mur!");
			}
		}
		if (Jeux.DROITE.equals(commande)) {
			if (this.grille.isValide(this.joueur.positionSuivante(Sens.DROITE))) {
				this.joueur.deplacer(Sens.DROITE);
			} else {
				System.out.println("Bim le mur!");
			}
		}
		if (Jeux.GAUCHE.equals(commande)) {
			if (this.grille.isValide(this.joueur.positionSuivante(Sens.GAUCHE))) {
				this.joueur.deplacer(Sens.GAUCHE);
			} else {
				System.out.println("Bim le mur!");
			}
		}

		// Compare la position du joueur a la position de chaque zombie, en cas
		// d'egalite la partie se termine.
		for (Zombie element : this.zombies) {
			if (this.joueur.getPosition().equals(element.getPosition())) {
				System.out.println("GAMEOVER!");
				return this.menu;
			}
		}

		if (Jeux.EXIT.equals(commande)) {
			return this.menu;
		}

		return this;
	}

	@Override
	public String affichage() {
		return this.grille.afficherGrille();

	}
}
