/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements.arme;
import static org.junit.Assert.*;
import consolefps.models.elements.arme.FusilAPompe;

import org.junit.Test;


/**
 *
 * @author titou
 */
public class FusilAPompeTest {
    
    public FusilAPompeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testAfficherFusilAPompe() {
        //Arrange
        FusilAPompe p = new FusilAPompe(1,2);
        
        //Act
        String s = p.afficher();
        
        //Assert 
        assertEquals("[p]", s);
    }
    
}