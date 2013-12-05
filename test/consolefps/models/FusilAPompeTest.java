/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import consolefps.models.elements.arme.FusilAPompe;
import consolefps.models.elements.Zombie;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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