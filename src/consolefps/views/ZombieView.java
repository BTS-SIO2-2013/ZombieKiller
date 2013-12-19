/**
 * 
 */
package consolefps.views;

import java.util.List;

import consolefps.models.elements.Elements;
import consolefps.models.elements.Zombie;

/**
 * @author alexis
 * 
 */
public class ZombieView extends ActorView {

	private List<Zombie> zombies;

	/**
	 * 
	 */
	public ZombieView(final List<Zombie> zombies) {
		setZombies(zombies);
	}

	public List<Zombie> getZombies() {
		return this.zombies;
	}

	public void setZombies(final List<Zombie> zombies) {
		this.zombies = zombies;
	}

	@Override
	public String afficher(final Elements zombie) {
		if (zombie instanceof Zombie) {
			return "[z]";
		}
		return "";
	}

}
