/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import consolefps.models.Grille;
import consolefps.models.Position;
import consolefps.models.Sens;
import consolefps.models.elements.Arme;
import consolefps.models.elements.FusilAPompe;
import consolefps.models.elements.Hache;
import consolefps.models.elements.Joueur;
import consolefps.models.elements.Revolver;
import consolefps.models.elements.Zombie;
import consolefps.models.elements.bonus.Bonus;
import consolefps.models.elements.bonus.Invincibilite;
import consolefps.models.elements.bonus.Munitions;
import consolefps.models.elements.bonus.TrousseDeSoin;
import consolefps.models.elements.decors.Decors;
import consolefps.models.elements.decors.Mur;
import consolefps.models.elements.decors.Vitre;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author krilivye
 */
public class Jeux implements ICLIControleur{

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
    private final static Commande EXIT = new Commande("exit");
    
    /**
     *
     */
    public Jeux(){
        this.grille = new Grille();
        this.zombies = new LinkedList<Zombie>();
        this.armes = new LinkedList<Arme>();
        this.bonus = new LinkedList<Bonus>();
        this.decors = new LinkedList<Decors>();
        this.joueur = new Joueur(1, 1);
        this.ajouterDecors(new Mur(0,0));
        this.ajouterDecors(new Mur(0,1));
        this.ajouterDecors(new Mur(0,2));
        this.ajouterDecors(new Mur(0,3));
        this.ajouterDecors(new Mur(0,4));
        this.ajouterDecors(new Mur(1,0));
        this.grille.ajouterElement(joueur);
        this.ajouterBonus(new TrousseDeSoin(1, 2));
        this.ajouterBonus(new Invincibilite(1, 3));
        this.ajouterDecors(new Mur(1,4));
        this.ajouterDecors(new Vitre(2,0));
        this.ajouterArme(new Hache(2,1));
        this.ajouterBonus(new Munitions(2,2));
        this.ajouterDecors(new Mur(2,3));
        this.ajouterDecors(new Mur(2,4));
        this.ajouterDecors(new Mur(3,0));
        this.ajouterArme(new FusilAPompe(3,1));
        this.ajouterZombie(new Zombie(3,2));
        this.ajouterArme(new Revolver(3,3));
        this.ajouterDecors(new Mur(3,4));
        this.ajouterDecors(new Mur(4,0));
        this.ajouterDecors(new Mur(4,1));
        this.ajouterDecors(new Mur(4,2));
        this.ajouterDecors(new Mur(4,3));
        this.ajouterDecors(new Mur(4,4));
    }
    public Jeux(Menu menu){
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
    
    public void ajouterZombie(Zombie z) {
        this.zombies.add(z);
        this.grille.ajouterElement(z);
    }
    public void ajouterBonus (Bonus b){
        this.bonus.add(b);
        this.grille.ajouterElement(b);
    }
    
    public void ajouterArme (Arme a){
        this.armes.add(a);
        this.grille.ajouterElement(a);
    }
    
    public void ajouterDecors (Decors d){
        this.decors.add(d);
        this.grille.ajouterElement(d);
    }

    void deplacer(Joueur joueur, Sens sens) {
        this.joueur.deplacer(sens);
    }

    @Override
    public ICLIControleur traitementCommande(Commande commande) {
        if (Jeux.BAS.equals(commande)){
            this.joueur.deplacer(Sens.BAS);
        }
        if (Jeux.HAUT.equals(commande)){
            this.joueur.deplacer(Sens.HAUT);
        }
        if(Jeux.GAUCHE.equals(commande)){
            this.joueur.deplacer(Sens.GAUCHE);
        }
        if(Jeux.DROITE.equals(commande)){
            this.joueur.deplacer(Sens.DROITE);
        }
        if (Jeux.EXIT.equals(commande)){
            return this.menu;
        }
        return this;
    }

    @Override
    public String affichage() {
        return this.grille.afficherGrille();
        
    }
}
