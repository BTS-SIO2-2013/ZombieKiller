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
public class InvincibiliteTest {
    
    public InvincibiliteTest() {
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
     * Test of afficher method, of class Invincibilite.
     */
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