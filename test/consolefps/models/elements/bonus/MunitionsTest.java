/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements.bonus;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SpectroDT
 */
public class MunitionsTest {
    
    public MunitionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of afficher method, of class Munitions.
     */
    @Test
    public void testAfficher() {
        //Arrange
        Munitions ammo = new Munitions(1,2);
        
        //Act
        String s = ammo.afficher();
        
        //Assert 
        assertEquals("[m]", s);
    }
}