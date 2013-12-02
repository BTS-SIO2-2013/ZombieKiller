/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.views;

import consolefps.controllers.Commande;
import consolefps.controllers.ICLIControleur;
import consolefps.controllers.Menu;

/**
 *
 * @author krilivye
 */
public class noValideOptionMenu implements ICLIControleur {

    private ICLIControleur controleur;
    
    public noValideOptionMenu(Menu menu) {
        this.controleur = menu;
    }

    
    @Override
    public String affichage() {
        return "Votre option n'est pas valide!";
    }

    @Override
    public ICLIControleur traitementCommande(Commande commande) {
        return this.controleur;
    }
    
}
