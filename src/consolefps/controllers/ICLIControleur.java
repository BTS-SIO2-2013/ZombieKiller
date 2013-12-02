/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

/**
 *
 * @author krilivye
 */
public interface ICLIControleur {

    public String affichage();
    public ICLIControleur traitementCommande(Commande commande);
    
}
