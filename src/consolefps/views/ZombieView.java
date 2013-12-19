/**
 * 
 */
package consolefps.views;

import java.util.List;

import consolefps.models.elements.Zombie;

/**
 * @author alexis
 *
 */
public class ZombieView extends ActorView {
		
	private List <Zombie> zombies;

	/**
	 * 
	 */
	public ZombieView(List<Zombie> zombies) {
		this.zombies = zombies;
	}
	
	@Override
	public String afficher() {
		return "[z]";
	}

}
