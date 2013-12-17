/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consolefps.models.elements.decors;

import consolefps.models.Position;
import consolefps.models.elements.Elements;

/**
 *
 * @author Kévin
 */
public abstract class Decors extends Elements{

    @Override
    public abstract String afficher();

    public Decors(Position position) {
        super(position);
    }

    
    public Decors(int x, int y) {
        super(x, y);
    }
    
}
