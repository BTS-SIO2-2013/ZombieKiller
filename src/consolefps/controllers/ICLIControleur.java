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
	public ICLIControleur traitementCommande(Commande commande);

	public String afficherViews();

	public String affichage();

}
