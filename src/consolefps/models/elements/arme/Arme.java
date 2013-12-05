package consolefps.models.elements.arme;

import consolefps.models.Position;
import consolefps.models.elements.Elements;
import consolefps.views.IAffichage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krilivye
 */
public abstract class  Arme extends Elements{

    public Arme(Position position) {
		super(position);
		
	}
    public Arme(int x,int y){
    	super(x, y);
    }
	@Override
    public abstract String afficher();
        
    
    
}
