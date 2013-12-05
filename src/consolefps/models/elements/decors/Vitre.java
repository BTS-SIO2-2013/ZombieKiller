/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consolefps.models.elements.decors;

import consolefps.models.Position;

/**
 *
 * @author Kévin
 */
public class Vitre extends Decors {

    public Vitre(Position position) {
        super(position);
    }

    public Vitre(int x, int y) {
        super(x, y);
    }
    
    @Override
    public String afficher() {
            return "v";
    }
}
