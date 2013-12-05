/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements.arme;

import consolefps.models.Position;

/**
 * Affiche l'arme Fusil à Pompe, notifié [p]
 * @author Tristan Ferie
 */
public class FusilAPompe extends Arme{
    
    
   public String afficher(){
       return "[p]";
    }

    public FusilAPompe(Position position) {
        super(position);
    }

    public FusilAPompe(int x, int y) {
        super(x, y);
    }
}
