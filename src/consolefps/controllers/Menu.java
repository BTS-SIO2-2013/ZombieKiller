/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import consolefps.views.ExitOption;
import consolefps.views.noValideOptionMenu;

/**
 *
 * @author krilivye
 */
public class Menu implements ICLIControleur{
    private final noValideOptionMenu noValideOptionMenu;
    private ICLIControleur jeux;
    private ICLIControleur options;
    private ICLIControleur exitOption;
    private Commande JEU;
    private Commande OPTIONS;
    private Commande EXIT;
    
    public Menu(){
        this.noValideOptionMenu = new noValideOptionMenu(this);
        this.jeux = new Jeux(this);
        this.options = new Options();
        this.exitOption = new ExitOption();
        this.JEU = new Commande("1");
        this.OPTIONS = new Commande("2");
        this.EXIT = new Commande("3");
    }   
           
    public ICLIControleur choisir(Commande com) {    
        
        if (com.equals(this.JEU)){
            return this.jeux;
        }
        
        if (com.equals(this.OPTIONS)){
            return this.options;
        }
        
        if (com.equals(this.EXIT)){
            return this.exitOption;
        }

        return this.noValideOptionMenu;
    }

    @Override
    public String affichage() {
        return "Super Zombie Killer\n"
                    +"1 - Jouer\n"
                    +"2 - Options\n"
                    +"3 - Sortir\n";    
    }

    @Override
    public ICLIControleur traitementCommande(Commande commande) {
        return this.choisir(commande);
    }
}
