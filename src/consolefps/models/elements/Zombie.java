/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.Position;
import consolefps.views.IAffichage;

/**
 *
 * @author krilivye
 */
public class Zombie extends Actor implements  IAffichage{

    public Zombie(Position position) {
        super(position);
    }

    public Zombie(int x, int y) {
        super(x, y);
    }

    @Override
    public String afficher() {
        return "[z]";
    }
    
}
