/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

/**
 *
 * @author krilivye
 */
public class Commande {
    
    private String commande;

    public Commande(String choix) {
        this.commande = choix;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Commande){
            Commande autre = (Commande) obj;
            return this.commande.equals(autre.getCommande());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.commande != null ? this.commande.hashCode() : 0);
        return hash;
    }

    private String getCommande() {
        return this.commande;
    }
    
    
    
}
