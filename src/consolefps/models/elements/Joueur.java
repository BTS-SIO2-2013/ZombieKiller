/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.Sens;
import consolefps.models.Position;

/**
 *
 * @author krilivye
 */
public class Joueur extends Actor{

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
        return "[j]";
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

    public Position positionSuivante(Sens leSens) {
        Position laPositionSuivante = new Position(0, 0);
        
        if (leSens.equals(Sens.BAS)){
            int y = this.getPosition().getY()+1;
            laPositionSuivante.setX(y);
            
        }
        if (leSens.equals(Sens.DROITE)){
            int x = this.getPosition().getX()+1;
            laPositionSuivante.setX(x);
        }
        if (leSens.equals(Sens.GAUCHE)){
            int x = this.getPosition().getX()-1;
            laPositionSuivante.setX(x);
        }
        if (leSens ==Sens.HAUT){
            int y = this.getPosition().getY()-1;
            laPositionSuivante.setY(y);
        }
        
        return laPositionSuivante;
    }
}
