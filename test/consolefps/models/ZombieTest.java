/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import consolefps.models.elements.Zombie;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krilivye
 */
public class ZombieTest {
    
    public ZombieTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAfficherZombie() {
        //Arrange
        Zombie z = new Zombie(1,2);
        
        //Act
        String s = z.afficher();
        
        //Assert 
        assertEquals("[z]", s);
    }
}
