/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import consolefps.models.Grille;
import consolefps.models.Sens;
import consolefps.models.elements.Joueur;
import consolefps.models.elements.Zombie;
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
    private final List<Decor> decors;
    private Menu menu;
    private Hache haches;
    private Fusilapompe fusilapompes;
    private Revolver6coups revolver6coups;
    private Vitre vitres;
    
    private final static Commande BAS = new Commande("bas");
    private final static Commande HAUT = new Commande("haut");
    private final static Commande GAUCHE = new Commande("gauche");
    private final static Commande DROITE = new Commande("droite");
    private final static Commande EXIT = new Commande("exit");
    
    public Jeux(){
        this.joueur = new Joueur(1,1);
        this.grille = new Grille();
        this.zombies = new LinkedList<Zombie>();
        this.haches = new Hache(3,2);
        this.fusilapompes = new Fusilapompes(4,2);
        this.revolver6coups = new Revolver6coups(4,4);
        this.vitres = new Vitre (3,1);
        this.grille.ajouterElement(joueur);
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

    void deplacer(Joueur joueur, Sens sens) {
        this.joueur.deplacer(sens);
    }
    
    public Hache getGrille() {
        return this.haches;
    }
    
    public Vitre getGrille () {
        return this.vitres;
    }
    
    public Fusilapompe getGrille() {
        return this.fusilapompes;
    }
    
    public Revolver6coups getGrille() {
        return this.revolver6coups;
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
