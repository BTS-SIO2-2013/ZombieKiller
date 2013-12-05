/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.Sens;
import consolefps.views.IAffichage;
import consolefps.models.Position;

/**
 *
 * @author krilivye
 */
public class Joueur extends Actor implements IAffichage{

    public Joueur(Position position) {
        super(position);
    }

    public Joueur(int x, int y) {
        super(x, y);
    }
    
    
    
    public void afficherPosition() {
        System.out.println(this.getPosition());
    }

    @Override
    public String afficher() {
        return "[J]";
    }

    public void deplacer(Sens sens) {
        if (sens == Sens.BAS){
            int y = this.getPosition().getY()+1;
            this.getPosition().setY(y);
            
        }
        if (sens == Sens.DROITE){
            int x = this.getPosition().getX()+1;
            this.getPosition().setX(x);
        }
        if (sens == Sens.GAUCHE){
            int x = this.getPosition().getX()-1;
            this.getPosition().setX(x);
        }
        if (sens == Sens.HAUT){
            int y = this.getPosition().getY()-1;
            this.getPosition().setY(y);
        }
        
        
    }
}
