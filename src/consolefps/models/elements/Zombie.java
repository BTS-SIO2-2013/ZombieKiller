/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.Position;
import consolefps.models.elements.Elements;
import consolefps.views.IAffichage;

/**
 *
 * @author krilivye
 */
public class Zombie extends Elements implements  IAffichage{


    public Zombie(Position position) {
        super();
        this.setPosition(position);
    }

    public Zombie(int x, int y) {
        super();
        this.setPosition(x, y);
    }

    @Override
    public String afficher() {
        return "[z]";
    }
    
}
