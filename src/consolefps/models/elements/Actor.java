/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consolefps.models.elements;

import consolefps.models.Position;

/**
 *
 * @author zeph
 */
public abstract class Actor extends Elements {

    public Actor(Position position) {
        super(position);
    }

    public Actor(int x, int y) {
        super(x, y);
    }

    @Override
    public abstract String afficher();
    
    
}
