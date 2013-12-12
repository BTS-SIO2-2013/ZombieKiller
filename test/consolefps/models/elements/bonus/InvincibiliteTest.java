/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements.bonus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author SpectroDT
 */
public class InvincibiliteTest {
    
    public InvincibiliteTest() {
    }
    
    @Test
    public void testAfficher() {
        //Arrange
        Invincibilite inv = new Invincibilite(1,2);
        
        //Act
        String s = inv.afficher();
        
        //Assert 
        assertEquals("[i]", s);
    }
}