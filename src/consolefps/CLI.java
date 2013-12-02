/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps;

import consolefps.controllers.Commande;
import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Menu;
import consolefps.views.ExitOption;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krilivye
 */
public class CLI{
    
    private static BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
    
    private BufferedReader in;
    
    private ICLIControleur controlleur;
    
    
    public CLI() {
       this.in = systemIn;
       this.controlleur = new Menu();
    }

    public BufferedReader getInput() {
        return this.in;
    }

    public void setInput(BufferedReader in) {
        this.in = in;
    }
    
    public static BufferedReader getSystemInput(){
        return systemIn;
    }
    
    public String readInput(){
        String sortie ="";
        try {
            sortie = this.in.readLine();            
        } catch (IOException ex) {
            Logger.getLogger(CLI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortie;
    }
    
    public static String readSystemInput(){
        String sortie ="";
        try {
            sortie = getSystemInput().readLine();            
        } catch (IOException ex) {
            Logger.getLogger(CLI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortie;
    }

    public boolean execute() {
        System.out.println(this.controlleur.affichage());
        if(this.controlleur instanceof ExitOption){
            return false;
        }
        String choix = readInput();
        Commande com = new Commande(choix);
        ICLIControleur control = this.controlleur.traitementCommande(com);
        this.controlleur = control;
        return true;
    }

    public void setControlleur(ICLIControleur controlleur) {
        this.controlleur = controlleur;
    }

    public ICLIControleur getControlleur() {
        return this.controlleur;
    }
}
