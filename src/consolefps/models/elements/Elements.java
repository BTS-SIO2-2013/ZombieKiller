/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.IPositionable;
import consolefps.models.Position;
import consolefps.views.IAffichage;

/**
 *
 * @author krilivye
 */
public abstract class Elements implements IPositionable,IAffichage {

    private Position position;

    public Elements() {
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void setPosition(int x, int y) {
        this.position = new Position(x, y);
    }
    
}
